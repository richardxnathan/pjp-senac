//(10) Escreva um algoritmo para gerar e escrever os 5 primeiros números perfeitos. 
//Um número perfeito é aquele que é igual a soma dos seus divisores (6 = 1 + 2 + 3 e 28 = 1 + 2 + 4 + 7 + 14).

public class Exercicio010 {

    public static void main (String [] args){

        byte quantidadePerfeito = 0;
        long numero = 2;

        while(quantidadePerfeito <= 5){
            long somaDivisores = 0;

            for(long i = 1; i < numero; i++){
                if(numero % i == 0){
                    somaDivisores += i;
                }
            }
            
            if(numero == somaDivisores){
                System.out.println(numero);
                quantidadePerfeito++;
            }

            numero++;
        }
    }
}

