import java.util.Scanner;

//(08) Escreva um algoritmo para ler o código de um aluno e suas três notas. Calcule a média ponderada do aluno, considerando que o peso para a 
//maior nota seja 4 e para as duas restantes, 3. Mostre o código do aluno, suas três notas, a média calculada e uma mensagem "APROVADO" se a média
// for maior ou igual a 7 e "REPROVADO" se a média for menor que 7.

public class Exercicio08 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o código de aluno: ");
        short codigoAluno = leitor.nextShort();

        System.out.print("Informe a primeira nota: ");
        float nota01 = leitor.nextFloat();

        System.out.print("Informe a segunda nota: ");
        float nota02 = leitor.nextFloat();

        System.out.print("Informe a terceira nota: ");
        float nota03 = leitor.nextFloat();

        double media = 0;

        if(nota01>nota02 && nota01>nota03){
            media = ((nota01 * 0.4) + ((nota02 + nota03)*0.3));
        } else if (nota02>nota01 && nota02>nota03){
            media = ((nota02 * 0.4) + ((nota01 + nota03)*0.3));
        } else {
            media = ((nota03 * 0.4) + ((nota01 + nota02)*0.3));
        }

        System.out.println("O código de aluno é " + codigoAluno);
        System.out.println("As três notas foram respectivamente " + nota01 + " " + nota02 + " " + nota03);
        System.out.println("A média foi " + media);

        if(media>=7){
            System.out.println("E o aluno foi APROVADO!");
        } else {
            System.out.println("E o aluno foi REPROVADO!");
        }
        leitor.close();
    }
}