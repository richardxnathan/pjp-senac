import java.util.Scanner;

//(03) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo números inteiros.
// Ao final do algoritmo, o vetor B deve conter o fatorial de cada elemento do vetor A.

public class Exercicio03 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);

        int[] A = new int[10];
        long[] B = new long[10];
		
        for(byte i = 0; i < 10; i++){
            System.out.print("Informe um número para descobrir seu fatorial: ");
            A[i] = leitor.nextInt();

            long total = 1;
        
            do{
                total*=A[i];
                A[i]--;
            } while(A[i] >= 1);

            B[i] = total;
           
        }

        System.out.print("\nNúmeros do vetor B: ");

        for(byte i = 0; i < 10; i++){
            System.out.print(B[i] + " ");
        }


		leitor.close();
    }
}

