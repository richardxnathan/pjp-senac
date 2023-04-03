import java.util.Scanner;

//(06) Escreva um algoritmo para ler a temperatura em Fahrenheit e calcular a temperatura correspondente em Celsius.

public class Exercicio06 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe a temperatura em Fahrenheit: ");
        float temperatura = leitor.nextFloat();
        
        System.out.print("A temperatura em graus Celsius é " + ((temperatura-32)/1.8) + ".");
           
        leitor.close();
    }
}