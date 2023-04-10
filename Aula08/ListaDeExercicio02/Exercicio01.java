import java.util.Scanner;

//(01) Escreva um algoritmo para ler 2 valores A e B e escrever seus valores seguidos da mensagem: "são múltiplos" ou "não são múltiplos".

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe um número: ");
        byte n1 = leitor.nextByte();

        System.out.print("Informe outro número: ");
        byte n2 = leitor.nextByte();

        if(n2%n1 == 0){
            System.out.print("Os números informados foram " + n1 + " e " + n2 + ", respectivamente, e o número " + n2 + " é núltiplo do número " + n1 + ".");
        } else {
            System.out.print("Os números informados foram " + n1 + " e " + n2 + ", respectivamente, e o número " + n2 + " não é núltiplo do número " + n1 + ".");
        }

        leitor.close();

    }
}