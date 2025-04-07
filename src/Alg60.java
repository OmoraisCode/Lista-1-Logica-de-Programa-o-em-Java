/*
Alg 60: Entrar com a razão de uma PA e o valor do 1º termo. Calcular e imprimir o 10º termo da série.
 */
import java.util.Scanner;
public class Alg60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do 1º termo (a1): ");
        double P1 = scanner.nextDouble();
        System.out.println("Digite a razão de PA (r)");
        double razao = scanner.nextDouble();

        // Calcular o 10º termo
        int n = 10; // 10º termo
        double decimoTermo = P1 + (n - 1) * razao;
        // Imprimir o resultado
        System.out.printf("O 10º termo da PA é: %.2f%n", decimoTermo);

        // Fechar o scanner
        scanner.close();

    }
}
