import java.util.Scanner;

//(02) Escreva um algoritmo para ler 3 números inteiros e mostrar o maior deles.

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número: ");
        byte x = leitor.nextByte();

        System.out.print("Informe outro número: ");
        byte y = leitor.nextByte();

        System.out.print("Informe um terceiro número: ");
        byte z = leitor.nextByte();

        if(x>y && x>z){
            System.out.print("O maior número entre os digitados foi: " + x);
        } else if (y>x && y>z){
            System.out.print("O maior número entre os digitados foi: " + y);
        } else {
            System.out.print("O maior número entre os digitados foi: " + z);
        }

        leitor.close();

    }
}