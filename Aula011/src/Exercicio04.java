import java.util.Scanner;

//Algoritmo que mostra se o número é primo ou não.

public class Exercicio04 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);
		
        System.out.print("Informe o número: ");
        int numero = leitor.nextInt();
        
        int contador = 0;
        
        if(numero == 0 || numero == 1) {
        	System.out.println("\nO número " + numero + " não é primo.");
        } else {
        	for(int i = 1; i < numero ; i++) {
            	if(numero%i == 0) {
            		contador++;
            	}
            }
            
            if(contador > 2) {
            	System.out.println("\nO número " + numero + " não é primo.");
            } else {
            	System.out.println("\nO número " + numero + " é primo.");
            }
        }
        leitor.close();
    }
}
