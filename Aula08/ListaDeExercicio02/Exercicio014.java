import java.util.Scanner;

//(14) Escreva um algoritmo para ler o número de identificação, as três notas obtidas por um aluno e a média dos exercícios que 
//fazem parte da avaliação. Calcular a média de aproveitamento, usando a fórmula:

//MA = (Nota1 + Nota2 x 2 + Nota3 x 3 + ME ) / 7

//A atribuição de conceitos obedece a tabela abaixo:

//	MA		    Conceito
//	9,0		        A
//	7,5 e < 9,0 	B
//	6,0 e < 7,5 	C
//	4,0 e < 6,0 	D
//  < 4,0	 	    E

//O algoritmo deve escrever o número do aluno, suas notas, a média dos exercícios, a média de aproveitamento, 
//o conceito correspondente e a mensagem: APROVADO se o conceito for A, B ou C e REPROVADO se o conceito for D ou E.

public class Exercicio014 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o código do aluno: ");
        short codigoAluno = leitor.nextShort();

        System.out.print("Informe a primeira nota: ");
        float nota1 = leitor.nextFloat();

        System.out.print("Informe a segunda nota: ");
        float nota2 = leitor.nextFloat();

        System.out.print("Informe a terceira nota: ");
        float nota3 = leitor.nextFloat();

        System.out.print("Informe a média dos exercícios: ");
        float me = leitor.nextFloat();

        float ma = (nota1 + (nota2 * 2) + (nota3 * 3) + me)/7;

        String conceitoAproveitamento = "E";

        if(ma > 9) {
            conceitoAproveitamento = "A";
        } else if (ma > 7.5){
            conceitoAproveitamento = "B";
        } else if (ma > 6){
            conceitoAproveitamento = "C";
        } else if (ma > 4){
            conceitoAproveitamento = "D";
        } 

        System.out.println("\nO código de aluno é " + codigoAluno);
        System.out.println("As três notas foram respectivamente " + nota1 + " " + nota2 + " " + nota3);
        System.out.println("A média dos exercícios foi " + me);
        System.out.println("A média de aproveitamento foi " + conceitoAproveitamento);

        if(conceitoAproveitamento == "D" || conceitoAproveitamento == "E"){
            System.out.println("E o aluno foi REPROVADO!");
        } else {
            System.out.println("E o aluno foi APROVADO!");
        }
    leitor.close();
    }
}