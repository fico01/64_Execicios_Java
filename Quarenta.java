import java.util.Scanner;

public class Quarenta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Float ind = new Float(0);
        String resp = "n";
        while (resp.equals("n") || resp.equals("N")){
            System.out.println("Digite o índice de poluição:");
            ind = scan.nextFloat();

            if (ind >= 0.3 && ind <= 0.39){
                System.out.println("Empresas do 1º grupo devem suspender suas atividades");
            } else if (ind >= 0.4 && ind <= 0.49) {
                System.out.println("Empresas do 1º e 2º grupo devem suspender suas atividades");
            } else if (ind >= 0.5) {
                System.out.println("Todos os grupos de empresas devem suspender suas atividades");
            } else {
                System.out.println("Tudo ok!");
            }
            System.out.println("Deseja encerrar o programa?");
            resp = scan.next();
        }

    }
}
