import java.util.Scanner;

public class DescontoIRPF {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do Funcionário: ");
        String nomeFuncionario = scanner.nextLine();

        System.out.print("Salário Fixo: R$ ");
        double salarioFixo = scanner.nextDouble();

        double aliquotaIRPF = calcularIRPF(salarioFixo);
        double descontoIRPF = salarioFixo * aliquotaIRPF;
        double salarioLiquido = salarioFixo - descontoIRPF;

        System.out.println("\nFuncionário: " + nomeFuncionario);
        System.out.println("Salário Fixo: R$ " + salarioFixo);
        System.out.println("Alíquota IRPF: " + aliquotaIRPF * 100 + "%");
        System.out.println("Desconto IRPF: R$ " + descontoIRPF);
        System.out.println("Salário Líquido: R$ " + salarioLiquido);
    }

    private static double calcularIRPF(double salarioFixo) {
        if (salarioFixo <= 2259.20) {
            return 0;
        } else if (salarioFixo <= 2826.65) {
            return 0.075;
        } else if (salarioFixo <= 3751.05) {
            return 0.15;
        } else if (salarioFixo <= 4664.68) {
            return 0.2255;
        } else {
            return 0.275;
        }
    }
}
