import java.util.Scanner;

//(10) Uma revendedora de carros usados paga a seus funcionários um salário fixo por mês, mais uma comissão em reais para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. 
//Escreva um algoritmo para ler o número de carros vendidos por um vendedor, o valor total de suas vendas, o salário fixo e o valor que ele recebe por carro vendido. 
//Calcule e escreva o salário final do vendedor.

public class Exercicio10 {

	public static void main (String [] args){
        
        Scanner leitor =  new Scanner(System.in);
        
        System.out.print("Informe o salário do funcionário: ");
        float salario = leitor.nextFloat();
        
        System.out.print("Informe o número de carros vendidos: ");
        float quantidadeCarros = leitor.nextFloat();
        
        System.out.print("Informe o montante total das vendas: ");
        float totalVendas = leitor.nextFloat();
        
        System.out.print("Informe o montante que o funcionário recebe por carro vendido: ");
        float comissaoFixa = leitor.nextFloat();
        
        System.out.print("O salário do funcionário é R$" + ((quantidadeCarros*comissaoFixa) + (totalVendas*0.05) + salario));
            
        leitor.close();
    }
}