/*
Alg 75: Criar um algoritmo que leia o peso de uma pessoa, só a parte inteira, calcular e imprimir:
O peso da pessoa em gramas, Novo peso, em gramas, se a pessoa engordar 12%.
*/

import java.util.Scanner;

public class Alg75 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o peso da pessoa
        System.out.print("Digite o peso da pessoa (apenas a parte inteira): ");
        int peso = scanner.nextInt();

        // Calcular o peso em gramas
        int pesoEmGramas = peso * 1000;

        // Calcular o novo peso se a pessoa engordar 12%
        double novoPeso = peso * 1.12;
        int novoPesoEmGramas = (int) (novoPeso * 1000);

        // Exibir os resultados
        System.out.printf("Peso em gramas: %d g%n", pesoEmGramas);
        System.out.printf("Novo peso em gramas (após engordar 12%%): %d g%n", novoPesoEmGramas);

        scanner.close();
    }
}
