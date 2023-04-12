import java.util.Scanner;

public class Exemplo01 {

	public static void main (String [] args){
        
		Scanner leitor =  new Scanner(System.in);
		
        System.out.print("Informe a sua quantidade de notas: ");
        int quantidadeNotas = leitor.nextInt();
        
        float soma = 0;
        
        for(int i = 0; i < quantidadeNotas ; i++) {
        	System.out.print("Informe a " + (i + 1) + "º nota: ");
        	soma += leitor.nextFloat();
        }
        
        System.out.println("\nA média do aluno foi de " + (soma/quantidadeNotas));
        
        leitor.close();
    }
}
