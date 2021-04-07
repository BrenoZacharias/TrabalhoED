package lista.encadeada;

public class Convidado {

	private String nome;
	private int numeroConvite;
	private Convidado proximo;
	
	public Convidado (String nome, int numeroConvite){
		this.nome = nome;
		this.numeroConvite = numeroConvite;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConvite() {
		return numeroConvite;
	}

	public void setNumeroConvite(int numeroConvite) {
		this.numeroConvite = numeroConvite;
	}

	public Convidado getProximo() {
		return proximo;
	}

	public void setProximo(Convidado proximo) {
		this.proximo = proximo;
	}
}

