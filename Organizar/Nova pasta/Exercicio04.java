import java.util.Scanner;

//(04) Escreva um algoritmo para ler 10 valores inteiros e positivos e:  
//	a) encontrar o maior valor;
//	b) encontrar o menor valor;
//	c) calcular a média dos números lidos.

public class Exercicio04 {

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
