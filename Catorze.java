import java.util.Scanner;

public class Catorze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] value = new int[2];

        for (int i = 0; i < 2; i++){
            System.out.println("Digite o valor["+(i+1)+"]");
            value[i] = scan.nextInt();
        }
        int difference = value[0] - value[1];

        System.out.println("A diferença entre os dois numeros é:\n" + Math.abs(difference));
    }
}
