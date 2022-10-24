package niju_viagens;

public class Viagem {
	private String destino;
	private int preco;
	private String ida;
	private String volta;
	
	public String getDestino() {
		return destino;
	}
	public void setDestino(String destino) {
		this.destino= destino;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(int preco) {
		this.preco = preco;
	}
	public String getIda() {
		return ida;
	}
	public void setIda(String ida) {
		this.ida = ida;
	}
	public String getVolta() {
		return volta;
	}
	public void setVolta(String volta) {
		this.volta = volta;
	}
}
