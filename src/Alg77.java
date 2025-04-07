/*
Alg 77: Ler dois números reais e imprimir o quadrado da diferença do primeiro valor pelo segundo e a diferença dos quadrados.
*/

import java.util.Scanner;

public class Alg77 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler dois números reais
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        // Calcular a diferença e o quadrado da diferença
        double diferenca = num1 - num2;
        double quadradoDiferenca = Math.pow(diferenca, 2);
        double diferencaDosQuadrados = Math.pow(num1, 2) - Math.pow(num2, 2);

        // Exibir os resultados
        System.out.printf("Quadrado da diferença: %.2f%n", quadradoDiferenca);
        System.out.printf("Diferença dos quadrados: %.2f%n", diferencaDosQuadrados);

        scanner.close();
    }
}
