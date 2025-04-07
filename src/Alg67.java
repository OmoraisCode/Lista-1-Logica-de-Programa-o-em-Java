/*
Alg 67: Efetuar o cálculo do valor de uma prestação em atraso, utilizando a fórmula:
prestacao = valor + (valor * (taxa/100) * tempo)
 */
import java.util.Scanner;

public class Alg67 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor da prestação
        System.out.print("Digite o valor da prestação: R$ ");
        double valor = scanner.nextDouble();

        // Entrada da taxa de juros
        System.out.print("Digite a taxa de juros (em %): ");
        double taxa = scanner.nextDouble();

        // Entrada do tempo em atraso
        System.out.print("Digite o tempo em atraso (em meses): ");
        int tempo = scanner.nextInt();

        // Cálculo do valor da prestação em atraso
        double prestacao = valor + (valor * (taxa / 100) * tempo);

        // Impressão do resultado
        System.out.printf("O valor da prestação em atraso é: R$ %.2f%n", prestacao);

        scanner.close();
    }
}
