package pilha.vetor;

import javax.swing.JOptionPane;

public class SalaDeAula {
	public Object [] Sala;
	public int TotalDeAlunos;
	public Object topo;

	
	public SalaDeAula() {
		this.TotalDeAlunos = -1;
		this.Sala = new Object [20];
	}
	
	public boolean estaVazia() {
		if(TotalDeAlunos == -1) {
			return true;
		}
		return false;
	}
	
	public Object pop() {
		int aux;
		if (estaVazia()) {
			return null;
		}
		aux = TotalDeAlunos - 1;
		topo = Sala[aux];
		return Sala[TotalDeAlunos--];
	}
	public void push(Object aluno) {
		if(TotalDeAlunos < Sala.length -1) {
			Sala[++TotalDeAlunos] = aluno;
			topo = aluno;
		}
	}
	public void MostrarSala() {
        String printar = "";
        for (int c = TotalDeAlunos; c >= 0; c--) {
            printar += Sala[c] + "  ";
        }
        JOptionPane.showMessageDialog(null,printar);
	}
	public void MostrarTotalDeAlunos() {
		JOptionPane.showMessageDialog(null, "No total " +(TotalDeAlunos+1) + " aluno(s) estão na Sala");
	}
	public void VerificaAluno(Object aluno) {
		boolean estaNaPilha = false;
		for(int i= 0 ; i <= TotalDeAlunos; i++) {
			if(Sala[i].toString().equals(aluno)) {
				estaNaPilha = true;
			}
		}
		if(estaNaPilha) {
			JOptionPane.showMessageDialog(null,aluno + " está na Sala");
		}else {
			JOptionPane.showMessageDialog(null,aluno + " não está na Sala");
		}
		
	}
	public void MostrarTopo() {
		JOptionPane.showMessageDialog(null, "O aluno do topo é o/a " + topo );
	}
}
