package lista.encadeada;

public class Main {

	public static void main(String[] args) {
		
		Convidado c1 = new Convidado("Mario", 1);
		Convidado c2 = new Convidado("Laura", 2);
		Convidado c3 = new Convidado("Roberto", 3);
		Convidado c4 = new Convidado("Carla", 4);
		Convidado c5 = new Convidado("Caio", 5);
		Convidado c6 = new Convidado("Gil", 6);
		
		ListaConvidados lista = new ListaConvidados();
		
		lista.adicionarElementoNoInicioDaLista(c1);
		lista.adicionarElementoNoInicioDaLista(c2);
		lista.adicionarElementoNoInicioDaLista(c3);
		
		System.out.println("Lista ap�s tr�s inclus�es no inicio:");
		lista.listarTodasPessoasDaLista();
		
		System.out.println("");
		lista.adicionarElementoNoFimDaLista(c4);
		
		System.out.println("Lista ap�s uma inclus�o no fim:");
		lista.listarTodasPessoasDaLista();
		
		System.out.println();
		lista.removerConvidadoDaLista(c1);
		System.out.println("Lista ap�s remover Mario: "); 
		lista.listarTodasPessoasDaLista();
		
		System.out.println();
		lista.adicionarElementoNoMeioDaLista(1, c5);
		
		System.out.println("Lista ap�s adicionar Caio no meio (posi��o 1):");
		lista.listarTodasPessoasDaLista();
		
		System.out.println();
		System.out.println("Total de convidados: " + lista.totalConvidados());
		
		lista.verificaConvidado(c5);
		lista.verificaConvidado(c6);
		}
}
