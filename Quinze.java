import java.util.Scanner;

public class Quinze {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] media = new int[4];
        int soma = 0;

        for (int i = 0;i < 4; i++){
            System.out.println("Digite sua média["+(i+1)+"]");
            media[i] = scan.nextInt();
            soma += media[i];
        }
        int mediaFinal = soma/4;

        if (mediaFinal >= 7){
            System.out.println("Você foi aprovado!😁👍");
        } else {
            int mediaRec = 0;

            System.out.println("Você não foi aprovado.");
            System.out.println("Digite a sua média da recuperação:");
            mediaRec = scan.nextInt();

            int total = (mediaRec + mediaFinal)/2;
            if(total >= 7){
                System.out.println("Você foi aprovado após a recuperação");
            } else {
                System.out.println("A sua nota não foi igual ou maior a 7, então você foi reprovado");
                System.out.println("Média final foi de: "+ total);
            }
        }
    }
}
