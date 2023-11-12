import java.util.Scanner;
public class Tabuada{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n;
        int r;
        System.out.println(">--- TABUADA ---<");
        System.out.print("Informe um número: ");
        n = sc.nextInt();

        System.out.println(">--RESULTADO--<");
        for(int i = 1; i <= 10; i++){
            r = n * i;
            System.out.println(n + " X " + i + " = " + r);
        }
        sc.close();
    }
}