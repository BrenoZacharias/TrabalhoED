package fila.encadeada;

public class Carro {

	private String nome;
	private int placa;
	private Carro proximo;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getPlaca() {
		return placa;
	}
	
	public void setPlaca(int placa) {
		this.placa = placa;
	}
	
	public Carro getProximo() {
		return proximo;
	}
	
	public void setProximo(Carro proximo) {
		this.proximo = proximo;
	}
	

}

