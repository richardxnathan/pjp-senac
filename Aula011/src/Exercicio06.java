import java.util.Scanner;

//Algoritmo que mostra se o número é primo ou não.

public class Exercicio06 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);
		
        System.out.print("Informe o número: ");
        int numero = leitor.nextInt();
        
        int contador = 0;
        
        if(numero == 0 || numero == 1) {
        	System.out.println("\nO número " + numero + " não é primo.");
        } else {
        	for(int i = 2; i <= numero ; i++) {
        		contador = 0;
        		
	        	for(int j = 2; j <= i ; j++) {
	            	if(i % j == 0) {
	            		contador++;
	               	}	        	            	
	            }
	        	if(contador == 1) {
	            	System.out.println(i);
	            }
	        	
        	}
	            
        }
        leitor.close();
    }
}
