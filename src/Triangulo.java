import java.util.Scanner;

public class Triangulo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro lado: ");
        int lado1 = scanner.nextInt();
        System.out.println("Digite o segundo lado: ");
        int lado2 = scanner.nextInt();
        System.out.println("Digite o terceiro lado:");
        int lado3 = scanner.nextInt();
        if (lado1 < lado2 + lado3 && lado3 < lado2 + lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triangulo Equilatero");
            } else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
                System.out.println("Triangulo Scaleno");
            } else {
                System.out.println("Trinagulo Isosceles");
            }
        }

        scanner.close();
    }
}
