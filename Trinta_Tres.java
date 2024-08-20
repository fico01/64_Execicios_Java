import java.util.Scanner;

public class Trinta_Tres {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] alunos = new int[30];
        int somaNota = 0;
        String resp = "";
        int i = 0;

        while (i < 30) {
            System.out.println("Digite o numero de matricula:");
            alunos[i] = scan.nextInt();
            System.out.println("Digite a nota:");
            somaNota += scan.nextInt();
            System.out.println("Parar?");
            resp = scan.next();
            if (resp.equals("sim") || resp.equals("s")) {
                break; // sai do loop quando o usuário digita "sim" ou "s"
            }
            i++;
        }

        System.out.println(somaNota / i);

    }
}