import java.util.Scanner;

//(04) Escreva um algoritmo para ler a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias (considerar o ano com 365 dias e o mês com 30 dias).

public class Exercicio04 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe a sua idade em dias: ");
        int idade = leitor.nextInt();
        
        System.out.print("Essa pessoa tem " + (idade/365) + " ano(s) " + ((idade%365)/30) + " mes(es) " + ((idade%365)%30) + " dia(s).");
        
        leitor.close();
    }
}
