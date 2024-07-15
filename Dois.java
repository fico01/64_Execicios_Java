import java.util.Scanner;

public class Dois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double dol = 0, real = 5.49, total = 0;

        System.out.println("Quantos dólares você ira converter: ");
        dol = scan.nextDouble();

        total = dol * real;
        System.out.println("Deu um total de:\n" + Math.round(total) + "R$");
    }
}
