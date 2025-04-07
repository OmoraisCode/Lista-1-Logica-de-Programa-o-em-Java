/*
Alg 48: Antes do racionamento de energia ser decretado, quase ninguém falava em quilowatts, mas,
agora, todos imcorporaram essa palavra em seu vocabulário. Sabendo-se que 100 quilowatts de
energia custa um sétimo do salário mínimo, fazer um algoritmo que receba o valor do salário mínimo
e a quantidade de quilowatts gasta por uma residência e calcule. Imprima:
O valor em reais de cada quilowatt
O valor em reais a ser pago
O novo valor a ser pago por essa residência com um desconto de 10%
 */

import java.util.Scanner;
public class Alg48 {
    public static void main(String[] args){
        //Abrindo scanner
        Scanner scanner = new Scanner(System.in);
        //Pedindo ao usuario o valor do salario minimo
        System.out.println("Me informe o valor do salario minimo: ");
        double salario = scanner.nextDouble();
        //Pedindo ao usuario o gasto de energia
        System.out.println("Por favor me informe o seu gasto de energia em quilowatts: ");
        double gasto = scanner.nextDouble();

        //calcula quilowatts
        double custo100= salario /7;
        double ValorPorQuilowatts = custo100 /100;
        double ValorTotal = gasto * ValorPorQuilowatts;
         //Calcula desconto
        double desconto = ValorTotal * 0.10;
        double valorComDesconto = ValorTotal - desconto;

        // Imprime os resultados
        System.out.printf("Valor em reais de cada quilowatt: R$ %.2f%n", ValorPorQuilowatts);
        System.out.printf("Valor total a ser pago: R$ %.2f%n", ValorTotal);
        System.out.printf("Valor com desconto de 10%%: R$ %.2f%n", valorComDesconto);

        // Fecha o scanner
        scanner.close();

    }
}
