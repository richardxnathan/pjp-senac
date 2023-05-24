public class Principal {

    public static void main(String[] args) {

        Empregado[] empregados = new Empregado[3];

        empregados[0] = new Professor("João", (byte) 27, "123", "12345", 15F, null);
        empregados[1] = new Professor("Lucas", (byte) 36, "321", "54321", 15F, null);
        empregados[2] = new Diretor("Maria", (byte) 40, "345", "56789", 25F, null);

        System.out.println("Relatório:\n ");

        for (Empregado empregado : empregados) {
            System.out.println("Nome do Empregado: " + empregado.getNome());
            System.out.println("Salário do Empregado: " + empregado.calcularSalario());
            System.out.println();
        }
    }

}
