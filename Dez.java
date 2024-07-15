import java.util.Scanner;

public class Dez {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean igual=false, maiorIgual=false, menorIgual=false, diferente=false, maior=false, menor=false;
        int[] valor = new int[3];

        for (int i = 0; i < 2; i++){
            System.out.println("Informe o valor["+(i+1)+"]:");
            valor[i] = scan.nextInt();
        }
        if (valor[1] == valor[2]){ igual = true;}
        if (valor[1] <= valor[2]){ menorIgual = true;}
        if (valor[1] >= valor[2]){ maiorIgual = true;}
        if (valor[1] != valor[2]){ diferente = true;}
        if (valor[1] > valor[2]){ maior = true;}
        if (valor[1] < valor[2]){ menor = true;}

        System.out.println("Igual: "+ igual+"\nMenor ou igual: " + menorIgual
        + "\nMaior ou igual: " + maiorIgual + "\nDiferente: " + diferente +
                "\nMaior: " + maior + "\nMenor: " + menor);
    }
}
