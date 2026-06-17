import java.util.Scanner;

public class MatheusHoweHabeckL04E08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int maior = 0, menor= 0, soma= 0;

        for (int i= 1; i<= 10; i++) {
            System.out.print("Digite o " + i + "º número inteiro: ");
            int numero = scanner.nextInt();

            if (i == 1) {
                maior= numero;
                menor= numero;
            } else {
                if (numero> maior) {
                    maior= numero;
                }

                if (numero< menor) {
                    menor = numero;
                }
            }
            soma += numero;
        }
        double media= soma / 10.0;

        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);
        System.out.println("Média dos números: " + media);
    }
}