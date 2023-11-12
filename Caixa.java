import java.util.Scanner;

public class Caixa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor;
        System.out.print("Digite o valor para saque: ");
        valor = sc.nextInt();

        int[] notas = {100, 50, 20, 10, 5, 2};

        int[] qtdNotas = new int[notas.length];

        for (int i = 0; i < notas.length; i++) {
            qtdNotas[i] = valor / notas[i];
            valor %= notas[i];
        }

        System.out.println("Quantidade de notas para o saque:");
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + " - " + qtdNotas[i] + " notas");
        }
        sc.close();
    }
}
