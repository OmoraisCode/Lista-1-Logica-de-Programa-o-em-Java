/*
Alg 54: Criar um algoritmo que calcule i emprima a área de um triângulo
 */
import java.util.Scanner;

public class Alg54 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira a base do triângulo
        System.out.print("Digite a base do triângulo: ");
        double base = scanner.nextDouble();

        // Solicita ao usuário que insira a altura do triângulo
        System.out.print("Digite a altura do triângulo: ");
        double altura = scanner.nextDouble();

        // Calcula a área do triângulo
        double area = (base * altura) / 2;

        // Imprime o resultado
        System.out.printf("A área do triângulo é: %.2f%n", area);

        // Fecha o scanner
        scanner.close();


    }
}
