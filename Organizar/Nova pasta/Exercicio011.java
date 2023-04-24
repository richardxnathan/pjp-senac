import java.util.Scanner;

//(11) Escreva um algoritmo para ler um número inteiro e positivo e
// informar qual o próximo número perfeito a partir dele.

public class Exercicio011 {

    public static void main (String [] args){

        Scanner leitor =  new Scanner(System.in);

        System.out.print("Informe um número inteiro e positivo: ");
        long numero = leitor.nextLong();
        numero++;

        byte quantidadePerfeito = 0;

        while(quantidadePerfeito < 1){
            long somaDivisores = 0;

            for(long i = 1; i < numero; i++){
                if(numero % i == 0){
                    somaDivisores += i;
                }
            }
            
            if(numero == somaDivisores){
                System.out.print("\nO próximo número perfeito depois desse é o " + numero);
                quantidadePerfeito++;
            }

            numero++;
        }
        leitor.close();
    }
}

