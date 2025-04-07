import java.util.Scanner;

public class Alg36 {
    public Alg36() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o seu primeiro numero: ");
        int num1 = scanner.nextInt();
        System.out.println("Entre com o seu segundo numero: ");
        int num2 = scanner.nextInt();
        int soma = num1 + num2;
        System.out.println("Olá você digitou seu numero desde ja agradeço");
        System.out.println("Os numeros digitados foram: " + num1 + " e " + num2 + " Calculando...");
        System.out.println("O resultado da soma é: " + soma);
        scanner.close();
    }
}
