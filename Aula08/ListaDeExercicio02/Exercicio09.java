import java.util.Scanner;

//(09) O cardápio de uma lanchonete é o seguinte:
	
//	Produto		    Código  Preço
	
//	Cachorro-quente	100 	1,20
	
//	Bauru simples 	101 	1,30
	
//	Bauru com ovo 	102 	1,50
	
//	Hambúrguer 	    103 	1,20
	
//	Misto Quente 	104 	1,30
	
//	Refrigerante 	105 	1,00

//Escreva um algoritmo para ler o código do item pedido, a quantidade e calcule o valor a ser pago por aquele lanche.

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o código do produto que você deseja: ");
        byte produto = leitor.nextByte();

        System.out.print("Informe a quantidade do produto que você deseja: ");
        byte quantidade = leitor.nextByte();

        switch(produto){
            case 100:
                System.out.print("O total a ser pago é de R$" + (quantidade*1.2));
                break;

            case 101:
                System.out.print("O total a ser pago é de R$" + (quantidade*1.3));
                break;

            case 102:
                System.out.print("O total a ser pago é de R$" + (quantidade*1.5));
                break;

            case 103:
                System.out.print("O total a ser pago é de R$" + (quantidade*1.2));
                break;

            case 104:
                System.out.print("O total a ser pago é de R$" + (quantidade*1.3));
                break;

            case 105:
                System.out.print("O total a ser pago é de R$" + (quantidade*1.0));
                break;

            default:
                System.out.print("Código de produto incorreto.");
        }

        leitor.close();
    }
}