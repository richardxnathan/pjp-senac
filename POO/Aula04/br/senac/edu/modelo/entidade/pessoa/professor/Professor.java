public class Professor extends Pessoa {

	private Turma turma;

	public Professor(String nome, byte idade, String cpf, Turma turma) {
		super(nome, idade, cpf);
		setTurma(turma);
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public void fazerChamada() {
		System.out.println("Olha a chamada pessoal:");
	}
}
