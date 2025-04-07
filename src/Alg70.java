/*
Todos restaurante, embora por lei não possa obrigar o cliente a pagar, cobra 10% para o
garçom. Fazer um algoritmo que leia o valor gasto com despesas realizadas em um restaurante e
imprima o valor total com a gorjeta.
 */
import java.util.Scanner;

public class Alg70 {
    public static void main (String[] args){
        //Abrindo scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual valor total da conta gasta: R$");
        double ContaGasta = scanner.nextDouble();

        double Conta10 = (ContaGasta*0.1)+ContaGasta;
        System.out.println("O valor total com a porcentagem é : R$"+Conta10);

        scanner.close();

    }
}