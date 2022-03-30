import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.print("Por favor insira o seu saldo atual: ");
        int saldo = leitor.nextInt();

        System.out.println("O saldo atual da sua conta é de: " + saldo);
    }
}
