import java.util.Scanner;
public class NumInvert {
    public static String reverse(String n){
        String rev  = "";

        for (int i = n.length() - 1; i >=0 ; i--) {
            rev += n.charAt(i);
        }
        return rev;
    }
    
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        
        String n;
        System.out.print("Informe um número de 3 dígitos: ");
        n = sc.next();

        n = reverse(n);
        
        System.out.println("Numeros invertidos: " + n );
        sc.close();
    }
}
