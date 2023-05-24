public abstract class Pessoa {

    private String nome;
    private byte idade;
    private String cpf;

    protected Pessoa(String nome, byte idade, String cpf) {
        super();
        setNome(nome);
        setIdade(idade);
        setCpf(cpf);    
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public byte getIdade() {
        return idade;
    }

    public void setIdade(byte idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
