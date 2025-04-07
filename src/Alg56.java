/*
Alg 56: Entrar com nome e idade. Imprimir a seguinte saída:
Nome
Idade
 */
import java.util.Scanner;

public class Alg56 {
    public static void main(String[] args){
        //Abrindo Scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome= sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idade= sc.nextInt();

        System.out.println("Olá, " + nome + " vi que você tem " + idade + " anos.");


    }

}
