import java.util.Scanner;

//(05) Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano. 
//Escreva um algoritmo para calcular e imprimir quantos anos serão necessários para que Zé seja maior que Chico.

public class Exercicio05 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);
		 
        int totalInteirosPositivos = 0;
        int media = 0;
        int numeroMenor = Integer.MAX_VALUE;
        int numeroMaior = 0;


        while(true){
            System.out.println("Informe números inteiros e positivos: ");
            int numero = leitor.nextInt();

            if(numero>numeroMaior){
                numeroMaior = numero;
            }

            if(numero<numeroMenor){
                numeroMenor = numero;
            }

            media += numero;

            totalInteirosPositivos++;
            if(totalInteirosPositivos==10){
                break;
            }
        }
        System.out.println("\nO maior número é: " + numeroMaior);
        System.out.println("O menor número é: " + numeroMenor);
        System.out.print("A média é: " + (media/totalInteirosPositivos));

        leitor.close();
    }
}
