/*
Alg 80: Criar um algoritmo que leia a quantidade de fitas que uma locadora de vídeo possui e o valor que ela cobra por cada aluguel,
mostrando as informações pedidas a seguir:
- Sabendo que um terço das fitas alugadas por mês, exiba o faturamento anual da locadora.
- Quando o cliente atrasa a entrega, é cobrada uma multa de 10% sobre o valor do aluguel.
Sabendo que o décimo das fitas alugadas no mês são devolvidas com atraso, calcule o valor ganho com multas por mês.
- Sabendo ainda que 2% de fitas se estragam ao longo do ano, e um décimo do total é comprado para reposição, exiba a quantidade de fitas que a locadora terá no final do ano.
*/

import java.util.Scanner;

public class Alg80 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ler a quantidade de fitas
        System.out.print("Digite a quantidade de fitas: ");
        int quantidadeFitas = scanner.nextInt();

        // Ler o valor do aluguel
        System.out.print("Digite o valor do aluguel por fita: ");
        double valorAluguel = scanner.nextDouble();

        // Calcular o faturamento anual
        int fitasAlugadasPorMes = quantidadeFitas / 3;
        double faturamentoAnual = fitasAlugadasPorMes * valorAluguel * 12;

        // Calcular o valor ganho com multas
        int fitasDevolvidasComAtraso = fitasAlugadasPorMes / 10;
        double multaPorAtraso = fitasDevolvidasComAtraso * valorAluguel * 0.10;
        double totalMultas = multaPorAtraso * 12;

        // Calcular a quantidade de fitas no final do ano
        int fitasEstragadas = (int) (quantidadeFitas * 0.02);
        int fitasCompradasParaReposicao = quantidadeFitas / 10;
        int totalFitasFinal = quantidadeFitas - fitasEstragadas + fitasCompradasParaReposicao;

        // Exibir os resultados
        System.out.printf("Faturamento anual: R$ %.2f%n", faturamentoAnual);
        System.out.printf("Total ganho com multas por ano: R$ %.2f%n", totalMultas);
        System.out.printf("Quantidade de fitas no final do ano: %d%n", totalFitasFinal);

        scanner.close();
    }
}