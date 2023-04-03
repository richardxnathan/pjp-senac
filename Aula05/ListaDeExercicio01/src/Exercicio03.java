import java.util.Scanner;

//(03) Escreva um algoritmo para ler 3 notas de um aluno e calcular a sua média final (média ponderada; o peso das notas é: 2, 3 e 5, respectivamente).

public class Exercicio03 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe a primeira nota: ");
        float n1 = leitor.nextFloat();
        
        System.out.print("Informe a segunda nota: ");
        float n2 = leitor.nextFloat();
        
        System.out.print("Informe a terceira nota: ");
        float n3 = leitor.nextFloat();
        
        leitor.close();
        
        double media = (n1 * 0.2) + (n2 * 0.3)  + (n3 * 0.5);

        System.out.print("A média do aluno é: " + media);
    }
}
