/*
Alg 64: Ler uma temperatura em graus centígrados e apresentá-la convertida em graus Fahrenheit.
A fórmula de conversão é 5
 160 * 9 + = C F onde F é a temperatura em Fahrenheit e C é a temperatura
em centígrados.
 */

import java.util.Scanner;

public class Alg64{
    public static void main(String[] args){
        //Abrindo o scanner
        Scanner scanner = new Scanner(System.in);
        //pedindo entrada de dados
        System.out.println("1 - Converter de ºC para ºF");
        System.out.println("2- Converter de ºF para ºC");
        System.out.println("3- Sair");
        //scanneando opção
        int opcao = scanner.nextInt();
        if(opcao == 3){
            return;
        }
        //Pedindo Entrada da temperatura e scanneando a mesma
        System.out.println("Digite a Temperatura: ");
        double temperatura = scanner.nextDouble();

        switch(opcao){
            case 1:
                System.out.println("Converter de ºC para ºF");
                double f= ((temperatura*9)/5+32);
                System.out.printf("Temperatura em ºF: %.2f",f);
                break;

            case 2:
                System.out.println("Conveter de ºF para ºC");
                double c = ((temperatura-32)*5)/9;
                System.out.printf("Temperatura em ºC: %.2f", c);
                break;
        }

        //Fechando scanner
        scanner.close();

    }
}
