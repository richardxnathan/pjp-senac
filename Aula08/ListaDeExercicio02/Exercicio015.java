import java.util.Scanner;

//(15) O departamento que controla o índice de poluição do meio ambiente mantém três grupos de indústrias que são altamente poluentes.
//O índice de poluição aceitável varia de 0,05 até 0,25. Se o índice sobe para 0,3 as indústrias do primeiro grupo são intimadas a 
//suspenderem suas atividades. Caso o índice cresce para 0,4 as empresas do primeiro e segundo grupo são intimadas a suspenderem suas 
//atividades. Por fim, se o índice atingir 0,5 todos os três grupos devem ser notificados a paralisarem suas atividades. 
//Escreva um algoritmo para ler o índice de poluição medido e emitir a notificação adequada aos diferentes grupos de empresas.

public class Exercicio015 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe o indice de poluição: ");
        float indicePoluicao = leitor.nextFloat();

        byte opcao = 0;

        if(indicePoluicao >= 0.5){
            opcao = 1;
        } else if (indicePoluicao >= 0.4){
            opcao = 2;
        } else if (indicePoluicao >= 0.3){
            opcao = 3;
        }

        System.out.print("\nAs empresas do(s) grupo(s)");

        switch(opcao){
            case 1:
                System.out.print(" 3 ");
            case 2:
                System.out.print(" 2 ");
            case 3:
                System.out.print(" 1 precisam parar.");
                break;
            default:
                System.out.print(" de controle não precisam parar.");
        }

    leitor.close();
    }
}