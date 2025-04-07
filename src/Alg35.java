import java.util.Scanner;

public class Alg35 {
    public Alg35() {
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();
        System.out.println("Digite seu Endereço: ");
        String endereco = scanner.nextLine();
        System.out.println("Digite seu Telefone: ");
        String telefone = scanner.nextLine();
        System.out.println("\nDados Pessoais:");
        System.out.println("Nome: " + nome);
        System.out.println("Endereco: " + endereco);
        System.out.println("Telefone: " + telefone);
        scanner.close();
    }
}

