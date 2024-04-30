import java.util.Scanner;

public class CalculoINSS {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o nome do funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.print("Informe o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        double valorINSS = calcularINSS(salarioFixo);

        System.out.printf("Funcionário: %s\n", nomeFuncionario);
        System.out.printf("Salário Fixo: R$ %.2f\n", salarioFixo);
        System.out.printf("Desconto INSS: R$ %.2f\n", valorINSS);
        System.out.printf("Salário Líquido: R$ %.2f\n", salarioFixo - valorINSS);
    }

    private static double calcularINSS(double salarioFixo) {
        if (salarioFixo <= 1412.00) {
            return salarioFixo * 0.075;
        } else if (salarioFixo <= 2666.68) {
            return salarioFixo * 0.09;
        } else if (salarioFixo <= 4000.03) {
            return salarioFixo * 0.12;
        } else if (salarioFixo <= 7786.02) {
            return salarioFixo * 0.14;
        } else {
            return 7786.02 * 0.14 + (salarioFixo - 7786.02) * 0.06;
        }
    }
}