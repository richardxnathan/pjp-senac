import java.util.Scanner;

//(16) Escreva um algoritmo para ler um número n (número de termos de uma progressão aritmética), a1 (o primeiro termo da progressão)
// e r (a razão da progressão) e escrever os n termos desta progressão, bem como a soma dos elementos.

public class Exercicio016 {

	public static void main (String [] args){
        		
		Scanner leitor =  new Scanner(System.in);
		
	    System.out.print("Informe um número para ser o número de termos de uma progressão aritmética: ");
	    int n = leitor.nextInt();

        System.out.print("Informe um número para ser o primeiro termo da progressão: ");
	    int a1 = leitor.nextInt();

        System.out.print("Informe um número para ser a razão da progressão: ");
	    int r = leitor.nextInt();
	      
	    long soma = 0;
        
		for(int i = 0; i < n; i++){
            System.out.print(a1 + ", ");
            a1 += r;
            soma += a1;   
        }

        System.out.print("\nA soma dos elementos foi de " + soma);        
		
		leitor.close();
    }
}

