import java.util.Scanner;

public class Idade {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade em dias: ");
        int idadeDias = scanner.nextInt();

        int anos = idadeDias / 365;
        int diasRestantes = idadeDias % 365;

        int meses = diasRestantes / 30;
        int diasRestantesMeses = diasRestantes % 30;

        System.out.println("Sua idade em anos, meses e dias é:");
        System.out.println(anos + " anos");
        System.out.println(meses + " meses");
        System.out.println(diasRestantesMeses + " dias");
    }
}


