import java.util.Scanner;

public class Vinte {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A,B,C = 0;

        System.out.println("Digite um valor A maior que zero:");
        A = scan.nextInt();
        if (A < 0){
            System.out.println("Digite um valor A maior que zero:");
            A = scan.nextInt();
        }
        System.out.println("Digite um valor B maior que zero:");
        B = scan.nextInt();
        if (B < 0){
            System.out.println("Digite um valor B maior que zero:");
            B = scan.nextInt();
        }
        System.out.println("Digite um valor C maior que zero:");
        C = scan.nextInt();
        if (C < 0){
            System.out.println("Digite um valor C maior que zero:");
            C = scan.nextInt();
        }

        int menorValor = Math.min(A, B);
        menorValor = Math.min(menorValor, C);
        int maiorValor = Math.max(A, B);
        maiorValor = Math.max(maiorValor, C);


        System.out.println((menorValor*maiorValor) + " " + (maiorValor/menorValor));

    }
}
