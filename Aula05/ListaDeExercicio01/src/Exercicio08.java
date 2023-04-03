import java.util.Scanner;

//(08) Escreva um algoritmo para ler o número total de eleitores de um  município, o número de votos brancos, nulos e válidos. 
//Calcular e escrever o percentual que cada um representa em relação ao total de eleitores.

public class Exercicio08 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe o número total de eleitores: ");
        float totalEleitores = leitor.nextFloat();
        
        System.out.print("Informe o número de votos brancos: ");
        float votosBrancos = leitor.nextFloat();
        
        System.out.print("Informe o número de votos nulos: ");
        float votosNulos = leitor.nextFloat();
        
        System.out.print("Informe o número de votos válidos: ");
        float votosValidos = leitor.nextFloat();
                
        System.out.print("Dos votos foram " + ((votosBrancos/totalEleitores)*100) + "% brancos " + ((votosNulos/totalEleitores)*100) + "% nulos " + ((votosValidos/totalEleitores)*100) + "% válidos.");
        
        leitor.close();
    }
}