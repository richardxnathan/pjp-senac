public class Turma {
    
    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private Aluno[] alunos;

    public Turma(String nome, int cargaHoraria, int tamanho) {
        setNome(nome);
        setCargaHoraria(cargaHoraria);
        alunos = new Alunos[tamanho];
    }

    public Turma(String nome, int cargaHoraria, Professor professor, int tamanho) {
        setNome(nome);
        setCargaHoraria(cargaHoraria);
        setProfessor(professor);
        alunos = new Alunos[tamanho];
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void inserirAluno(Aluno aluno){

    }

    public void removerAluno(Aluno aluno){
        
    }

    public void recuperarAluno(String cpf){
        
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
}
