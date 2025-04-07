/*
Alg 63: Criar um algoritmo que efetue o cálculo do salário líquido de um professor. Os dados
fornecidos serão: valor da hora aula, número de aulas dadas no mês e percentual de desconto do
INSS.
 */
import java.util.Scanner;

public class Alg63 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor da hora aula do professor: R$");
        double Hora = scanner.nextDouble();

        System.out.println("Digite a quantidade de dias no mês:" );
        int numeroAulas = scanner.nextInt();

        // Entrada do percentual de desconto do INSS
        System.out.print("Digite o percentual de desconto do INSS: ");
        double percentualDesconto = scanner.nextDouble();

        // Cálculo do salário bruto
        double salarioBruto = Hora * numeroAulas;

        // Cálculo do desconto do INSS
        double descontoINSS = salarioBruto * (percentualDesconto / 100);

        // Cálculo do salário líquido
        double salarioLiquido = salarioBruto - descontoINSS;

        // Impressão do resultado
        System.out.printf("O salário líquido do professor é: R$ %.2f%n", salarioLiquido);

        scanner.close();



    }
}
