package fila.encadeada;

public class Main {

	public static void main(String[] args) {
		
		Transito fila = new Transito();
		
		Carro c1 = new Carro(); c1.setNome("Palio"); c1.setPlaca(42652);
		Carro c2 = new Carro(); c2.setNome("Uno"); c2.setPlaca(85423);
		Carro c3 = new Carro(); c3.setNome("Camaro"); c3.setPlaca(23492);
		Carro c4 = new Carro(); c4.setNome("Prisma"); c4.setPlaca(41234);
		
		fila.enfileira(c1);
		fila.enfileira(c2);
		fila.enfileira(c3);
		fila.enfileira(c4);
		fila.imprime();
		System.out.println(fila.desenfileira());
		fila.imprime();
		System.out.println("Quantidade de elementos: " + fila.getQtd() + "\n");
		System.out.println(fila.verificaElemento("Camaro", 23492));
		System.out.println(fila.verificaElemento("Camaro", 233486));
	}
}
