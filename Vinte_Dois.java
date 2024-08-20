import java.util.Scanner;

public class Vinte_Dois {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int V,A=0,B=0,C = 0;

        System.out.println("Digite um valor:");
        V = scan.nextInt();
        if (V >= 0) {
            A += V;

        } else if (V < 0){
            B += V;
        }
        System.out.println("Continuar? [1]Sim [2]Não");
        C = scan.nextByte();
        while (C == 1){
            System.out.println("Digite um valor:");
            V = scan.nextInt();
            if (V >= 0) {
                A += V;
                System.out.println("Continuar? [1]Sim [2]Não");
                C = scan.nextByte();
            } else if (V < 0){
                B += V;
                System.out.println("Continuar? [1]Sim [2]Não");
                C = scan.nextByte();
            }
        }
        System.out.println("A: " + A + "\nB: " + B);
    }
}
