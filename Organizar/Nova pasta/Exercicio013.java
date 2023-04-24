import java.util.Scanner;

//(13) Em uma eleição presidencial existem quatro candidatos. Os votos são informados através de códigos. Os dados utilizados para a contagem dos votos obedecem à seguinte codificação:  
//	- 1,2,3,4 = voto para os respectivos candidatos;
//	- 5 = voto nulo;
//	- 6 = voto em branco;
//Escreva um algoritmo para ler o código do candidato em um voto. Calcular e escrever:
//    - total de votos para cada candidato;
//    - total de votos nulos;
//    - total de votos em branco;
// Como finalizador do conjunto de votos, tem-se o valor 0.

public class Exercicio013 {

    public static void main (String [] args){

        Scanner leitor =  new Scanner(System.in);

        int votoUm = 0;
        int votoDois = 0;
        int votoTres = 0;
        int votoQuatro = 0;
        int votoNulo = 0;
        int votoBranco = 0;

        while(true){
            System.out.print("Informe o seu voto ou 0 para encerrar: ");
            byte voto = leitor.nextByte();
            switch(voto){
                case 0:
                    false;
                    break;

                case 1:
                    votoUm++;
                    break;

                case 2:
                    votoDois++;
                    break;

                case 3:
                    votoTres++;
                    break;

                case 4:
                    votoQuatro++;
                    break;

                case 5:
                    votoNulo++;
                    break;

                case 6:
                    votoBranco++;
                    break;
                    
            }

        }


            
        

        leitor.close();
    }
}

