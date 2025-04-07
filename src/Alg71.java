/*
Alg 71: Criar um algoritmo que leia um valor de hora e informe quantos minutos se passaram desde o início do dia.
*/

import java.util.Scanner;

public class Alg71 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler o valor da hora
        System.out.print("Digite a hora (0 a 23): ");
        int hora = scanner.nextInt();

        // Calcular os minutos desde o início do dia
        int minutos = hora * 60;

        // Exibir o total de minutos
        System.out.printf("Desde o início do dia, passaram-se %d minutos.%n", minutos);

        scanner.close();
    }
}