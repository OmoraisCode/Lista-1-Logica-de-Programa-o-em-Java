/*
Alg 46: Fazer um algoritmo que possa entrar com o saldo de uma aplicação e imprima o novo saldo,
considerando o reajuste de 1%.

 */
import java.util.Scanner;
public class Alg46 {
    public static void main(String[] args){
        //Abrindo scanner
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor que vamos fazer o reajuste: R$ ");
        double valor = sc.nextDouble();
         //Criando variavel do reajuste e reajustando
        double reajuste = valor * 0.1; // 1% do valor add
        double NovoValor = valor + reajuste; //valor reajustado

        //Imprimindo novamente saida
        System.out.println("O valor reajustado é de: R$ " + NovoValor);

        //Fechando scanner
        sc.close();

    }
}
