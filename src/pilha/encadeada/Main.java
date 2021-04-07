package pilha.encadeada;

public class Main {

	public static void main(String[] args) {
		Cadeira c1 = new Cadeira(1);
		Cadeira c2 = new Cadeira(2);
		Cadeira c3 = new Cadeira(3);
		Cadeira c4 = new Cadeira(4);
		Cadeira c5 = new Cadeira(5);
		
		PilhaCadeira p = new PilhaCadeira();
		
		p.push(c1);
		p.push(c2);
		p.push(c3);
		p.push(c4);
		p.push(c5);
		
		System.out.println("Pilha:");
		p.mostraCadeiras();
		
		System.out.println("Quantidade de elementos:\n" + p.qtdCadeiras());
		
		System.out.println("Topo: \n" + p.top());
		
		p.verificaCadeira(5);
		
		System.out.println("Removendo um livro:");
		p.pop();
		p.mostraCadeiras();
		
		p.verificaCadeira(5);
		
		System.out.println("Topo: \n" + p.top());
		
		System.out.println("Quantidade de elementos:\n" + p.qtdCadeiras());
	}
}
