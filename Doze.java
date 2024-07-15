import java.util.Scanner;

public class Doze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int valor;

        System.out.println("Digite um valor:");
        valor = scan.nextInt();

        if (valor >= 0){
            System.out.println(valor);
        } else if (valor < 0) {
            System.out.println(valor * -1);

        }
    }

}
