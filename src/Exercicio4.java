import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner dimensao = new Scanner(System.in);

        System.out.println("Digite o valor da base do retângulo: ");
        double base = dimensao.nextDouble();

        System.out.println("Digite o valor da altura do retângulo: ");
        double altura = dimensao.nextDouble();

        double area = (base * altura);

        System.out.println("O valor da área do retângulo é: " + area);

    }
}
