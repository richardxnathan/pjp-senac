import java.util.Scanner;

//(12) A prefeitura de uma cidade fez uma pesquisa entre seus habitantes. Escreva um algoritmo para ler o salário e número de filhos dos habitantes e escrever:  
//	a) média do salário da população;
//	b) média do número de filhos;
//	c) maior salário;
//	d) percentual de pessoas com salário até R$ 100,00.
//O final da leitura de dados dar-se-á com a entrada de um salário negativo. 

public class Exercicio012 {

    public static void main (String [] args){

        Scanner leitor =  new Scanner(System.in);

        float salario = 0;
        byte numeroDeFilhos = 0;
        float totalSalario = 0;
        float totalFilhos = 0;
        float maiorSalario = 0;
        int quantidadeDeEntrevistados = 0;
        int quantidadeSalario100 = 0;

        do{
            System.out.print("\nInforme o salário ou caso deseje parar insira um numero negativo: ");
            salario = leitor.nextFloat();

            if(salario<0){break;}

            System.out.print("Informe a quantidade de filhos: ");
            numeroDeFilhos = leitor.nextByte();

            totalSalario += salario;
            totalFilhos += numeroDeFilhos;

            if(salario>maiorSalario){
                maiorSalario = salario;
            }

            if(salario<= 100){
                quantidadeSalario100++;
            }

            quantidadeDeEntrevistados++;

        }while(salario >=0 );
        
        System.out.println("\nA média do salário da população é " + (totalSalario/quantidadeDeEntrevistados));
        System.out.println("A média do número de filhos é " + (totalFilhos/quantidadeDeEntrevistados));
        System.out.println("O maior salário encontrado foi " + (maiorSalario));
        System.out.println("O percentual de pessoas com salário até R$ 100,00 foi de " + ((quantidadeSalario100*100)/quantidadeDeEntrevistados) + "%.");

        leitor.close();
    }
}

