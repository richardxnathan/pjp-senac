import java.util.Scanner;

public class Teste {

    public static void main (String [] args){
        
        System.out.print("Informe um número: ");
        Scanner leitor =  new Scanner(System.in);

        int valor = leitor.nextInt();
        valor = valor + 1;

        System.out.print("O sucessor é: " + valor);
    }
}