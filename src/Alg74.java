/*
Alg 74: Para vários tributos, a base de cálculo é o salário mínimo.
Fazer um algoritmo que leia o valor do salário mínimo e o valor do salário de uma pessoa.
Calcular e imprimir quantos salários mínimos ela ganharia.
*/

import java.util.Scanner;

public class Alg74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor do salário mínimo
        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = scanner.nextDouble();

        // Ler o valor do salário da pessoa
        System.out.print("Digite o valor do salário da pessoa: ");
        double salarioPessoa = scanner.nextDouble();

        // Calcular quantos salários mínimos a pessoa ganha
        double quantosSalariosMinimos = salarioPessoa / salarioMinimo;

        // Exibir o resultado
        System.out.printf("A pessoa ganha %.2f salários mínimos.%n", quantosSalariosMinimos);

        scanner.close();
    }
}