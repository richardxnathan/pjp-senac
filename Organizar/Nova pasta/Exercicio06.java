import java.util.Scanner;

//(03) Escreva um algoritmo para ler vários números inteiros e positivos e calcular o produtório dos números pares. O fim da leitura será indicado pelo número 0.

public class Exercicio06 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);

        int produtorio = 1;


        while(true){
            System.out.println("Informe números inteiros e positivos ou pressione 0 para finalizar: ");
            int numero = leitor.nextInt();

            if(numero==0){
                break;
            }

            if(numero%2==0){
                produtorio *= numero;
            }
           
        }
        System.out.println("\nO produtório é: " + produtorio);

        leitor.close();
    }
}
