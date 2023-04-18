import java.util.Scanner;

//(14) Foi feita uma pesquisa entre os habitantes de uma região. Escreva um algoritmo para ler idade, sexo (m/f) e salário dos habitantes. Calcular e escrever:
//a) a média de salário da população;
//b) maior e menor idade da população;
//c) quantidade de mulheres com salário até R$ 100,00.
//Encerre a entrada de dados quando for digitada uma idade negativa.

public class Exercicio014 {

	public static void main (String [] args){
		
		Scanner leitor =  new Scanner(System.in);

        byte idade = 0;
        byte idadeMaior = 0;
        byte idadeMenor = 0;
        byte sexo = 0;
        int sexoMasculino = 0;
        int sexoFeminino = 0;
        int mulherSalario100 = 0;
        float salario = 0;
        float salarioTotal = 0;
        int contador = 0;

        while(true){
            System.out.print("Informe a idade em números ou um número negativo para encerrar: "); 
            idade = leitor.nextByte();

            if(idade<0){
                break;
            }

            System.out.print("Insira [1] para sexo masculino e [2] para sexo feminino: ");
            sexo = leitor.nextByte();

            System.out.print("Informe o salário: ");
            salario = leitor.nextFloat();

            if(idadeMenor == 0){
                idadeMenor = idade;
            }
            
            if(idade<idadeMenor){
                idadeMenor=idade;
            }

            if(idade>idadeMaior){
                idadeMaior=idade;
            }

            if(sexo == 1){
                sexoMasculino++;
            } else {
                sexoFeminino++;
                if(salario <= 100){
                    mulherSalario100++;
                }
            }

            salarioTotal += salario;
            contador++;
        }
		System.out.println("\nA média de salário da população foi de R$" + (salarioTotal/contador));
        System.out.println("A maior e menor idade da população foram, respectivamente, " + idadeMaior + " e " + idadeMenor);
        System.out.print("E a quantidade de mulheres com salário até R$ 100,00 foi de " + mulherSalario100);

    }
}

