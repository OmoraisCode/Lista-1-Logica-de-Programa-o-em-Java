/*
Alg 61: Entrar com a razão de uma PG e o valor do 1º termo. Calcular e imprimir o 5º termo da série.
 */
import java.util.Scanner;

public class Alg61 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        // Entrada do primeiro termo
        System.out.print("Digite o valor do 1º termo (a1): ");
        double a1 = scanner.nextDouble();

        // Entrada da razão
        System.out.print("Digite a razão (r): ");
        double r = scanner.nextDouble();

        // Cálculo do 5º termo
        int n = 5; // queremos o 5º termo
        double a5 = a1 * Math.pow(r, n - 1);

        // Impressão do resultado
        System.out.printf("O 5º termo da PG é: %.2f%n", a5);

        scanner.close();

    }
}
