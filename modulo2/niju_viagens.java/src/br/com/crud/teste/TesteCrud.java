package br.com.crud.teste;

import br.com.crud.dao.ClienteDAO;
import br.com.crud.model.Cliente;

public class TesteCrud {

	public static void main(String[] args) {
	
ClienteDAO clienteDAO = new ClienteDAO();
		
		// ------------ Cria um contato e salva no banco
		/*Cliente cliente = new Cliente();
		cliente.setNome("Julia G Duarte");
		cliente.setIdade(20);
		cliente.setCpf("1234568792050");
		cliente.setEmail("julia.duarte@gmail.com");
		
		clienteDAO.save(cliente);*/
		
		// ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
		Cliente cliente1 = new Cliente();
		cliente1.setIdCliente(1);
		cliente1.setNome("Andressa A Santos");
		cliente1.setIdade(26);
		cliente1.setCpf("12345687911");
		cliente1.setEmail("dessa.santos@gmail.com");
		
		clienteDAO.update(cliente1);
		
		// ------------ Remove o contato com id
		 //clienteDAO.removeById(1);
		
		// ------------ Lista todos os contatos do banco de dados
		for (Cliente c : clienteDAO.getCliente()) {
			System.out.println("Nome: " + c.getNome());
			System.out.println("Idade: " + c.getIdade());
			System.out.println("Cpf: " + c.getCpf());
            System.out.println("Email: " + c.getEmail());
		}
	}

}
