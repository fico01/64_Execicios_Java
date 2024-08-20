import java.util.Scanner;

public class Quarenta_Quatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menu = 0;
        String resp = "n";

        System.out.println("1-Conversão de Graus Celsiu em Graus Fahrenheit\n2-Conversão de Graus Fahrenheit em Graus Celsius\n3-Peso ideal do homem\n4-Peso ideal da mulher");
        menu = scan.nextByte();
        while (resp.equals("n") || resp.equals("N")){
            switch (menu){
                case 1:
                    int  F,C = 0;

                    System.out.println("Digite um valor:");
                    C = scan.nextInt();

                    F = (9 * C + 160)/ 5;
                    System.out.println("Deu "+F+"ºF!");
                    break;
                case 2:

                    System.out.println("Digite um valor:");
                    F = scan.nextInt();

                    C = (F - 32)* 5 /9;
                    System.out.println("Deu "+F+"ºC");
                    break;
                case 3:
                    double h = 0;

                    System.out.println("Digite sua altura:");
                    h = scan.nextDouble();

                    double homi =(72.7*h)-58;
                    System.out.println("O seu peso ideal é "+ homi + "Kg");
                    break;
                case 4:

                    System.out.println("Digite sua altura:");
                    h = scan.nextDouble();

                    double muie =(62.1 * h)-44.7;
                    System.out.println("O seu peso ideal é "+ muie + "Kg");
                    break;
                default:
                    System.out.println("Digite uma opção válida");
                    break;

            }
            System.out.println("Deseja encerrar o progama?");
            resp = scan.next();
            System.out.println("1-Conversão de Graus Celsiu em Graus Fahrenheit\n2-Conversão de Graus Fahrenheit em Graus Celsius\n3-Peso ideal do homem\n4-Peso ideal da mulher");
            menu = scan.nextByte();
        }
    }
}
