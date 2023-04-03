import java.util.Scanner;

//(07) Escreva um algoritmo para ler o salário atual de um funcionário e o percentual de reajuste e calcular o seu novo salário.

public class Exercicio07 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe o salário atual do funcionário: ");
        float salario = leitor.nextFloat();
        
        System.out.print("Informe o percentual de reajuste do salário do funcionário: ");
        float reajuste = leitor.nextFloat();
        
        System.out.print("O salário atual será R$" + (((reajuste/100)+1)*salario) + ".");
        
        leitor.close();
    }
}