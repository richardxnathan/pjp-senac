import java.util.Scanner;

//(10) Um banco concederá crédito especial aos seus clientes, variável dependente do saldo médio no último ano. 
//Escreva um algoritmo para ler o saldo médio de um cliente e calcule o valor do crédito de acordo com a tabela abaixo. 
//Mostre uma mensagem informando o saldo médio e o valor do crédito. 
 
//	Saldo Médio 	Percentual
	
//	de 0 a 200 	    nenhum crédito
	
//	de 201 a 400 	20% do valor do saldo médio
	
//	de 401 a 600 	30% do valor do saldo médio
	
//	acima de 601 	40% do valor do saldo médio

public class Exercicio010 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o saldo médio: ");
        float saldo = leitor.nextFloat();

        int opcao = 0;

        if(saldo>=0 && saldo<=200){
            opcao = 0;
        } else if (saldo>=201 && saldo<=400) {
            opcao = 1;
        } else if (saldo>=401 && saldo<=600) {
            opcao = 2;
        } else if (saldo>=601) {
            opcao = 3;
        } else {
            opcao = 4;
        }

        switch(opcao){
            case 0:
                System.out.print("\nO saldo médio foi de R$" + saldo + " você não tem direito a nenhum credito no momento.");
                break;

            case 1:
                System.out.print("\nO saldo médio foi de R$" + saldo + " você tem direito ao seguinte valor de credito R$" + (saldo*0.2));
                break;

            case 2:
                System.out.print("\nO saldo médio foi de R$" + saldo + " você tem direito ao seguinte valor de credito R$" + (saldo*0.3));
                break;

            case 3:
                System.out.print("\nO saldo médio foi de R$" + saldo + " você tem direito ao seguinte valor de credito R$" + (saldo*0.4));
                break;

            case 4:
                System.out.print("\nO saldo médio foi de R$" + saldo + " você não tem direito a nenhum credito no momento.");
                break;
        }
        leitor.close();
    }
}