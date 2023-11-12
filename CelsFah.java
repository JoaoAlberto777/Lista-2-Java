import java.util.Scanner;
public class CelsFah {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float c;
        float f;
        

        System.out.print("Infrome a temperatura em Graus Celsius: ");
        c = sc.nextFloat();

        f =  (9 * c + 160) / 5;
        System.out.println("A temperatura de " + c + "° Celsius em Fahrenheit é de " + f +"°");

        sc.close();


    }
}
