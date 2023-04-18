//(08) Escreva um algoritmo para calcular e escrever o produto dos números primos entre 92 e 107.

public class Exercicio08 {

	public static void main (String [] args){
        
		long total = 1;
		
		for(byte i = 92; i < 108; i++) {
			byte contador = 0;
		
			for(int j = 1; j <= i ; j++) {
				if(i%j == 0) {
					contador++;
				}
			}
        
			if(contador == 2) {
				total *= i;
			}
		}
	    System.out.print("O produto dos números primos entre 92 e 107 é: " + total);
    }
}

