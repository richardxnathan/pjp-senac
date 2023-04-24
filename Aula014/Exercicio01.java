import java.util.Scanner;

public class Exercicio01 {

	public static void main (String [] args){
		
        Scanner leitor =  new Scanner(System.in);

        float[] notas = new float [3];
        float nota = 0;
        
        for(byte i = 0; i < notas.length; i++){
            System.out.print("Informe a " + (i + 1) + "ª nota do aluno: ");
            nota = leitor.nextFloat();
            notas[i] = nota;
        }
        
        for(byte i = 0; i < notas.length; i++){
            System.out.println("A " + (i + 1) + "ª nota do aluno foi " + notas[i]);
        }

        System.out.print("\nA média do aluno foi " + (notas[0] + notas[1] + notas[2])/3);

        leitor.close();
    }
}
