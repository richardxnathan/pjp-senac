import java.util.Scanner;

//(20) Escreva um algoritmo para ler um valor n inteiro e positivo e calcular a seguinte soma:  
//S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
//O algoritmo deve escrever cada termo gerado e o valor final de S.

public class Exercicio020 {

	public static void main (String [] args){
        		
		Scanner leitor =  new Scanner(System.in);
		
	    System.out.print("Informe um número postivo e inteiro: ");
	    int n = leitor.nextInt();

        float s = 0;
       
		for(float i = 1; i <= n; i++){
            System.out.println(1/i);
            s += 1/i;   
        }       
        System.out.println("\nA soma ficou valendo " + s);

		leitor.close();
    }
}

