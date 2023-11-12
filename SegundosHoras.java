import java.util.Scanner;
public class SegundosHoras {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        int seg;
        int min; 
        int hr;
        int resto;

        System.out.print("Informe a duração em segundos: ");
        seg = sc.nextInt();

        hr = seg / 3600;
        resto = seg % 3600;
        min = resto / 60;
        seg = seg % 60;
      

        System.out.println("Duração: " + hr +":" + min + ":" + seg );


        sc.close();
    }
}
