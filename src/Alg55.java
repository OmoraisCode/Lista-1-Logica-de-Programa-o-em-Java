/*
Alg 55: Criar um algoritmo que calcule i emprima a área de um losango
 */

import java.util.Scanner;

public class Alg55 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a diagonal maior do losango
        System.out.print("Digite a diagonal maior do losango (d1): ");
        double d1 = scanner.nextDouble();

        // Solicita ao usuário que insira a diagonal menor do losango
        System.out.print("Digite a diagonal menor do losango (d2): ");
        double d2 = scanner.nextDouble();

        // Calcula a área do losango
        double area = (d1 * d2) / 2;

        // Imprime o resultado
        System.out.printf("A área do losango é: %.2f%n", area);

        // Fecha o scanner
        scanner.close();
    }
}