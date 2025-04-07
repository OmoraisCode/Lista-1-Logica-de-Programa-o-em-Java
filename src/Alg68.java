/*
Alg 68: Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma que a variável
A passe a ter o valor da variável B e que a variável B passe a ter o valor da variável A. Apresentar
os valores trocados.
 */
import java.util.Scanner;

public class Alg68 {
    public static void main(String[] args){
        //Abrindo scanner
        Scanner scanner = new Scanner(System.in);

        //Pedindo entrada do A e B
        System.out.println("Digite o Valor de A: ");
        int A = scanner.nextInt();

        System.out.println("Digite o valor de B: ");
        int B = scanner.nextInt();

        //Exibir os valores antes da troca
        System.out.printf("Os Valores antes da troca A: " +A+ " \nOs Valores antes da troca B: " +B+"\n");

        int temp = A ;// Armazena a variavel em uma temporaria
        A= B ; // Transformando A em B etc
        B= temp;

        System.out.println("O valor da trocado A: " +A+" \nO valor trocado B: "+B+"\n");

        scanner.close();


    }
}
