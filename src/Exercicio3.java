import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner MaiorQue10 = new Scanner(System.in);

        System.out.println("Digite um número ");
        double number1 = MaiorQue10.nextDouble();

        if (number1 > 10) {
            System.out.println("Seu número é maior que 10 ");
        } else if (number1 < 10) {
            System.out.println("Seu número não é maior que 10 ");
        }
    }
}
