import java.util.Scanner;

public class Cinco {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int tempo=0, distancia, velocidade=0, litrosUsados;

        System.out.println("Informe o tempo gasto na viagem: (H)");
        tempo = scan.nextInt();
        System.out.println("Informe a velocidade média: (Km)");
        velocidade = scan.nextInt();

        distancia= tempo * velocidade;
        litrosUsados = distancia / 12;

        System.out.println("Você usou um total de " + litrosUsados + "L de gasolina");
    }
}
