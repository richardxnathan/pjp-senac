import java.util.Scanner;

//(11) Escreva um algoritmo para ler o salário e o código do cargo de um funcionário e calcule o novo salário usando a tabela abaixo. 
//Se o cargo do funcionário não estiver na tabela, ele deverá, então, receber 40% de aumento. 
//Mostre o salário antigo, o novo salário e a diferença.
 
//	Código	Cargo 	Percentual

//	101 	Gerente 	10%
	
//	102 	Engenheiro 	20%
	
//	103 	Técnico 	30%

public class Exercicio011 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o salário do funcionário: ");
        float salario = leitor.nextFloat();

        System.out.print("Informe o código do cargo do funcionário: ");
        byte codigoCargo = leitor.nextByte();

        float aumento = 1.4f;

        switch(codigoCargo){
            case 101:
                aumento = 1.1f;
                break;

            case 102:
                aumento = 1.2f;
                break;

            case 103:
                aumento = 1.3f;
                break;
        }
        
        System.out.println("\nSalário antigo: " + salario);
        System.out.println("Salário atual: " + (salario*aumento));
        System.out.println("Diferença: " + ((salario*aumento) - salario));

        leitor.close();
    }
}