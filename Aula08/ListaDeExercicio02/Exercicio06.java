import java.util.Scanner;

//(06) Escreva um algoritmo para ler as medidas dos lados de um triângulo e escrever se ele é Equilátero, Isósceles ou Escaleno. Sendo que:

//  −Triângulo Equilátero: possui os 3 lados iguais;
    
//  −Triângulo Isósceles: possui 2 lados iguais;
    
//  −Triângulo Escaleno: possui 3 lados diferentes.

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.print("Informe o lado A do triângulo: ");
        byte A = leitor.nextByte();

        System.out.print("Informe o lado B do triângulo: ");
        byte B = leitor.nextByte();

        System.out.print("Informe o lado C do triângulo: ");
        byte C = leitor.nextByte();

        if (A == B && A == C) {
            System.out.print("Esses números formam um triângulo equilátero.");
        } else if (A == B || A == C || B == C){
            System.out.print("Esses números formam um triângulo isóceles.");
        } else {
            System.out.print("Esses números formam um triângulo escaleno.");
        }

        leitor.close();

    }
}