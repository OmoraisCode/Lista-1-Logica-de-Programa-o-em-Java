import java.util.Scanner;

public class Alg39 {
    public Alg39() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero REAL: ");
        double num1 = scanner.nextDouble();
        System.out.println("Digite o segundo numero REAL: ");
        double num2 = scanner.nextDouble();
        double media = (num1 + num2) / (double)2.0F;
        System.out.println("A media é: " + media);
        scanner.close();
    }
}
