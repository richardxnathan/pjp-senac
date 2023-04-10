import java.util.Scanner;

//(07) Escreva um algoritmo para ler a idade de um nadador e classificá-lo em uma das seguintes categorias:

//  Infantil A = 5-7 anos

//  Infantil B = 8-10 anos

//  Juvenil A = 11-13 anos

//  Juvenil B = 14-17 anos

//  Adulto = maiores de 18 anos

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a idade da pessoa: ");
        byte idade = leitor.nextByte();

        switch(idade){
            case 1,2,3,4:
            System.out.print("A pessoa ainda não pode competir.");
                break;

            case 5,6,7:
                System.out.print("A pessoa irá nadar na categoria Infantil A.");
                break;

            case 8,9,10:
                System.out.print("A pessoa irá nadar na categoria Infantil B.");
                break;

            case 11,12,13:
                System.out.print("A pessoa irá nadar na categoria Juvenil A.");
                break;

            case 14,15,16,17:
                System.out.print("A pessoa irá nadar na categoria Juvenil B.");
                break;

            default:
                System.out.print("A pessoa irá nadar na categoria Adulto.");
        }

        leitor.close();

    }
}