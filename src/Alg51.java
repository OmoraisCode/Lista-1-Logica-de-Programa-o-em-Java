/*
Alg 51: Entrar com o raio de um circulo e imprimir a seguinte saída:
Perimetro
Área

 */
import java.util.Scanner;

public class Alg51 {
    public static void main(String[] args){
        //criando objeto de scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio de um circulo: ");
        double raio = scanner.nextDouble();

        // Calcula o perímetro (circunferência) do círculo
        double perimetro = 2 * Math.PI * raio;
        // Calcula a área do círculo
        double area = Math.PI * Math.pow(raio, 2);

        // Imprime os resultados
        System.out.printf("Perímetro: %.2f%n", perimetro);
        System.out.printf("Área: %.2f%n", area);

        // Fecha o scanner
        scanner.close();

    }
}
