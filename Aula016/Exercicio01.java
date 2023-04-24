//(01) Escreva um algoritmo para criar e popular um vetor com os 100 primeiros números pares.

public class Exercicio01 {

	public static void main (String [] args){
		
        int[] numerosPares = new int [100];

        for(int i = 0; i < 200; i++){
            if(i%2==0){
                numerosPares[i/2] = i;
                System.out.print(numerosPares[i/2] + " ");
            }
        }
    }
}

