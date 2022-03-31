import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner MaiorQ = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        double n1 = MaiorQ.nextDouble();

        System.out.println("Digite o Segundo valor: ");
        double n2 = MaiorQ.nextDouble();

        if (n1 > n2) {
            System.out.println("O maior valor é: " + n1);
        } else if (n2 > n1) {
            System.out.println("O maior valor é: " + n2);
        } else if (n1 == n2) {
            System.out.println("ERROR, Valores iguais não permitido ");
        }
    }
}
