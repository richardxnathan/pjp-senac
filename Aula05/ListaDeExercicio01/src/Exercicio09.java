import java.util.Scanner;

//(09) O custo ao consumidor de um carro novo é a soma do custo de fábrica com o percentual do distribuidor e dos impostos (aplicados ao custo de fábrica). 
//O percentual do distribuidor é de 28% e os impostos de 45%. Escreva um algoritmo para ler o custo de fábrica de um carro e escreva o custo ao consumidor.

public class Exercicio09 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe o custo de fábrica do carro: ");
        float preco = leitor.nextFloat();
        
        System.out.print("O carro custa ao consumidor R$" + ((preco*1.45)*1.28));
            
        leitor.close();
    }
}