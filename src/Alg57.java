/*
Alg 57: Entrar com as notas da PR1 e PR2 e imprimir a média final
Truncada
 */

import java.util.Scanner;

public class Alg57 {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira as notas da PR1 e PR2
        System.out.print("Digite a nota da PR1: ");
        double notaPR1 = scanner.nextDouble();

        System.out.print("Digite a nota da PR2: ");
        double notaPR2 = scanner.nextDouble();

        // Calcula a média final
        double mediaFinal = (notaPR1 + notaPR2) / 2;

        // Trunca a média final
        int mediaTruncada = (int) mediaFinal; // Converte para inteiro, truncando a parte decimal

        // Imprime o resultado
        System.out.println("A média final truncada é: " + mediaTruncada);

        // Fecha o scanner
        scanner.close();
    }
}