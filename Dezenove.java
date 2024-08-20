import java.util.Scanner;

public class Dezenove {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A,B,C = 0;

        System.out.println("Digite o valor do lado A do triângulo:");
        A = scan.nextInt();
        System.out.println("Digite o valor do lado B do triângulo:");
        B = scan.nextInt();
        System.out.println("Digite o valor do lado C do triângulo:");
        C = scan.nextInt();

        if (A < B + C && B < C + A && C < A + B){
            if (A==B && B==C){
                System.out.println("triangulo equilatero");
            } else if (A==B || B==C || C==A) {
                System.out.println("triangulo isósceles");
            } else {
                System.out.println("triangulo escaleno");
            }
        } else {
            System.out.println("Erro!");
        }
    }
}
