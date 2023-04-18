import java.util.Scanner;

//(07) Escreva um algoritmo para ler dois números inteiros e positivos e informar se o segundo corresponde ao fatorial do primeiro.

public class Exercicio07 {

	public static void main (String [] args){
        
		
		Scanner leitor =  new Scanner(System.in);
		
	    System.out.print("Informe um número: ");
	    int numero = leitor.nextInt();
	    
	    System.out.print("Informe outro número: ");
	    int testeFatorial = leitor.nextInt();
	      
	    long total = 1;
        
		do{
            total*=numero;
            numero--;
        } while(numero >= 1);
		
		if(total == testeFatorial) {
			System.out.print("O segundo número informado é o fatorial do primeiro.");
		} else {
			System.out.print("O segundo número informado não é o fatorial do primeiro.");
		}
		
		leitor.close();
    }
}

