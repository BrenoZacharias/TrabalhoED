package pilha.encadeada;

public class Cadeira {

	private int numero;
	private Cadeira anterior;
	
	public Cadeira(int numero) {
		this.numero = numero;
	}
	
	
	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public Cadeira getAnterior() {
		return anterior;
	}

	public void setAnterior(Cadeira anterior) {
		this.anterior = anterior;
	}
	
	public String toString(){
		return "Cadeira " + numero;
	}
}
