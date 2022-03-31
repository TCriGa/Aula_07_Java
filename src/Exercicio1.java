import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner mediaAluno = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double nota1 = mediaAluno.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = mediaAluno.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = mediaAluno.nextDouble();

        System.out.println("Digite a Quarta nota: ");
        double nota4 = mediaAluno.nextDouble();

        double media = (nota1 + nota2 + nota3 + nota4) / 2;

        if (media >= 7) {
            System.out.println("Voçê está aprovado");

        } else {
            System.out.println("Você está reprovado");

        }

    }
}
