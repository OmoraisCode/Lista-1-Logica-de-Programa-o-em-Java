/*
Alg 69: Criar um algoritmo que leia o numerador e o denominador de uma fração e transformá-lo em
um número decimal.
 */

import java.sql.SQLOutput;
import java.util.Scanner;
public class Alg69 {
    public static void main(String[] args){
        //Abrindo scanner
        Scanner scanner=new Scanner(System.in);
        //pedindo a entradas
        System.out.println("Digite o numerador: ");
        double Numerador=scanner.nextDouble();

        System.out.println("Digite o Denominador: ");
        double Denominador=scanner.nextDouble();

        //Verficar se o denominador e zero
        if (Denominador== 0){
            System.out.println("O denominador não pode ser zero!");
        } else {
            double resultado = Numerador / Denominador;
            System.out.printf("O resultado da fração %.2f / %.2f é: %.2f%n", Numerador, Denominador, resultado);
        }
        scanner.close();

    }
}
