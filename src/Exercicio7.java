import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner idade18 = new Scanner(System.in);

        System.out.println("Digite a sua idade: ");
        int idade = idade18.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade ");
        } else {
            System.out.println(" Você é menor de idade ");
        }
    }
}
