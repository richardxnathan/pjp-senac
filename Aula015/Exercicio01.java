import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Informe quantos alunos há na turma: ");
        byte quantidadeAlunos = leitor.nextByte();

        System.out.print("Informe quantas notas cada um possui: ");
        byte quantidadeNotas = leitor.nextByte();

        float melhorMedia = 0;
        byte alunoMelhorMedia = 0;
        float mediaDaTurma = 0;

        float[][] notas = new float[quantidadeAlunos][quantidadeNotas];
        float[][] medias = new float[quantidadeAlunos][1];

        for (byte i = 0; i < quantidadeAlunos; i++) {
            float media = 0;
            for (byte j = 0; j < quantidadeNotas; j++) {

                System.out.print("Informe a " + (j + 1) + "ª nota do aluno " + (i + 1) + ": ");
                float nota = leitor.nextFloat();
                notas[i][j] = nota;

                media += nota;
            }
            medias[i][0] = media / quantidadeNotas;
        }

        for (byte i = 0; i < quantidadeAlunos; i++) {
            System.out.println("\nA média do aluno " + (i + 1) + " foi: " + medias[i][0]);
            if (medias[i][0] > melhorMedia) {
                melhorMedia = medias[i][0];
                alunoMelhorMedia = i;
            }
            mediaDaTurma += medias[i][0];
        }

        System.out.println("\nA média da turma foi " + mediaDaTurma / quantidadeAlunos);
        System.out.print("E o aluno com melhor media foi o " + (alunoMelhorMedia + 1) + "º com a média de " + melhorMedia);

        leitor.close();
    }
}
