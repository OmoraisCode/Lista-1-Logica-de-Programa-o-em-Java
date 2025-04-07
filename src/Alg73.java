/*
Alg 73: Criar um algoritmo que receba um número real, calcular e imprimir:
A parte inteira do número, A parte fracionária do número, O número arredondado.
*/

import java.util.Scanner;

public class Alg73 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um número real
        System.out.print("Digite um número real: ");
        double numero = scanner.nextDouble();

        // Calcular a parte inteira e a parte fracionária
        int parteInteira = (int) numero;
        double parteFracionaria = numero - parteInteira;
        long numeroArredondado = Math.round(numero);

        // Exibir os resultados
        System.out.printf("Parte inteira: %d%n", parteInteira);
        System.out.printf("Parte fracionária: %.2f%n", parteFracionaria);
        System.out.printf("Número arredondado: %d%n", numeroArredondado);

        scanner.close();
    }
}
