import java.util.Scanner;

//(05) Escreva um algoritmo para ler a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias (considerar o ano com 365 dias e o mês com 30 dias).

public class Exercicio05 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe quantos anos, meses e dias de vida você tem, primeiramente os anos: ");
        int anos = leitor.nextInt();
        
        System.out.print("Agora os meses: ");
        int meses = leitor.nextInt();
        
        System.out.print("E por último os dias: ");
        int dias = leitor.nextInt();
        
        System.out.print("Você viveu ao total por " + ((anos * 365) + (meses * 30) + dias) + " dias.");
        
        leitor.close();
    }
}