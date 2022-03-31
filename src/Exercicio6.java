import java.util.Scanner;

import javax.lang.model.element.Element;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner timeJogo = new Scanner(System.in);

        System.out.println("Digite o primeiro Time: ");
        String time1 = timeJogo.nextLine();

        System.out.println("Digite o número de gols marcados na partida: ");
        int gols1 = timeJogo.nextInt();

        System.out.println("Digite o segundo Time: ");
        String time2 = timeJogo.next();

        System.out.println("Digite o número de gols marcados na partida: ");
        int gols2 = timeJogo.nextInt();

        if (gols1 > gols2) {
            System.out.println("Time " + time1 + "Ganhou por " + gols1 + " x " + gols2);

        } else if (gols2 > gols1) {
            System.out.println("Time " + time2 + "Ganhou por " + gols2 + " x " + gols1);
        } else if (gols1 == gols2) {
            System.out.println("Empate " + gols1 + "x" + gols2);
        }

    }
}
