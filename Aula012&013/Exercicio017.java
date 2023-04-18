import java.util.Scanner;

//(17) Escreva um algoritmo para ler um valor para uma variável n e calcular a tabuada de 1 até n. Escreva a tabuada na forma:
//1 x n = n
//2 x n = 2n
//3 x n = 3n
//...
//n x n = n2

public class Exercicio017 {

	public static void main (String [] args){
        		
		Scanner leitor =  new Scanner(System.in);
		
	    System.out.print("Informe um número para ver a tabuada: ");
	    int n = leitor.nextInt();
       
		for(int i = 1; i <= n; i++){
            System.out.println(i + " x " + n + " = " + (i*n));   
        }       
		
		leitor.close();
    }
}

