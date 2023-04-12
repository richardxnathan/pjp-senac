import java.util.Scanner;

//Algoritmo que mostra a sequencia de Fibonacci.

public class Exercicio03 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);
		
        System.out.print("Informe o elemento da sequência de Fibonacci que você deseja: ");
        int elemento = leitor.nextInt();
        
        int var1 = 0;
        int var2 = 1;
        int ajuda;
        
        for(int i = 1; i < elemento ; i++) {
        	
        	//System.out.println(var1);
        	ajuda = var1;
        	var1 = var1 + var2;
        	var2 = ajuda;
               	
        }
        
        System.out.println("\nO resultado é " + var1);
        
        leitor.close();
    }
}
