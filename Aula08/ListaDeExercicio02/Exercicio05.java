import java.util.Scanner;

//(05) Escreva um algoritmo para ler três valores A, B, C e verificar se eles formam ou não um triângulo (se a > b + c não formam triângulo algum).

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número: ");
        byte A = leitor.nextByte();

        System.out.print("Informe outro número: ");
        byte B = leitor.nextByte();

        System.out.print("Informe um terceiro número: ");
        byte C = leitor.nextByte();

        if ((A > (B + C)) || (B > (A + C)) || (C > (A + B))) {
            System.out.print("Esses números não formam um triângulo.");
        } else {
            System.out.print("Esses números formam um triângulo.");
        }

        leitor.close();

    }
}