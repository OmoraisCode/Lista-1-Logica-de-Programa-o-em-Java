/*
Alg 79: Uma pessoa resolveu fazer uma aplicação em uma poupança programada.
Para calcular seu rendimento, ela deverá fornecer o valor constante da aplicação mensal, a taxa e o número de meses.
Sabendo-se que a fórmula usada para este cálculo é: P_acumulado = P * [(1 + i)^n - 1] / i,
onde i = taxa | P = aplicação mensal | n = número de meses.
*/

import java.util.Scanner;

public class Alg79 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor da aplicação mensal
        System.out.print("Digite o valor da aplicação mensal: ");
        double P = scanner.nextDouble();

        // Ler a taxa de juros
        System.out.print("Digite a taxa de juros (em %): ");
        double i = scanner.nextDouble() / 100;

        // Ler o número de meses
        System.out.print("Digite o número de meses: ");
        int n = scanner.nextInt();

        // Calcular o valor acumulado
        double P_acumulado = P * ((Math.pow(1 + i, n) - 1) / i);

        // Exibir o resultado
        System.out.printf("O valor acumulado após %d meses é: R$ %.2f%n", n, P_acumulado);

        scanner.close();
    }
}