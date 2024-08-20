import java.util.Scanner;

public class Trinta_Sete {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String resp = "sim";
        while (resp == "sim" || resp == "s" || resp == "S"){
            int menu = 0;
            int[] num = new int[2];
            System.out.println("Escolha uma das opções:\n1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão");
            menu = scan.nextByte();

            for (int i = 0; i < 2; i++){
                System.out.println("Digite o "+(i+1)+"º número:");
                num[i] = scan.nextInt();
            }
            switch (menu) {
                case 1:
                    System.out.println(num[0] + " + " + num[1] + " = " + (num[0]+num[1]));
                    break;
                case 2:
                    System.out.println(num[0] + " - " + num[1] + " = " + (num[0]-num[1]));
                    break;
                case 3:
                    System.out.println(num[0] + " * " + num[1] + " = " + (num[0]*num[1]));
                    break;
                case 4:
                    System.out.println(num[0] + " / " + num[1] + " = " + (num[0]/num[1]));
                    break;
                default:
                    System.out.println("Opção inválida");
                    break;
            }
            System.out.println("Voltar ao menu?");
            resp = scan.next();
        }
    }
}
