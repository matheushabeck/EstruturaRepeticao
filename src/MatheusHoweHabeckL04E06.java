import java.util.Scanner;

public class MatheusHoweHabeckL04E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int fatorial= 1;

        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();

        if (numero< 0) {
            System.out.println("O número não pode ser negativo.");
        } else {
            for (int i= 1; i<= numero; i++) {
                fatorial *= i;
            }

            System.out.println(numero + "! = " + fatorial);
        }
    }
}