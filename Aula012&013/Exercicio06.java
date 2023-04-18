import java.util.Scanner;

//(06) Escreva um algoritmo para ler um número inteiro e positivo e calcular o seu fatorial.

public class Exercicio06 {

	public static void main (String [] args){
        
		
		Scanner leitor =  new Scanner(System.in);
		
	    System.out.print("Informe um número para descobrir seu fatorial: ");
	    int numero = leitor.nextInt();
	      
	    long total = 1;
        
		do{
            total*=numero;
            numero--;
        } while(numero >= 1);

        System.out.println("O seu fatorial é: " + total);

		leitor.close();
    }
}

