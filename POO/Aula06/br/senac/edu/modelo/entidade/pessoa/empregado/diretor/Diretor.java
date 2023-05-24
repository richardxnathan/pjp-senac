public class Diretor extends Empregado implements Gestor {

    public Diretor(String nome, byte idade, String cpf, String ctps, float valorHora, Status status) {
		super(nome, idade, cpf, ctps, valorHora, status);
	}

	public float calcularSalario() {
		return 2000;
	};

	public void contratarEmpregado(Empregado empregado) {
		empregado.setStatus(Status.CONTRATADO);
	}

	public void demitirEmpregado(Empregado empregado) {
		empregado.setStatus(Status.DEMITIDO);
	}
}
