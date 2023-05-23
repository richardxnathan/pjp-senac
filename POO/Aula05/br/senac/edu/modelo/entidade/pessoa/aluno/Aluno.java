public class Aluno extends Pessoa {

    private Turma turma;
    private String matricula;
    private Status status;

    public Aluno(String nome, byte idade, String cpf, Turma turma, String matricula) {
        super(nome, idade, cpf);
		setTurma(turma);
        setMatricula(matricula);
        setStatus(Status.MATRICULADO);
	}

    public Aluno(String nome, byte idade, String cpf, Turma turma, String matricula, Status status) {
        super(nome, idade, cpf);
		setTurma(turma);
        setMatricula(matricula);
        setStatus(status);
	}

    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

	public void responderChamada() {
		System.out.println("Presente!");
	}
}
