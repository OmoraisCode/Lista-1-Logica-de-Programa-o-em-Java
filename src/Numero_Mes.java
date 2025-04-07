import java.util.Scanner;

public class Numero_Mes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero do mês (1 a 12):  ");
        int mes = scanner.nextInt();
        int dias;
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 2:
                dias = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            default:
                System.out.println("Mês inválido! Por favor, digite um número entre 1 e 12.");
                scanner.close();
                return;
        }

        System.out.println("O mês " + mes + " tem " + dias + " dias.");
        scanner.close();
    }
}
