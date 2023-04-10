import java.util.Scanner;

//(03) Escreva um algoritmo para ler um número inteiro e mostre uma mensagem indicando se este número é par ou ímpar, e se é positivo ou negativo.

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = leitor.nextInt();

        if(numero % 2 == 0){
            System.out.print("O número informado é par ");
            if(numero > 0){
                System.out.print("e positivo.");    
            } else {
                System.out.print("e negativo.");
            }
        } else {
            System.out.print("O número informado é impar ");
            if(numero > 0){
                System.out.print("e positivo.");    
            } else {
                System.out.print("e negativo.");
            }
        }

        leitor.close();

    }
}