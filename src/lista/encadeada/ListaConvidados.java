package lista.encadeada;

public class ListaConvidados {
	
	private Convidado cabeca = null;
	private Convidado elemento;
	private int totalConvidados = 0;
	
	public void adicionarElementoNoFimDaLista(Convidado convidado) {
		if(cabeca==null) {
			cabeca = convidado;
			elemento = convidado;
			totalConvidados++;
		}
		else if(elemento.getProximo()==null) {
			elemento.setProximo(convidado);
			elemento = convidado;
			totalConvidados++;
		}
	}
	
	public void adicionarElementoNoInicioDaLista(Convidado convidado) {
		convidado.setProximo(cabeca);
		cabeca=convidado;
		if(cabeca.getProximo()==null){
			elemento = convidado;
		}
		totalConvidados++;
	}
	
	public void adicionarElementoNoMeioDaLista(int posicao, Convidado convidado) {
		Convidado aux = this.cabeca;
		for(int i = 1; i <= posicao; i++) {
			if(i==posicao){
				convidado.setProximo(aux.getProximo());
				aux.setProximo(convidado);
			}
			aux = aux.getProximo();
		}
		totalConvidados++;
	}
	
	public void removerConvidadoDaLista(Convidado convidado) {
		Convidado aux = this.cabeca;
		while(aux!=null) {
			if(aux.getProximo()==convidado) {
				Convidado proximo = aux.getProximo();
				aux.setProximo(proximo.getProximo());
			}
			else if(aux==convidado) {
				cabeca=convidado.getProximo();
			}
			aux=aux.getProximo();
		}
		totalConvidados--;
	}
	
	public int totalConvidados(){
		return totalConvidados;
	}
	
	public String mostrarPrimeiraPessoaDaLista() {
		return cabeca.getNome();
	}
	
	public String mostrarElementoDaUltimaPosicaoDaLista() {
		return elemento.getNome();
	}
	
	public void listarTodasPessoasDaLista() {
		Convidado aux = cabeca;
		while(aux!=null){
			System.out.println(aux.getNome());
			aux = aux.getProximo();
		}
	}	
	
	public void verificaConvidado (Convidado convidado){
		Convidado aux = this.cabeca;
		boolean auxBoolean = false;
		while(aux!=null) {
			if((convidado.getNome().equals(aux.getNome())) && (convidado.getNumeroConvite()==aux.getNumeroConvite())){
				auxBoolean = true;
				System.out.println(""+convidado.getNome() +" do numero do convite "+convidado.getNumeroConvite()+" está na lista");
			}
			aux = aux.getProximo();
		}
		if(auxBoolean == false){
			System.out.println(""+convidado.getNome() +" do numero do convite "+convidado.getNumeroConvite()+" não está na lista");
		}
	}
}
