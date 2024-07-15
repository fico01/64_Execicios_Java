import java.util.Scanner;

public class Tres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nVnddr;
        double id,valor,comissao,qVendida;

        System.out.println("Digite a identificação do vendedor:");
        nVnddr = scan.next();

        System.out.println("Digite o código de id da peça:");
        id = scan.nextDouble();

        System.out.println("Digite o valor unitario da peça:");
        valor = scan.nextDouble();

        System.out.println("Digite a quantidade vendida: ");
        qVendida = scan.nextDouble();

        comissao = (valor * qVendida) * 0.05;

        System.out.println("A sua comissão foi de: " + comissao + "R$");

    }
}
