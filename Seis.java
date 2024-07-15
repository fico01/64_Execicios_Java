import java.util.Scanner;

public class Seis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int C,F;

        System.out.println("Digite o valor em Celsius a ser convertido para Fahrenheit:");
        C = scan.nextInt();

        F = (9 * C +160)/ 5;
        System.out.println("A temperatura "+C+" equiva a "+F+"ºF");
    }
}
