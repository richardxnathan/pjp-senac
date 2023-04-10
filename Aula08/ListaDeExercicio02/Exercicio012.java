import java.util.Scanner;

//(12) Escreva um algoritmo para ler um conjunto de quatro valores I, A, B, C, onde I é um valor inteiro e positivo
// e A, B, C, são quaisquer valores reais. A seguir: 

//a) Se I = 1 escrever os três valores A, B, C em ordem crescente.
//b) Se I = 2 escrever os três valores A, B, C em ordem decrescente.

public class Exercicio012 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe um número: ");
        float A = leitor.nextFloat();

        System.out.print("Informe outro número: ");
        float B = leitor.nextFloat();

        System.out.print("Informe um terceiro número: ");
        float C = leitor.nextFloat();

        float nMaior = 0;
        float nMenor = 0;
        float nMedio = 0;

        if(A>B && A>C){
            nMaior = A;
            if(B>C){
                nMedio = B;
                nMenor = C;
            } else {
                nMedio = C;
                nMenor = B;
            }
        } else if (B>A && B>C){
            nMaior = B;
            if(A>C){
                nMedio = A;
                nMenor = C;
            } else {
                nMedio = C;
                nMenor = A;
            }
        } else {
            nMaior = C;
            if(A>B){
                nMedio = A;
                nMenor = B;
            } else {
                nMedio = B;
                nMenor = A;
            }
        }
        
        System.out.print("\nDigite [1] para ver os números digitados em ordem crescente e [2] para decrescente: ");
        byte I = leitor.nextByte();

        if(I == 1){
            System.out.println(nMenor + " , " + nMedio + " e " + nMaior);
        } else {
            System.out.println(nMaior + " , " + nMedio + " e " + nMenor);
        }

        leitor.close();
    }
}