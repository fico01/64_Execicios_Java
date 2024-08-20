import java.util.Scanner;

public class Vinte_Um {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int value = 0;
        int continuar = 1;

        System.out.println("Digite um valor");
        value = scan.nextInt();
        if (value >= 0){
            System.out.println("Positivo");
        } else {
            System.out.println("Negativo");
        }
        System.out.println("Continuar? [1]Sim [2]Não");
        continuar = scan.nextInt();
        switch (continuar){
            case 1:
                System.out.println("Digite um valor");
                value = scan.nextInt();
                if (value >= 0){
                    System.out.println("Positivo");
                } else {
                    System.out.println("Negativo");
                }
                System.out.println("Continuar? [1]Sim [2]Não");
                continuar = scan.nextInt();
                break;
            case 2:
                System.out.println("OK");
                break;
            default:
                System.out.println("Valor inválido");
                System.out.println("Continuar? [1]Sim [2]Não");
                continuar = scan.nextInt();
                break;
        }
    }
}
