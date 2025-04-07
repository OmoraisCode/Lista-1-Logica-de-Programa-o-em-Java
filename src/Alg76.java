/*
Alg 76: Criar um algoritmo que leia um número entre 0 e 60 e imprimir o seu sucessor,
sabendo que o sucessor de 60 é 0. Não pode ser utilizado nenhum comando de seleção e nem de repetição.
*/

import java.util.Scanner;

public class Alg76 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler um número entre 0 e 60
        System.out.print("Digite um número entre 0 e 60: ");
        int numero = scanner.nextInt();

        // Calcular o sucessor
        int sucessor = (numero + 1) % 61;

        // Exibir o sucessor
        System.out.printf("O sucessor de %d é: %d%n", numero, sucessor);

        scanner.close();
    }
}
