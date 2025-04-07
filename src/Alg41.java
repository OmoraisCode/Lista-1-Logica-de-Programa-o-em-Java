import java.util.Scanner;

public class Alg41 {
    public Alg41() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();
        System.out.print("Digite o quarto número: ");
        int numero4 = scanner.nextInt();
        int peso1 = 1;
        int peso2 = 2;
        int peso3 = 3;
        int peso4 = 4;
        double somaPesos = (double)(peso1 + peso2 + peso3 + peso4);
        double mediaPonderada = (double)(numero1 * peso1 + numero2 * peso2 + numero3 * peso3 + numero4 * peso4) / somaPesos;
        System.out.println("Média Ponderada: " + mediaPonderada);
        scanner.close();
    }
}

