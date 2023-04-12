
public class Exemplo01 {

	public static void main (String [] args){
        
        float salario = 1000;
        float aumento = 0;
        
        aumento = salario <= 2500 ? 1.15f : 1.05f;
        
        System.out.print("O salário atual é: " + (salario * aumento));
       
    }
}
