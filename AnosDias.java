import java.util.Scanner;
public class AnosDias {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int anos;
        int meses;
        int dias;
        int r;

        System.out.print("Informe sua idade em anos: ");
        anos = sc.nextInt();

        System.out.print("Informe quantos meses se passaram apos seu aniversario: ");
        meses = sc.nextInt();

        System.out.print("Infrome quantos dias se passaram apos os meses citados: ");
        dias = sc.nextInt();

        r = (anos * 365) + (meses / 30) + dias;

        System.out.println("Sua idade em dias: " + r);

        System.out.println("Após os calculos foi possivel verificar que o usuário tem " + anos + " anos " + meses + " meses e " + dias + " Dias");
        System.out.println("Tendo assim: " + r + " Dias de idade");

        sc.close();
    }
}
