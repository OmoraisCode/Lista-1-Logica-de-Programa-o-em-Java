/*
Alg 59: Entrar com os valores dos catetos de um triângulo retângulo e imprimir a hipotenusa
 */
import java.util.Scanner;
public class Alg59 {
    public static void main(String[] args){
        //Abrindo scanner
        Scanner scanner = new Scanner(System.in);

        //pedindo a entrada dos catetos
        System.out.println("Digite o numero do primeiro cateto(A): ");
        double A = scanner.nextDouble();
        System.out.println("Digite o numero do segundo cateto(B): ");
        double B = scanner.nextDouble();

        //Calculando
     double Hipotenusa = Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2));

        System.out.println("O valor da hipotenusa do triangulo é: %.2f%n " + Hipotenusa);

        //fechando scanner
        scanner.close();

    }
}
