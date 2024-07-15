import java.util.Scanner;

public class Quatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] valor = new int[4];

        for (int i=0; i < 4; i++) {
            System.out.println("Digite o valor"+(i+1)+":");
            valor[i] = scan.nextInt();
        }

        System.out.println("Resultados");

        System.out.println(valor[0] + " + " + valor[1] + " = " + (valor[0] + valor[1]) );
        System.out.println(valor[0] + " x " + valor[1] + " = " + (valor[0] * valor[1]) );
        System.out.println("------------------------------");
        System.out.println(valor[0] + " + " + valor[2] + " = " + (valor[0] + valor[2]) );
        System.out.println(valor[0] + " x " + valor[2] + " = " + (valor[0] * valor[2]) );
        System.out.println("------------------------------");
        System.out.println(valor[0] + " + " + valor[3] + " = " + (valor[0] + valor[3]) );
        System.out.println(valor[0] + " x " + valor[3] + " = " + (valor[0] * valor[3]) );
        System.out.println("------------------------------");
        System.out.println(valor[1] + " + " + valor[2] + " = " + (valor[1] + valor[2]) );
        System.out.println(valor[1] + " x " + valor[2] + " = " + (valor[1] * valor[2]) );
        System.out.println("------------------------------");
        System.out.println(valor[1] + " + " + valor[3] + " = " + (valor[1] + valor[3]) );
        System.out.println(valor[1] + " x " + valor[3] + " = " + (valor[1] * valor[3]) );
        System.out.println("------------------------------");
        System.out.println(valor[2] + " + " + valor[3] + " = " + (valor[2] + valor[3]) );
        System.out.println(valor[2] + " x " + valor[3] + " = " + (valor[2] * valor[3]) );

    }
}
