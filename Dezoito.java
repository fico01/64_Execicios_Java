import java.util.Scanner;

public class Dezoito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;

        System.out.println("Digite o código");
        value = scan.nextInt();

        switch (value){
            case 1:
                System.out.println("Um");
                break;
            case 2:
                System.out.println("Dois");
                break;
            case 3:
                System.out.println("Três");
                break;
            default:
                System.out.println("Código inválido");
                break;
        }
    }
}
