import java.util.Scanner;

//(04) Escreva um algoritmo para receber 2 vetores A e B de tamanho 10 contendo números inteiros. 
//Ao final do algoritmo, um vetor C deve ser criado contendo a união de A e B.

public class Exercicio04 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];
		
        for(byte i = 0; i < 10; i++){
            System.out.print("Informe um número inteiro: ");
            A[i] = leitor.nextInt();
            C[i] = A[i];
        }

        for(byte i = 0; i < 10; i++){
            System.out.print("Informe um número inteiro: ");
            B[i] = leitor.nextInt();
            C[i+10] = B[i];
        }

        System.out.print("\nNúmeros do vetor C: ");

        for(byte i = 0; i < 20; i++){
            System.out.print(C[i] + " ");
        }

		leitor.close();
    }
}

