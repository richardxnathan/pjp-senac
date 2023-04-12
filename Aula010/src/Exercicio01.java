import java.util.Scanner;

//Algoritmo que rode exponenciação.

public class Exercicio01 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);
		
        System.out.print("Informe o numero que você deseja multiplicar: ");
        int base = leitor.nextInt();
        
        System.out.print("Informe o expoente dele: ");
        int expoente = leitor.nextInt();
        
        int resultado = 1;
        
        for(int i = 0; i < expoente ; i++) {
        	resultado = resultado * base;
        }
        
        System.out.println("\nO resultado é " + resultado);
        
        leitor.close();
    }
}
