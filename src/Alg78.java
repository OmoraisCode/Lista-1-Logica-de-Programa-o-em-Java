/*
Alg 78: Dado um polígono conexo de n lados, podemos calcular o número de diagonais diferentes (nd) desse polígono pela fórmula:
nd = n * (n - 3) / 2. Fazer um algoritmo que leia quantos lados tem o polígono, calcule e escreva o número de diagonais diferentes (nd) do mesmo.
*/

import java.util.Scanner;

public class Alg78 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o número de lados do polígono
        System.out.print("Digite o número de lados do polígono: ");
        int n = scanner.nextInt();

        // Calcular o número de diagonais
        int diagonais = n * (n - 3) / 2;

        // Exibir o resultado
        System.out.printf("O número de diagonais do polígono é: %d%n", diagonais);

        scanner.close();
    }
}