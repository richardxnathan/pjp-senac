import java.util.Scanner;

//(06) Escreva um algoritmo para receber um vetor A de tamanho 15 contendo números inteiros e imprimir a quantidade de valores pares.

public class Exercicio06 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);

        int[] vetor = new int[15];

        byte quantidadePares = 0;
		
        for(byte i = 0; i < 15; i++){
            System.out.print("Informe um número inteiro: ");
            vetor[i] = leitor.nextInt();

            if(vetor[i]%2 == 0){
                quantidadePares++;
            }
        }

        System.out.print("\nA quantidade de números pares no vetor foi de: " + quantidadePares);

		leitor.close();
    }
}

