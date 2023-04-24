import java.util.Scanner;

//(03) Escreva um algoritmo para ler vários números inteiros e positivos e calcular o produtório dos números pares. O fim da leitura será indicado pelo número 0.

public class Exercicio03 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);
		 
        int total = 1;

        while(true){
            System.out.println("Informe números inteiros e positivos ou [0] para encerrar: ");
            int numero = leitor.nextInt();

            if(numero==0){
                break;
            }

            if(numero%2==0){
                total*=numero;
            }

        }

        System.out.print("\nO produtório dos números pares é: " + total);

        leitor.close();
    }
}
