/*
Alg 53: Entrar com os lados a, b, c, de um paralelepípedo. Calcular e imprimir a diagonal

 */

import java.util.Scanner;

public class Alg53 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira os lados a, b e c do paralelepípedo
        System.out.print("Digite o lado a do paralelepípedo: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o lado b do paralelepípedo: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o lado c do paralelepípedo: ");
        double c = scanner.nextDouble();

        // Calcula a diagonal do paralelepípedo
        double diagonal = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2));

        // Imprime o resultado
        System.out.printf("A diagonal do paralelepípedo é: %.2f%n", diagonal);

        // Fecha o scanner
        scanner.close();
    }
}
