package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;
import br.com.crud.model.Viagem;

public class ViagemDAO {
	public void save (Viagem viagem) {
		String sql = "INSERT INTO Viagem(Destino, Ida, volta)" + "VALUES(?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm = conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parámetro da sql
			pstm.setString(1, viagem.getDestino());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setString(2, viagem.getIda());

			// Adicionar o valor do terceiro parâmetro da sql
			pstm.setString(3, viagem.getVolta());
			
			
			// Executar a sql para inserção dos dados
			pstm.execute();
			System.out.println("Viagem salvo com Sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// fecha as conexões
			try {
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}	
	/*
	 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
	 * de dados
	 */

	

public void removeById(int IdViagem) {
	String sql = "DELETE FROM Viagem WHERE IdViagem = ?";

	Connection conn = null;
	PreparedStatement pstm = null;

	try {
		conn = ConnectionFactory.createConnectionToMySQL();

		pstm = conn.prepareStatement(sql);

		pstm.setInt(1, IdViagem);

		pstm.execute();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (pstm != null) {
				pstm.close();
			}

			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public void update(Viagem viagem) {
	String sql = "UPDATE Viagem SET Destino = ?, Ida = ?, volta = ?  WHERE IdViagem = ?";

	Connection conn = null;
	PreparedStatement pstm = null;

	try {
		// Cria uma conexão com o banco
		conn = ConnectionFactory.createConnectionToMySQL();

		// Cria um PreparedStatement, classe usada para executar a query
		pstm = conn.prepareStatement(sql);

		// Adiciona o valor do primeiro parâmetro da sql
		pstm.setString(1, viagem.getDestino());

		// Adicionar o valor do segundo parâmetro da sql
		pstm.setString(2, viagem.getIda());

		// Adicionar o valor do terceiro parâmetro da sql
		pstm.setString(3, viagem.getVolta());
		

		pstm.setInt(4, viagem.getIdViagem());

		// Executa a sql para inserção dos dados
		pstm.execute();

	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		// Fecha as conexões
		try {
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

public List<Viagem> getViagem() {

	String sql = "SELECT * FROM Viagem";

	List<Viagem> viagem = new ArrayList<Viagem>();

	Connection conn = null;
	PreparedStatement pstm = null;

	// Classe que vai recuperar os dados do banco de dados
	ResultSet rset = null;

	try {
		conn = ConnectionFactory.createConnectionToMySQL();

		pstm = conn.prepareStatement(sql);

		rset = pstm.executeQuery();

		// Enquanto existir dados no banco de dados, faça
		while (rset.next()) {
			Viagem viagem1 = new Viagem();

			// Recupera o id do banco e atribui ele ao objeto
			viagem1.setIdViagem(rset.getInt("IdViagem"));

			// Recupera o nome do banco e atribui ele ao objeto
			viagem1.setDestino(rset.getString("Destino"));

			// Recupera a idade do banco e atribui ele ao objeto
			viagem1.setIda(rset.getString("Ida"));

			// Recupera a data do banco e atribui ela ao objeto
			viagem1.setVolta(rset.getString("Volta"));
			

			// Adiciona o contato recuperado, a lista de contatos
			viagem.add((Viagem) viagem);
		}
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		try {
			if (rset != null) {
				rset.close();
			}
			if (pstm != null) {
				pstm.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	return viagem;
}

}
