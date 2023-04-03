import java.util.Scanner;

//(02) Escreva um algoritmo para ler 3 notas de um aluno e calcular a sua média final (média aritmética).

public class Exercicio02 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe a primeira nota: ");
        float n1 = leitor.nextFloat();
        
        System.out.print("Informe a segunda nota: ");
        float n2 = leitor.nextFloat();
        
        System.out.print("Informe a terceira nota: ");
        float n3 = leitor.nextFloat();
        
        leitor.close();
        
        float media = (n1 + n2 + n3) / 3;

        System.out.print("A média do aluno é: " + media);
    }
}
