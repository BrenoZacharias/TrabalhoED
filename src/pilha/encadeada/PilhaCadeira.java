package pilha.encadeada;

public class PilhaCadeira {

	private Cadeira topo, anterior;
	private int qtdCadeiras;
	
	public void push(Cadeira cadeira) { //empilhar
        if (anterior == null) {
            anterior = cadeira;
        } else {
            topo = cadeira;
            topo.setAnterior(anterior);
            anterior = topo;
        }
        qtdCadeiras++;
    }
	
	public void pop() {
        topo = topo.getAnterior();
        anterior = topo;
        qtdCadeiras--;
    }

	public Cadeira top() {
        return topo;
    }
	
    public void mostraCadeiras() {
        Cadeira aux = topo;

        while (aux != null) {
            System.out.println(aux.toString());
            aux = aux.getAnterior();
        }
    }
    
    public  int qtdCadeiras() {
		return qtdCadeiras;
	}
    
    public void verificaCadeira(int numeroCadeira) {
    	boolean estaNaPilha = false;
    	Cadeira aux = topo;
    	while (aux != null) {
    		if(aux.getNumero() == numeroCadeira) {
    			estaNaPilha = true;
    			aux=null;
    		} else{
    			aux = aux.getAnterior();
            }
        }
		if(estaNaPilha) {
			System.out.println("Cadeira " + numeroCadeira + " está na Pilha?\nSim" );
		}else {
			System.out.println("Cadeira " + numeroCadeira + " está na Pilha?\nNão" );
		}
	}
}
