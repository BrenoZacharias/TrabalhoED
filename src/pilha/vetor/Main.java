package pilha.vetor;

public class Main {

	public static void main(String[] args) {
	
		SalaDeAula sala = new SalaDeAula();
		
		sala.push("Millena");
		sala.push("Gabriel");
		sala.pop(); //Retira Gabriel da Sala
		sala.push("Laura");
		sala.push("Pedro");
		sala.pop(); //Retira Pedro da sala
		sala.push("Vit�ria");
		sala.push("Jo�o"); //Aluno do Topo
		
		sala.MostrarSala();
		
		sala.MostrarTotalDeAlunos();
		
		sala.VerificaAluno("Millena");
		sala.VerificaAluno("Pedro");
		
		sala.MostrarTopo();
		
		sala.push("Fernando"); //Novo Aluno do Topo
		
		sala.VerificaAluno("Jo�o");
		
		sala.MostrarTopo();
	}

}
