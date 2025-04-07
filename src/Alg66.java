/*
Alg 66: Efetuar o cálculo da quantidade de litros de combustível gasto em uma viagem sabendo-se
que o carro faz 12 km com um litro. Deverão ser fornecidos o tempo gasto na viagem e a velocidade
média. Utilizar as seguintes formulas:
o Distância = tempo x velocidade
o Litros usados = distância / 12
 */
import java.util.Scanner;
public class Alg66 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        //Entrando com horas gastas na viagem
        System.out.println("Digite quantas horas gasta na viagem: ");
        double horas = scanner.nextDouble();

        //Velocidade
        System.out.println("Digite uma media de velocidade da viagem: KM/H ");
        double velocidade = scanner.nextDouble();
        //Calculo distancia
        double distancia = horas * velocidade;

        //calculo dos litros usados
        double litros = distancia / 12;
        //imprimindo resultado
        System.out.println("Nesta viagem com a distancia de: " +distancia+" km. Foram gastos: "+litros+" de combustivel.");

        //fechando scanner
        scanner.close();


    }
}
