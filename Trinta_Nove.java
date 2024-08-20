import java.util.Scanner;

public class Trinta_Nove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resp = "n";
        while (resp.equals("n") || resp.equals("N")){
            int num = 0;
            System.out.println("Digite um número:");
            num = scan.nextInt();

            if (num % 2 == 0){
                System.out.println(num + " é par");

            } else {
                System.out.println(num + " é ímpar");
            }
            System.out.println("Deseja encerrar o progama?");
            resp = scan.next();
        }
    }
}
