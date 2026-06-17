import java.util.Scanner;

public class MatheusHoweHabeckL04E07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int somaPositivos= 0, quantidadeNegativos= 0;

        for (int i= 0; i<= 20; i++) {
            System.out.print("Digite o " + i + "º valor inteiro: ");
            int numero = scanner.nextInt();

            if (numero> 0) {
                somaPositivos+= numero;
            } else if (numero< 0) {
                quantidadeNegativos++;
            }
        }
        System.out.println("Soma dos números positivos: " + somaPositivos);
        System.out.println("Quantidade de números negativos: " + quantidadeNegativos);
    }
}