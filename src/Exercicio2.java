import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner ExImc = new Scanner(System.in);

        System.out.println("Digite o seu peso: ");
        double peso = ExImc.nextDouble();

        System.out.println("Digite a sua altura: ");
        double altura = ExImc.nextDouble();

        double imc = (peso / (altura * altura));

        if (imc < 18.5) {
            System.out.println("Magreza.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println("Normal. ");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println("Sobrepeso. Grau I");
        } else if (imc >= 30.0 && imc <= 39.9) {
            System.out.printf("Seu IMC é de %.2f ", imc);
            System.out.println("Obesidade, Grau II");
        } else if (imc >= 40.0) {
            System.out.println("Obesidade Grave. Grau III");
        }
    }
}
