import java.util.Scanner;

class Calculadora {
    public static void main(String[] args) {
        char operador;
        Double n1, n2, resultado;

        // create an object of Scanner class
        Scanner entrada = new Scanner(System.in);

        // escolha do operador
        System.out.println("Escolha um operador: +, -, *, or /: ");
        operador = entrada.next().charAt(0);

        // escolha dos números
        System.out.println("Digite o primeiro número: ");
        n1 = entrada.nextDouble();

        System.out.println("Digite o segundo número: ");
        n2 = entrada.nextDouble();

        switch (operador) {
            // adição
            case '+':
                resultado = n1 + n2;
                System.out.println(n1 + " + " + n2 + " = " + resultado);
                break;
            // subtração
            case '-':
                resultado = n1 - n2;
                System.out.println(n1 + " - " + n2 + " = " + resultado);
                break;
            // multiplicação
            case '*':
                resultado = n1 * n2;
                System.out.println(n1 + " * " + n2 + " = " + resultado);
                break;
            // divisão
            case '/':
                if (n2 != 0) {
                    resultado = n1 / n2;
                    System.out.println(n1 + " / " + n2 + " = " + resultado);
                } else {
                    System.out.println("Não é possível dividir por zero.");
                }
                break;
            default:
                System.out.println("Operador inválido!");
                break;
        }

        entrada.close();
    }
}