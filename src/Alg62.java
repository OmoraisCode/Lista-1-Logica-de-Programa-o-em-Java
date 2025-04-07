/*
Alg 62: Em épocas de pouco dinheiro, os comerciantes estão procurando aumentar suas vendas
oferecendo desconto. Faça um algoritmo que possa entrar com o valor de um produto e imprima o
novo valor tendo em vista que o desconto foi de 9%.
 */
import java.util.Scanner;

public class Alg62 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Pedindo entrada do usuario com o valor real
        System.out.println("Digite o valor do seu produto para aplicarmos o desconto: R$ ");
        double produto = scanner.nextDouble();

        double desconto = 0.09; // criando desconto de 9%
        double valorDesconto = produto*desconto;
        double novoValor = produto-valorDesconto;

        //Finalizando dizendo o desconto
        System.out.printf("Foi aplicado um desconto de 9%% o valor final é: R$ %.2f%n ", novoValor);

        // Fechando scanner
        scanner.close();

    }
}
