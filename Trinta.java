import java.util.Scanner;

public class Trinta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num =0;

        System.out.println("Digite qual número você quer a tabuada:");
        num = scan.nextInt();

        for (int t = 0; t <= 10; t++){
            System.out.println(num + " x " + t + " = " + (num*t));
        }
    }
}
