import java.util.Scanner;

public class Alg38 {
    public Alg38() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com um numero: ");
        double num1 = scanner.nextDouble();
        double Terceira = num1 / (double)3.0F;
        System.out.println("Você digitou o numero:  " + num1);
        System.out.println("E o resultado da soma é: " + Terceira);
        scanner.close();
    }
}