import java.util.Scanner;

public class Vinte_Cinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double H = 0, M = 0;
        double A;
        int C = 0;


        System.out.println("Digite a sua altura: [cm]");
        A = scan.nextDouble();

        A = A / 100;
        System.out.println("Digite seu sexo: 1-[H] 2-[M]");
        C = scan.nextInt();
        switch (C){
            case 1:
                H = 72.7 * A - 58;
                System.out.println(H);
                break;
            case 2:
                M = (62.1 * A) - 44.7;
                System.out.println(M);
                break;
            default:
                System.out.println("Escolha uma opção válida");
        }




    }
}
