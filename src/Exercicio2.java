import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        try (Scanner endereco = new Scanner(System.in)) {
            System.out.print("Por favor insira o seu CEP: ");
            int cep = endereco.nextInt();

            System.out.print("Digite o numero da sua rua: ");
            int rua = endereco.nextInt();

            System.out.print("Por favor insira o número da sua casa: ");
            int nCasa = endereco.nextInt();

            System.out.print("Digite o complemento: ");
            String compl = endereco.next();

            System.out
                    .println(
                            "O pacote para o seu produto será enviado para: CEP: " + cep + " Nº " + rua + " Nº da casa "
                                    + nCasa + " complemento: " + compl);
        }

    }

}
