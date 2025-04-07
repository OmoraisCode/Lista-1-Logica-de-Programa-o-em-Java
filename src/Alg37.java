import java.util.Scanner;

public class Alg37 {
    public Alg37() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o Valor do seu primeiro produto em Real: ");
        int Valor1 = scanner.nextInt();
        System.out.println("Digite o Valor do seu segundo produto em Real: ");
        int Valor2 = scanner.nextInt();
        int Produto = Valor1 + Valor2;
        System.out.println("Você me falou os valores dos produtos. Irei calcular para ver seu patrimonio de estoque...");
        System.out.println("Sua empresa tem em estoque R$: " + Produto);
        scanner.close();
    }
}