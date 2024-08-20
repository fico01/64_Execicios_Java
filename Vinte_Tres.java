import java.util.Scanner;

public class Vinte_Tres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float[] values = new float[2];
        String operation = "";
        int cont = 1;

        for (int i = 0; i < 2; i++){
            System.out.println("Digite o valor["+(i+1)+"]");
            values[i] = scan.nextInt();
        }

        System.out.println("Escolha uma operação: [+][-][*][/]");
        operation = scan.next();

        switch (operation) {
            case "+":
                System.out.println(values[0] + " + " + values[1] + " = " + (values[0] + values[1]));
                System.out.println("Continuar? [1]Sim [2]Não");
                cont = scan.nextByte();
                break;
            case "-":
                System.out.println(values[0] + " - " + values[1] + " = " + (values[0] - values[1]));
                System.out.println("Continuar? [1]Sim [2]Não");
                cont = scan.nextByte();
                break;
            case "*":
                System.out.println(values[0] + " * " + values[1] + " = " + (values[0] * values[1]));
                System.out.println("Continuar? [1]Sim [2]Não");
                cont = scan.nextByte();
                break;
            case "/":
                System.out.println(values[0] + " / " + values[1] + " = " + (values[0] / values[1]));
                System.out.println("Continuar? [1]Sim [2]Não");
                cont = scan.nextByte();
                break;
        }
       if (cont == 1){
           for (int i = 0; i < 2; i++){
               System.out.println("Digite o valor["+(i+1)+"]");
               values[i] = scan.nextInt();
           }

           System.out.println("Escolha uma operação: [+][-][*][/]");
           operation = scan.next();

           switch (operation) {
               case "+":
                   System.out.println(values[0] + " + " + values[1] + " = " + (values[0] + values[1]));
                   System.out.println("Continuar? [1]Sim [2]Não");
                   cont = scan.nextByte();
                   break;
               case "-":
                   System.out.println(values[0] + " - " + values[1] + " = " + (values[0] - values[1]));
                   System.out.println("Continuar? [1]Sim [2]Não");
                   cont = scan.nextByte();
                   break;
               case "*":
                   System.out.println(values[0] + " * " + values[1] + " = " + (values[0] * values[1]));
                   System.out.println("Continuar? [1]Sim [2]Não");
                   cont = scan.nextByte();
                   break;
               case "/":
                   System.out.println(values[0] + " / " + values[1] + " = " + (values[0] / values[1]));
                   System.out.println("Continuar? [1]Sim [2]Não");
                   cont = scan.nextByte();
                   break;
           }
       } else if (cont == 2) {
           System.out.println("OK");
       }

    }
}
