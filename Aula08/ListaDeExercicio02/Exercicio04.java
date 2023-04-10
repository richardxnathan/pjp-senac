import java.util.Scanner;

//(04) Escreva um algoritmo para ler a hora de início de um jogo e a hora do final do jogo (considerando apenas horas inteiras) e calcular a duração do jogo em horas, 
//sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo pode iniciar em um dia e terminar no dia seguinte.

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe a hora de inicio do jogo: ");
        int horaInicial = leitor.nextInt();

        System.out.print("Informe a hora do fim do jogo: ");
        int horaFinal = leitor.nextInt();

        if (horaFinal > horaInicial) {
            System.out.print("O jogo durou " + (horaFinal-horaInicial) + " hora(s).");
        } else if (horaInicial > horaFinal){
            System.out.print("O jogo durou " + ((horaFinal+24)-horaInicial) + " hora(s).");
        } else {
            System.out.print("O jogo durou 24 horas.");
        }

        leitor.close();

    }
}