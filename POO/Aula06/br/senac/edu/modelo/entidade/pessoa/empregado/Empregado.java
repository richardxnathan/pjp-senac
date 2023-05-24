public abstract class Empregado extends Pessoa {

    private String ctps;
    private float valorHora;
    private Status status;

    protected Empregado(String nome, byte idade, String cpf, String ctps, float valorHora, Status status) {
        super(nome, idade, cpf);
        setCtps(ctps);
        setValorHora(valorHora);
        setStatus(status);
    }

    public String getCtps() {
        return ctps;
    }

    public void setCtps(String ctps) {
        this.ctps = ctps;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public abstract float calcularSalario();

    public float calcularSalario(int quantidadeHorasTrabalhadas) {
        return quantidadeHorasTrabalhadas * valorHora;
    }
}
