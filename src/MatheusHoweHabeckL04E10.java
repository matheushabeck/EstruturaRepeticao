import java.util.Scanner;

public class MatheusHoweHabeckL04E10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        boolean numeroPrimo= true;

        if (numero <= 1) {
            numeroPrimo= false;
        } else {
            for (int i= 2; i<= numero - 1; i++) {
                if (numero % i == 0) {
                    numeroPrimo= false;
                    break;
                }
            }
        }

        if (numeroPrimo) {
            System.out.println(numero + " é um número primo.");
        } else {
            System.out.println(numero + " não é um número primo.");
        }
    }
}