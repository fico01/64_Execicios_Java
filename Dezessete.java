import java.util.Scanner;

public class Dezessete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;

        System.out.println("Digite um valor:");
        value = scan.nextInt();
        if (value >= 0 && value <= 9){
            System.out.println("Valor válido!");
        } else {
            System.out.println("Valor inválido!");
        }
    }
}
