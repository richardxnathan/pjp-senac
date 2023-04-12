import java.util.Scanner;

//Algoritmo que rode fatorial.

public class Exercicio02 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);
		
        System.out.print("Informe o numero que você deseja o fatorial: ");
        int fatorial = leitor.nextInt();
                
        int resultado = 1;
        
        for(int i = fatorial; i > 0 ; i--) {
        	resultado = resultado * i;
        }
        
        System.out.println("\nO resultado é " + resultado);
        
        leitor.close();
    }
}
