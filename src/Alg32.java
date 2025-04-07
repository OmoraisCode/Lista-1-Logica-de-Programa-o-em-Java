import java.util.Scanner;

public class Alg32 {
    public Alg32() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = scanner.nextInt();
        System.out.println("Você Digitou: " + numero + " Obrigado");
        scanner.close();
    }
}
