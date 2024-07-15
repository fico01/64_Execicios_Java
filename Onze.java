import java.util.Scanner;

public class Onze {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int A, B, C;

        System.out.println("Digite o valor A:");
        A = scan.nextInt();
        System.out.println("Digite o valor B:");
        B = scan.nextInt();

        C = A;
        A = B;
        B = C;

        System.out.println("Os valores foram trocados agora A é igual a "+ A + " e B é igual a " + B);
    }

}
