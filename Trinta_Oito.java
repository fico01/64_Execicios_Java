import java.util.Scanner;

public class Trinta_Oito {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int C, N;
        String resp = "";

        while (resp == "S" || resp == "s"){
            int E;
            System.out.println("Digite o código:");
            C = scan.nextByte();
            System.out.println("Digite o número de horas trabalhada:");
            N = scan.nextInt();

            if (N > 50){
               E = (N-50)*20;

            }
        }
    }
}
