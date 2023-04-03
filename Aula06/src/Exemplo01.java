import java.util.Scanner;

public class Exemplo01 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe a primeira nota do aluno: ");
        float nota01 = leitor.nextFloat();
        
        System.out.print("Informe a segunda nota do aluno: ");
        float nota02 = leitor.nextFloat();
        
        System.out.print("Informe a terceira nota do aluno: ");
        float nota03 = leitor.nextFloat();
        
        leitor.close();
        
        float media = (nota01 + nota02 + nota03)/3;
        
        System.out.println("A média do aluno foi: " + media);
        
        if(media >= 7) System.out.println("Aprovado!");
        else System.out.println("Reprovado!");
        
    }
}
