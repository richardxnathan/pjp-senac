//(05) Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metro e cresce 3 centímetros por ano. 
//Escreva um algoritmo para calcular e imprimir quantos anos serão necessários para que Zé seja maior que Chico.

public class Exercicio05 {

	public static void main (String [] args){
        
        double alturaChico = 1.50;
        double alturaZe = 1.10;
        byte anos = 0;
        
		do{
            alturaChico += 0.02;
            alturaZe += 0.03;
            anos++;
        } while(alturaChico>alturaZe);

        System.out.println("Serão necessários " + anos + " anos para Zé ficar maior que Chico.");
    }
}
