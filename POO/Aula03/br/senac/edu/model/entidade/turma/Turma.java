public class Turma {

    private String nome;
    private int cargaHoraria;
    private Professor professor;
    private Aluno[] alunos;
    private int quantidadeAlunosMatriculados;

    public Turma(String nome, int cargaHoraria, int tamanho) {
        setNome(nome);
        setCargaHoraria(cargaHoraria);
        alunos = new Alunos[tamanho];
        quantidadeAlunosMatriculados = 0;
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

    public boolean inserirAluno(Aluno aluno) {

        if (quantidadeAlunosMatriculados == alunos.length) {
            return false;
        }

        alunos[quantidadeAlunosMatriculados] = aluno;
        quantidadeAlunosMatriculados++;

        return true;

    }

    public boolean removerAluno(String cpf) {

        if (quantidadeAlunosMatriculados == 0) {
            return false;
        }

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i] != null && alunos[i].getCpf().equals(cpf)) {

                aluno[i] = null;
                quantidadeAlunosMatriculados--;
                alunos = realocarAlunos(alunos);
            }
        }
    }

    public void recuperarAluno(String cpf) {

    }

    private Aluno[] realocarAlunos(Aluno[] alunos) {

        Aluno[] alunosRealocados = new Aluno[alunos.length];

        int indice = 0;

        for (int i = 0; i < alunos.length; i++) {

            if (alunos[i] != null) {

                alunosRealocados[indice] = alunos[i];
                indice++;
            }

        }

        return alunosRealocados;

    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

}
