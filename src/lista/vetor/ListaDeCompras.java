package lista.vetor;

import javax.swing.JOptionPane;

public class ListaDeCompras {
	
	private Mercadoria lista [] = new Mercadoria [10];
	private int qtdMercadoria = 0;
	
	public void adicionarNoInicio(Mercadoria mercadoria) {
		garantaEspaco();
		if(listaEstaVazia()){
			lista[0] = mercadoria;
		}
		else{
			for(int i = 0; i != qtdMercadoria + 1; i++){
				Mercadoria aux = lista[i];
				lista[i] = mercadoria;
				mercadoria = aux;
			}
		}
		qtdMercadoria++;
	}
	
	public void adicionarNoFim(Mercadoria mercadoria) {
		garantaEspaco();
		lista[qtdMercadoria] = mercadoria;
		qtdMercadoria++;
	}
	
	public void adicionarNoMeio(Mercadoria mercadoria, int posicao) {
		garantaEspaco();
		for(int i = posicao; i != qtdMercadoria + 1; i++){
			Mercadoria aux = lista[i];
			lista[i] = mercadoria;
			mercadoria = aux;
		}
		qtdMercadoria++;
	}
	
	public void removerMercadoriaDaPosicao(int posicao) throws Exception {
		if(listaEstaVazia())  {
			 throw new Exception("Erro: A Lista está vazia");
		} else {
		for(int i=posicao; i<=qtdMercadoria; i++){
			lista[i] = lista[i + 1];
		}
		qtdMercadoria--;
		}
	}
	
	public int qtdMercadoriaNaLista(){
		return qtdMercadoria;
	}
	
	public void mostrarMercadoriaDaPosicao(int posicao) throws Exception {
		if(listaEstaVazia())  {
			 throw new Exception("Erro: A Lista está vazia");
		}
		JOptionPane.showMessageDialog(null, "mercadoria da posição " + posicao +  " é " + lista[posicao].getNome());
	}
	
	public void mostrarLista() throws Exception {
		if(listaEstaVazia())  {
			 throw new Exception("Erro: A Lista está vazia");
		}
		StringBuffer printar = new StringBuffer();
		for(int i = 0; i <= qtdMercadoria - 1; i++){
			printar.append(lista[i].getNome() + "\n");
		}
		JOptionPane.showMessageDialog(null, printar);
	}
	
	public boolean verificaMercadoria(String nomeMercadoria){
		for(int i = 0; i <= qtdMercadoria - 1; i++){
			if(lista[i].getNome().equals(nomeMercadoria)){
				return true;
			}
		}
		return false;
	}
	
	public boolean listaEstaVazia() {
        if (qtdMercadoria == 0) {
            return true;
        }
        return false;
    }
	 
	 private void garantaEspaco() {
		 if (this.qtdMercadoria == this.lista.length){
			 Mercadoria [] novaLista = new Mercadoria[this.lista.length * 2];
			 for(int i = 0; i < lista.length; i++){
				 novaLista [i] = lista [i];
			 }
			 this.lista = novaLista;
		 }
	}
}
