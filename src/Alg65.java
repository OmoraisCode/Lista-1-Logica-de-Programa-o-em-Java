/*
Alg 65: Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula: volume =
3.14159 * R2 * altura.
 */

import java.util.Scanner;
public class Alg65 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Entrada do raio da lata
        System.out.print("Digite o raio da lata de óleo (em metros): ");
        double raio = scanner.nextDouble();

        // Entrada da altura da lata
        System.out.print("Digite a altura da lata de óleo (em metros): ");
        double altura = scanner.nextDouble();

        // Cálculo do volume
        double volume = 3.14159 * Math.pow(raio, 2) * altura;

        // Impressão do resultado
        System.out.printf("O volume da lata de óleo é: %.2f m³%n", volume);

        scanner.close();
    }
}
