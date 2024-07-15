import java.util.Scanner;

public class Sete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int  R, A;
        double V;

        System.out.println("Informe o Raio da lata de óleo: [cm]");
        R = scan.nextInt();
        System.out.println("Informe a Altura da lata de óleo: [cm]");
        A = scan.nextInt();

        V = 3.14159 * R * R * A;

        System.out.println("O volume da lata de óleo é: " + V + "cm");

    }
}
