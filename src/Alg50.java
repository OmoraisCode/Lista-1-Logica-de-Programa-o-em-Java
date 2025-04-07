/*
Alg 50: Entrar com a base e a altura de um retângulo e imprimir a seguinte saída:
Perimetro
Área
Diagonal

 */
import java.util.Scanner;
public class Alg50 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite o valor da base em cm: ");
        double base= scanner.nextDouble();
        System.out.println("Por favor digite o valor da altura em cm: ");
        double altura= scanner.nextDouble();

        //Calculo perimetro
        double perimetro = 2 * (base + altura);
        // Calcula a área
        double area = base * altura;
        //calculo diagonal
        double diagonal = Math.sqrt((base*base) + (altura*altura));
        // Imprime os resultados
        System.out.printf("Perímetro: %.2f cm%n", perimetro);
        System.out.printf("Área: %.2f cm²%n", area);
        System.out.printf("Diagonal: %.2f cm%n", diagonal);
        // Fecha o scanner
        scanner.close();

    }
}
