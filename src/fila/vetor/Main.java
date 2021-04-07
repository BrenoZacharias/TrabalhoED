package fila.vetor;

public class Main {

    public static void main(String[] args) throws Exception {
    	
        FilaDoBanco fila = new FilaDoBanco();
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        Pessoa p5 = new Pessoa();
        Pessoa p6 = new Pessoa();
        Pessoa p7 = new Pessoa();
        
        p1.setNome("Matheus");
        p1.setIdade(5);
        
        p2.setNome("Marcos");
        p2.setIdade(37);
        
        p3.setNome("Lucas");
        p3.setIdade(22);
        
        p4.setNome("João");
        p4.setIdade(66);
        
        p5.setNome("Pedro");
        p5.setIdade(19);
        
        p6.setNome("Tiago");
        p6.setIdade(33);
        
        p7.setNome("Felipe");
        p7.setIdade(58);
        
        fila.enfileira(p1);
        fila.enfileira(p2);
        fila.enfileira(p3);
        fila.enfileira(p4);
        fila.enfileira(p5);
        fila.enfileira(p6);
        fila.enfileira(p7);
        
        fila.imprime();
            
        System.out.println(fila.desenfileira());
            
        fila.imprime();
            
        Pessoa p8 = new Pessoa();
        Pessoa p9 = new Pessoa();
            
        p8.setNome("Paulo");
        p8.setIdade(18);
            
        p9.setNome("Temóteo");
        p9.setIdade(70);
            
        fila.enfileira(p8);
        fila.enfileira(p9);
            
        System.out.println(fila.desenfileira());
        System.out.println(fila.desenfileira());
        System.out.println(fila.desenfileira());
        System.out.println(fila.desenfileira());
        
        fila.imprime();
        
        fila.TotalDePessoasNaFila();
        
        fila.FilaVerifica("Paulo", 18 );
        fila.FilaVerifica("Rodolfo", 40);
    }
}
