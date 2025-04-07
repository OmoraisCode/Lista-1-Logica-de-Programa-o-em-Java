/*
Alg 72: Criar um algoritmo que leia o valor de um depósito e o valor da taxa de juros.
Calcular e imprimir o valor do rendimento e o valor total depois do rendimento.
*/

import java.util.Scanner;

public class Alg72 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor do depósito
        System.out.print("Digite o valor do depósito: ");
        double deposito = scanner.nextDouble();

        // Ler a taxa de juros
        System.out.print("Digite a taxa de juros (em %): ");
        double taxaJuros = scanner.nextDouble();

        // Calcular o rendimento
        double rendimento = deposito * (taxaJuros / 100);

        // Calcular o valor total após o rendimento
        double valorTotal = deposito + rendimento;

        // Exibir o rendimento e o valor total
        System.out.printf("O rendimento é: R$ %.2f%n", rendimento);
        System.out.printf("O valor total após o rendimento é: R$ %.2f%n", valorTotal);

        scanner.close();
    }
}
