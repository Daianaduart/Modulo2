package br.com.crud.teste;

import br.com.crud.dao.ViagemDAO;
import br.com.crud.model.Viagem;

public class TesteCrudViagem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ViagemDAO viagemDAO = new ViagemDAO();
		
		// ------------ Cria um contato e salva no banco
		Viagem viagem = new Viagem();
		viagem.setDestino("Pernambuco");
		viagem.setIda("11/12/22");
		viagem.setVolta("28/12/22");
		
		viagemDAO.save(viagem);
		
		// ------------ Atualiza o contato com id = 1 com os dados do objeto contato1
		/*Viagem viagem1 = new Viagem();
		viagem1.setIdViagem(1);
		viagem.setDestino("Recife");
		viagem.setIda("01/03/22");
		viagem.setVolta("05/03/22");
		
		
		viagemDAO.update(viagem);*/
		
		// ------------ Remove o contato com id
		// viagemDAO.removeById(1);
		
		// ------------ Lista todos os contatos do banco de dados
		for (Viagem c : viagemDAO.getViagem()) {
			System.out.println("Destino: " + c.getDestino()); 
			
		}   
	}

}
