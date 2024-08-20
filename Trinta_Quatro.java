import java.util.Scanner;

public class Trinta_Quatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] num = new int[50];
        int i = 0;
        int maiorNum = Integer.MIN_VALUE, menorNum = Integer.MAX_VALUE, mediaNums, soma = 0;

        while (i < 50){
            System.out.println("Digite um número:");
            num[i] = scan.nextInt();
            if (num[i] < 0){
                break;
            }
            soma += num[i];
            if (num[i] < menorNum){
                menorNum = num[i];
            } else if (num[i] > maiorNum) {
                maiorNum = num[i];
            }
            i++; // increment i only if the input is not negative
        }
        mediaNums = soma / i;

        System.out.println("O maior número é: " + maiorNum);
        System.out.println("O menor número é: " + menorNum);
        System.out.println("E a média é: " + mediaNums);
    }
}