import java.util.Scanner;

public class Exercicio01 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe a primeira nota do aluno: ");
        float nota01 = leitor.nextFloat();
        
        System.out.print("Informe a segunda nota do aluno: ");
        float nota02 = leitor.nextFloat();
        
        System.out.print("Informe a terceira nota do aluno: ");
        float nota03 = leitor.nextFloat();
              
        float media = (nota01 + nota02 + nota03)/3;
        
        System.out.println("A média do aluno foi: " + media);
        
        System.out.print("\nInforme a frequência do aluno: ");
        byte frequencia = leitor.nextByte();
                
        if(media == 10 && frequencia == 100) {
        	System.out.println("Aprovado com louvor!");
        } else if (media >= 7 && frequencia >=75) {
        	System.out.println("Aprovado!");
        }
        else {
        	if(media == 10 && frequencia < 75) {
        		System.out.println("Reprovado por frequência!");
        	} else if (media < 7 && frequencia >= 75) {
        		System.out.println("Reprovado por nota!");
        	} else {
        		System.out.println("Reprovado por nota e frequência!");
        	}
        }
        
        leitor.close();
        
    }
}
