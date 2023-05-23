public class Diretor extends Empregado {

    public Diretor(String nome, byte idade, String cpf, String ctps, float valorHora) {
		super(nome, idade, cpf, ctps, valorHora);
	}

	public float calcularSalario() {
		return 2000;
	};
}
