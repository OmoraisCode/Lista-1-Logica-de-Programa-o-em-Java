import java.util.Scanner;

public class Alg33 {
    public Alg33() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int num2 = scanner.nextInt();
        System.out.println("Você Digitou: " + num1 + " e " + num2 + " Obrigado");
        scanner.close();
    }
}

