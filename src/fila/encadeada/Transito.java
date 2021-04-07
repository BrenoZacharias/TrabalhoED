package fila.encadeada;

public class Transito {

	private Carro inicio;
	private Carro fim;
	private int qtd = 0;
	
	public Transito(){
		this.inicio = new Carro();
		this.fim = this.inicio;
		this.inicio.setProximo(null);
	}
	
	public void enfileira(Carro carro){
		this.fim.setProximo(new Carro()) ;
		this.fim = this.fim.getProximo();
		this.fim.setNome(carro.getNome());
		this.fim.setPlaca(carro.getPlaca());
		this.fim.setProximo(null);
		qtd++;
	}
	
	public String desenfileira(){
		Carro carro = new Carro();
		if(!(vazia())){
			this.inicio = this.inicio.getProximo();
			carro.setNome(this.inicio.getNome());
			carro.setPlaca(this.inicio.getPlaca());
		}
		qtd--;
		return "Saiu do trânsito:\nNome: " + carro.getNome() + ", Placa: " + carro.getPlaca() + "\n";
	}
	
	public boolean vazia(){
		return this.inicio == this.fim;
	}
	
	public int getQtd(){
		return qtd;
	}
	
	public String verificaElemento(String nome, int placa){
		Carro aux;
		aux = this.inicio.getProximo();
		while (aux != null) {
			 if(((aux.getNome().equals(nome)) && (aux.getPlaca()==placa))){
				 return "" + nome + " de placa " + placa + " está no trânsito";
			 }
			 aux = aux.getProximo();
		}
		return "" + nome + " de placa " + placa + " não está no trânsito";
	}
	
	public void imprime(){
		Carro aux;
		aux = this.inicio.getProximo();
		System.out.println("Trânsito:");
		while (aux != null) {
			 System.out.print("Nome: " + aux.getNome().toString() + ", placa: " + aux.getPlaca()+ "\n");
			 aux = aux.getProximo();
		}
		System.out.println("");
	}
}
