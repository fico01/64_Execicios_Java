import java.util.Scanner;

public class Quarenta_Um {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resp = "n";

        while (resp.equals("n") || resp.equals("N")){
            int idd = 0;
            System.out.println("Digite sua idade:");
            idd = scan.nextInt();

            if (idd >= 5 && idd <= 7){
                System.out.println("Você se classifica para o Infantil A");
            } else if (idd >= 8 && idd <= 11){
                System.out.println("Você se classifica para o Infantil B");
            } else if (idd >= 12 && idd <= 13) {
                System.out.println("Você se classifica para o Juvenil A");
            } else if (idd >= 14 && idd <= 17) {
                System.out.println("Você se classifica para o Juvenil B");
            } else if (idd >= 18) {
                System.out.println("Você se classifica para o Adultos");
            }

            System.out.println("Deseja fechar o progama?");
            resp = scan.next();
        }
    }
}
