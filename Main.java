import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int estoqueMedio, qMinima = 0, qMaxima = 0;

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a quantidade minima de estoque: ");
        qMinima = scan.nextInt();
        System.out.println("Digite a quantidade maxima de estoque: ");
        qMaxima = scan.nextInt();

        estoqueMedio = (qMinima + qMaxima)/2;

        System.out.println("Seu estoque médio é: " + estoqueMedio);
    }
}