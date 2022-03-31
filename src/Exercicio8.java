import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner programa = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double a = programa.nextDouble();

        System.out.println("Digite o Segundo número: ");
        double b = programa.nextDouble();

        System.out.println("Digite o terceiro número: ");
        double c = programa.nextDouble();

        System.out.println("Digite o quarto número: ");
        double d = programa.nextDouble();

        System.out.println("Digite o quinto número: ");
        double e = programa.nextDouble();

        System.out.println("Digite o sexto número: ");
        double f = programa.nextDouble();

        if (a == b) {
            System.out.println("A é igual a B");
        } else if (c != d) {
            System.out.println("C é diferente D ");
        } else if (e > f) {
            System.out.println("E é maior que F ");
        }

    }
}
