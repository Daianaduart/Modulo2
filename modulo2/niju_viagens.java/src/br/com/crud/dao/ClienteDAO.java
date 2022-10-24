package br.com.crud.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.crud.factory.ConnectionFactory;

import br.com.crud.model.Cliente;

public class ClienteDAO {
	
	public void save(Cliente cliente) {
		/*
		 * Isso é uma sql comum, os ? são os parâmetros que nós vamos adicionar na base
		 * de dados
		 */

		String sql = "INSERT INTO Cliente(Nome, idade, Cpf, Email)" + "VALUES(?,?,?,?)";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm =(PreparedStatement)conn.prepareStatement(sql);

			// Adicionar o valor do primeiro parámetro da sql
			pstm.setString(1, cliente.getNome());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setInt(2, cliente.getIdade());

			// Adicionar o valor do terceiro parâmetro da sql
			pstm.setString(3, cliente.getCpf());
			
			//Adiciona o valor do quarto parâmetro da sql
			pstm.setString(4, cliente.getEmail());
			
			// Executar a sql para inserção dos dados
			pstm.execute();
			System.out.println("Cliente salvo com Sucesso!");		

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

	public void removeById(int IdCliente) {
		String sql = "DELETE FROM Cliente WHERE IdCliente = ?";

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm =(PreparedStatement)conn.prepareStatement(sql);

			pstm.setInt(1, IdCliente);

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

	public void update(Cliente cliente) {
		String sql = "UPDATE Cliente SET Nome = ?, idade = ?, Cpf = ?,Email = ?" + "WHERE IdCliente = ?";
		
		

		Connection conn = null;
		PreparedStatement pstm = null;

		try {
			// Cria uma conexão com o banco
			conn = ConnectionFactory.createConnectionToMySQL();

			// Cria um PreparedStatement, classe usada para executar a query
			pstm =(PreparedStatement)conn.prepareStatement(sql);

			// Adiciona o valor do primeiro parâmetro da sql
			pstm.setString(1, cliente.getNome());

			// Adicionar o valor do segundo parâmetro da sql
			pstm.setInt(2, cliente.getIdade());
			
			//Adiciona o valor do terceiro parâmetro da sql
			pstm.setString(3, cliente.getCpf());

			// Adicionar o valor do quarto parâmetro da sql
			pstm.setString(4, cliente.getEmail());
			
			pstm.setInt(5, cliente.getIdCliente());

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

	public List<Cliente> getCliente() {

		String sql = "SELECT * FROM Cliente";

		List<Cliente> cliente = new ArrayList<Cliente>();

		Connection conn = null;
		PreparedStatement pstm = null;

		// Classe que vai recuperar os dados do banco de dados
		ResultSet rset = null;

		try {
			conn = ConnectionFactory.createConnectionToMySQL();
			
			pstm =(PreparedStatement)conn.prepareStatement(sql);

			rset = pstm.executeQuery();

			// Enquanto existir dados no banco de dados, faça
			while (rset.next()) {
				Cliente cliente1 = new Cliente();

				// Recupera o id do banco e atribui ele ao objeto
				cliente1.setIdCliente(rset.getInt("IdCliente"));

				// Recupera o nome do banco e atribui ele ao objeto
				cliente1.setNome(rset.getString("Nome"));

				// Recupera a idade do banco e atribui ele ao objeto
				cliente1.setIdade(rset.getInt("Idade"));

				// Recupera a data do banco e atribui ela ao objeto
				cliente1.setCpf(rset.getString("Cpf"));
				
				cliente1.setEmail(rset.getString("Email"));

				// Adiciona o contato recuperado, a lista de contatos
				cliente.add((Cliente) cliente);
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
		return cliente;
	}
}