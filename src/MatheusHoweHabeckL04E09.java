import java.util.Scanner;

public class MatheusHoweHabeckL04E09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int primeiroNumero = 0;
        int segundoNumero = 1;

        System.out.print("Digite a quantidade de números para a sequência de Fibonaci: ");
        int numero = scanner.nextInt();

        System.out.println("Série de Fibonacci:");

        for (int i = 1; i <= numero; i++) {
            System.out.println(primeiroNumero);

            int proximo = primeiroNumero + segundoNumero;
            primeiroNumero = segundoNumero;
            segundoNumero = proximo;
        }
    }
}