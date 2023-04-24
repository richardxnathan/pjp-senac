//(01) Escreva um algoritmo para gerar e escrever os números ímpares entre 100 e 200.

public class Exercicio01 {

	public static void main (String [] args){
		
        System.out.println("Os números ímpares entre 100 e 200 são:");
             
        for(int i = 100; i <= 200 ; i++) {
        	if(i%2!=0){
                System.out.print(i + ", ");
            }
        }
    }
}
