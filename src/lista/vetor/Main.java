package lista.vetor;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) throws Exception {

		ListaDeCompras lista = new ListaDeCompras();
		
		Mercadoria m1 = new Mercadoria(); m1.setNome("miojo");
		Mercadoria m2 = new Mercadoria(); m2.setNome("banana");
		Mercadoria m3 = new Mercadoria(); m3.setNome("leite");
		Mercadoria m4 = new Mercadoria(); m4.setNome("goiaba");
		Mercadoria m5 = new Mercadoria(); m5.setNome("arroz");
		
		lista.adicionarNoInicio(m1);
		lista.adicionarNoInicio(m2);
		lista.adicionarNoInicio(m3);
		lista.adicionarNoFim(m4);
		lista.adicionarNoMeio(m5, 2);
		lista.mostrarLista();
		JOptionPane.showMessageDialog(null, "Item 'leite' está na Lista? " + lista.verificaMercadoria("leite"));
		lista.removerMercadoriaDaPosicao(0);
		lista.mostrarLista();
		JOptionPane.showMessageDialog(null, "Item 'leite' está na Lista? " + lista.verificaMercadoria("leite"));
		JOptionPane.showMessageDialog(null, "Quantidade de itens na Lista: " + lista.qtdMercadoriaNaLista());
		lista.mostrarMercadoriaDaPosicao(1);
	}
}
