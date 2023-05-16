public class Principal {

    public static void main(String[] args) {
        
        
        Aluno aluno01 = new Aluno("Richard Nathan Domingos", (byte) 26, "123.456.789-10");

        System.out.println("Nome do aluno: " + aluno01.getNome());
        System.out.println("Idade do aluno: " + aluno01.getIdade());
        System.out.println("CPF do aluno: " + aluno01.getCpf());
        
        aluno01.responderChamada();

        Professor professor01 = new Professor("Allan Renato Sabino", "Ciências da Computação", "123.456.789-10");

        System.out.println("\nNome do professor: " + professor01.getNome());
        System.out.println("Formação do professor: " + professor01.getFormacao());
        System.out.println("CPF do professor: " + professor01.getCpf());
        
        professor01.ensinarOrigemJava();
        
    }
}
