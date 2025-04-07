import java.util.Scanner;

public class Alg40 {
    public Alg40() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Dividendo: ");
        int dividendo = scanner.nextInt();
        System.out.println("Digite o Divisor: ");
        int divisor = scanner.nextInt();
        int quociente = dividendo / divisor;
        int resto = dividendo % divisor;
        System.out.println("Dividendo; " + dividendo);
        System.out.println("Divisor; " + divisor);
        System.out.println("Quociente; " + quociente);
        System.out.println("Resto; " + resto);
        scanner.close();
    }
}
