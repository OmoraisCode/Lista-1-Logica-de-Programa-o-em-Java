/*
Alg 47: Entrar com o número no formato CDU e imprimir invertido: UDC (Exemplo: 123, sairá 321).
O número deverá ser armazenado em outra variável antes de ser impresso.
 */
import java.util.Scanner;
public class Alg47 {
    public static void main(String[] args){
        //Abrindo scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para invertermos: ");
        int numero = scanner.nextInt();

        //Armazenar o numero em uma variavel para facilitar
        String numeroStr = Integer.toString(numero);

        //inverte o numero
        String numeroInvertido = new StringBuilder(numeroStr).reverse().toString();

        //Imprime numero invertido e depois fecha scanner
        System.out.println("O numero invertido é: "+numeroInvertido);
        scanner.close();

    }
}
