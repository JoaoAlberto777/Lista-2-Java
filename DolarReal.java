import java.util.Scanner;
public class DolarReal {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float CD;
        float Valor;
        float Real;

        System.out.print("Informe a cotação atual do Dólar: ");
        CD = sc.nextFloat();

        System.out.print("Informe um valor em Dolares: ");
        Valor = sc.nextFloat();

        Real = (CD * Valor);

        System.out.println("Seus " + Valor + " Dolares equivalem a " + Real + " Reais!");
        sc.close();
    }
}
