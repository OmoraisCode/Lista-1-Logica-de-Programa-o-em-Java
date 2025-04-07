/*
Alg 52: Entrar com o lado de um quadrado e imprimir a seguinte saída:
Perimetro
Área
diagonal

 */
import java.util.Scanner;
public class Alg52 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Solicita ao usuário que insira o lado do quadrado
        System.out.print("Digite o lado do quadrado: ");
        double lado = scanner.nextDouble();

        // Calcula o perímetro do quadrado
        double perimetro = 4 * lado;

        // Calcula a área do quadrado
        double area = lado * lado;

        // Calcula a diagonal do quadrado usando o Teorema de Pitágoras
        double diagonal = lado * Math.sqrt(2);

        // Imprime os resultados
        System.out.printf("Perímetro: %.2f%n", perimetro);
        System.out.printf("Área: %.2f%n", area);
        System.out.printf("Diagonal: %.2f%n", diagonal);

        // Fecha o scanner
        scanner.close();

    }
}
