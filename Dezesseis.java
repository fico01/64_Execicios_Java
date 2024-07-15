import java.util.Scanner;

public class Dezesseis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] value = new int[2];

        for (int i = 0; i < 2; i++){
            System.out.println("Digite o valor["+(i+1)+"]");
            value[i] = scan.nextInt();
        }
        if (value[0] > value[1]){
            System.out.println("O valor[1] '"+value[0]+"' é maior que o valor[2] '"+value[1]+"'");
        } else if (value[1] > value[0]){
            System.out.println("O valor[2] '"+value[1]+"' é maior que o valor[1] '"+value[0]+"'");
        } else if (value[0] == value[1]) {
            System.out.println("Os valores são iguais");
        }

    }
}
