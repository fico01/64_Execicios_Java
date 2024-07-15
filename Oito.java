import java.util.Scanner;

public class Oito {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

        int Y, M, D;

        System.out.println("Informe sua data de nascimento:");
        System.out.println("Ano em que nasceu:");
        Y = scam.nextInt();
        System.out.println("Mês em que nasceu:");
        M = scam.nextInt();
        System.out.println("Dia em que nasceu:");
        D = scam.nextInt();

        System.out.println("Parabens!! Você tem " + (((2024-Y)*365)+(M*30)+D) + " de vida!!");
    }
}
