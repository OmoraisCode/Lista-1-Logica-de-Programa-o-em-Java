import java.util.Scanner;

public class Alg34 {
    public Alg34() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int num1 = scanner.nextInt();
        int sucessor = num1 + 1;
        int antecessor = num1 - 1;
        System.out.println("você digitou: " + num1);
        System.out.println("O numero sucessor é: " + sucessor);
        System.out.println("O numero antecessor é " + antecessor);
        scanner.close();
    }
}