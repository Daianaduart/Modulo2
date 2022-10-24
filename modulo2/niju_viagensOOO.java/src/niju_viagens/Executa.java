package niju_viagens;

import java.util.Scanner;

public class Executa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner entrada= new Scanner(System.in);
		
		System.out.println("=====Cadastro Cliente=====");
		
		Cliente cliente = new Cliente();
		System.out.println("Informe seu Nome: ");
		cliente.setNome(entrada.nextLine());
		System.out.println("Informe seu CPF: ");
		cliente.setCpf(entrada.nextLine());
		System.out.println("Informe sua Idade: ");
		cliente.setIdade(entrada.nextLine());
		System.out.println("Informe seu Email: ");
        cliente.setEmail(entrada.nextLine());
		
		
		System.out.println("======Cadastro Viagem======");
		
		Viagem destino = new Viagem();
		System.out.println("Informe seu destino: ");
		destino.setDestino(entrada.nextLine());
		System.out.println("Informe sua data de ida: ");
		destino.setIda(entrada.nextLine());
		System.out.println("Informe sua data de volta: ");
		destino.setVolta(entrada.nextLine());
		
		System.out.println("Escolha um pacote de viagem:");
		System.out.println("[1] Passagem aerea ida e volta, classe economica R$ 1.100,00");
		System.out.println("[2] Passagem aerea ida e volta, classe executiva R$ 1.500,00");
		System.out.println("[3] Passagem aerea ida e volta, primeira classe R$ 2.000,00");
		destino.setPreco(entrada.nextInt());
		
		System.out.println("==========Niju Viagens========");
		System.out.println("------------------------------------");
		System.out.println("==========Dados do Cliente==========");
		System.out.println("Nome: " + cliente.getNome());
		System.out.println("CPF: " + cliente.getCpf());
		System.out.println("Email: " + cliente.getEmail());
		
		
		System.out.println("=========Dados da sua Viagem=========");
		System.out.println("Destino: " + destino.getDestino());
		System.out.println("Data de ida: " + destino.getIda());
		System.out.println("Data de volta: " + destino.getVolta());
		if (destino.getPreco()== 1) {
			System.out.println("Passagem aerea ida e volta, classe econômica, valor a pagar: R$1.100,00");
		}
		else if (destino.getPreco() == 2){
			System.out.println("Passagem aerea ida e volta, classe executiva, valor a pagar R$1.500,00");
		}
		else {
			System.out.println("Passagem aerea ida e volta, primeira classe, valor a pagar R$2.000,00");
		}
		entrada.close();

	}

	}


