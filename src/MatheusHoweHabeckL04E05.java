import java.util.Scanner;

public class MatheusHoweHabeckL04E05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        for (int i= 0; i<= 15; i++) {
            System.out.println(numero + "x" + i + "=" + (numero * i));
        }
    }
}