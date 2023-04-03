import java.util.Scanner;

//(01) Escreva um algoritmo para ler as dimensões de um retângulo (base e altura) e calcular a sua área.

public class Exercicio01 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe o tamanho da base do retângulo: ");
        float base = leitor.nextFloat();
        
        System.out.print("Informe o tamanho da altura do retângulo: ");
        float altura = leitor.nextFloat();
        
        leitor.close();
        
        float area = base * altura;

        System.out.print("A área é: " + area);
    }
}
