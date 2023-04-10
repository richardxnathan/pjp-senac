import java.util.Scanner;

//(13) Escreva um algoritmo para ler um valor em reais e calcular qual o menor número possível de notas de 100, 50, 10, 5, 2 e 1 em que 
//o valor lido pode ser decomposto. Escrever o valor lido e a relação de notas necessárias.

public class Exercicio013 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número inteiro: ");
        int numero = leitor.nextInt();
        
        System.out.println("\nO número lido foi: " + numero);
        System.out.print("E o menor número de notas para chegar nele é usando: " + (numero/100) + " nota(s) de 100 , " +
        ((numero%100)/50) + " nota(s) de 50 , " + (((numero%100)%50)/10) + " nota(s) de 10 , " + ((((numero%100)%50)%10)/5) +
        " nota(s) de 5 , " + (((((numero%100)%50)%10)%5)/2) + " nota(s) de 2 , " + (((((numero%100)%50)%10)%5)%2) + " nota de 1.");

        leitor.close();
    }
}