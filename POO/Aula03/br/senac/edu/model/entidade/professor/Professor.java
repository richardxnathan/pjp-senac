public class Professor {

    private String nome;
    private String formacao;
    private String cpf;

    public Professor(String nome, String formacao, String cpf) {
        
        setNome(nome);
        setFormacao(formacao);
        setCpf(cpf);

    }

    //public Professor() {}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void ensinarOrigemJava() {
        System.out.println("A linguagem de programação Java foi desenvolvida por uma equipe de engenheiros liderada por James Gosling na década de 1990, na empresa Sun Microsystems, que posteriormente foi adquirida pela Oracle Corporation. A criação do Java teve como objetivo principal a construção de uma plataforma que permitisse desenvolver software capaz de ser executado em diferentes dispositivos e sistemas operacionais.");
    }

}
