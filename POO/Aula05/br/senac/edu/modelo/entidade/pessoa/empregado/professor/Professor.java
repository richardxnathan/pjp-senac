public class Professor extends Empregado {

	private Turma turma;

	public Professor(String nome, byte idade, String cpf, String ctps, float valorHora, Turma turma) {
		super(nome, idade, cpf, ctps, valorHora);
		setTurma(turma);
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public float calcularSalario() {
		return 1500;
	};

	public void fazerChamada() {
		System.out.println("Olha a chamada pessoal:");
	}
}
