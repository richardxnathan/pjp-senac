//(02) Escreva um algoritmo para criar e popular um vetor com os 10 primeiros números primos.

public class Exercicio02 {

    public static void main(String[] args) {

        byte[] numerosPrimos = new byte[10];

        byte contadorDePrimo = 0;

        while (true) {
            for (byte i = 0; i < 100; i++) {
                byte contador = 0;

                for (int j = 1; j <= i; j++) {
                    if (i % j == 0) {
                        contador++;
                    }
                }

                if (contador == 2) {
                    numerosPrimos[contadorDePrimo] = i;
                    System.out.print(numerosPrimos[contadorDePrimo] + " ");
                    contadorDePrimo++;
                }
                if (contadorDePrimo == 10) {
                    break;
                }
            }
        }
    }
}
