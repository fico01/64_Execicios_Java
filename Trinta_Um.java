import java.util.Scanner;

public class Trinta_Um {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = 5;
        System.out.println("Digite um numero menor que 10 e maior que 0");
        num = scan.nextInt();

        int soma = 0;

        for (int i = num; i < 20;i++){
            if (i % 2 == 1){
                soma += i*i;
                System.out.println(soma);

            }
        }


    }
}
