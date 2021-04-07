package fila.vetor;

public class FilaDoBanco {

    private Pessoa fila[];
    private int inicio, fim;
    private int TotalDePessoas;

    //Cria uma Fila vazia
    public FilaDoBanco() {
        this.fila = new Pessoa[10];
        this.inicio = 0;
        this.fim = this.inicio;
    }

    public void enfileira(Pessoa pessoa) throws Exception {
        if ((this.fim + 1) > this.fila.length) {
            throw new Exception("Erro: A fila esta cheia");
        }
        this.fila[this.fim] = new Pessoa();
        this.fila[this.fim].setNome(pessoa.getNome());
        this.fila[this.fim].setIdade(pessoa.getIdade());
        this.fim = (this.fim + 1);
        TotalDePessoas++;
    }

    public String desenfileira() throws Exception {
        if (this.vazia()) {
            throw new Exception("Erro: A fila esta vazia");
        }
        TotalDePessoas--;
        Pessoa aux = new Pessoa();
        aux.setNome(this.fila[this.inicio].getNome());
        aux.setIdade(this.fila[this.inicio].getIdade());
        this.inicio = (this.inicio + 1) % this.fila.length;
        return "" + aux.getNome() + " de " + aux.getIdade() + " anos foi atendido\n";
    }

    public boolean vazia() {
        return (this.inicio == this.fim);
    }

    public void imprime() {
    	System.out.println("Fila:");
        for(int i = this.inicio; i != this.fim; i = (i + 1) % this.fila.length) {
            System.out.print(this.fila[i].getNome() + " de " + this.fila[i].getIdade() + " anos \n");
        }
        System.out.println();
    }
    
    public void FilaVerifica(String nome, int idade ) {
    	boolean estaNaFila = false;
    	
    	for(int i=this.inicio; i!=this.fim; i = (i+1) % this.fila.length) {
    		if ((this.fila[i].getNome().equals(nome)) && (this.fila[i].getIdade()==idade)){
    			estaNaFila = true;
    		}
    	}
    	if(estaNaFila) {
    		System.out.println(nome + " de " + idade + " anos está na fila\n");
    	}else{
    		System.out.println(nome + " de " + idade + " anos não está na fila\n");
    	}
    }
    
    public void TotalDePessoasNaFila() {
    	System.out.println("\n"+TotalDePessoas + " pessoa(s) estão na fila\n");
    }
}



