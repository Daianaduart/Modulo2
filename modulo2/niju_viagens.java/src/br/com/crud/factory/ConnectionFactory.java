package br.com.crud.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectionFactory {
	//Nome do usuário do mysql
	   private static final String  USERNAME = "root";
	 
	   //Senha do mysql
	   private static final String PASSWORD = "Dai142817";
	 
	   //Dados de caminho, porta e nome da base de dados que irá ser feita a conexão
	   private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/niju_crud";
	     

	//   * Cria uma conexão com o banco de dados MySQL utilizando o nome de usuário e senha fornecidos
	//   * @param username
	//   * @param senha
	//   * @return uma conexão com o banco de dados
	//   * @throws Exception

	   public static Connection createConnectionToMySQL() throws Exception{ 
		   Class.forName("com.mysql.jdbc.Driver");
	     
		   // Cria a conexão com o banco de dados
		   
	      Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
	 
	      return connection;
	   }
	   
	  public static void main(String[] args) throws Exception {
		  Connection conn = createConnectionToMySQL();
		  if(conn!= null) {
			  System.out.println("Conexão Obtida com Sucesso!");
			  conn.close();
		  }
	  }

	public PreparedStatement prepareStatement(String sql) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
