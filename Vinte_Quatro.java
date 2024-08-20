import java.util.Scanner;

public class Vinte_Quatro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] values = new int[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o valor[" + (i + 1) + "]");
            values[i] = scan.nextInt();
        }
        int escolha = 0;

        System.out.println("Escolha uma opção:\n1-Verificar se um dos números lidos é ou não múltiplo do outro\n2-Verificar se os dois números são pares" +
                "\n3-Verificar se a média dos dois números é maior ou igual a 7\n4-Sair");
        escolha = scan.nextInt();
        switch (escolha){
            case 1:
                if (values[0]%values[1]==0 || values[1]%values[0]==0 ){
                    System.out.println("São múltiplos");
                } else {
                    System.out.println("Não são múltiplos");
                }
                break;
            case 2:
                if (values[0]%2==0 && values[1]%2==0){
                    System.out.println("São pares");
                } else {
                    System.out.println("Não são pares");
                }
                break;
            case 3:
                if ((values[0]+values[1])/2 >= 7){
                    System.out.println("É maior ou igual a 7");
                } else {
                    System.out.println("Não é maior ou igual a 7");
                }
                break;
            case 4:
                System.out.println("ok");
                break;
            default:
                System.out.println("Digite um valor válido");
                break;
        }
    }
}
