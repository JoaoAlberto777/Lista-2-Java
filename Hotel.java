import java.util.Scanner;
public class Hotel {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Float Diaria ;
        Float DiariaD ;
        float mesSemDesconto;
        float mesComDesconto;
        float apNumPromo = 29.4f;
        float apNumSemPromo = 16.8f;
        float LucroPrejuizo;
        //int mes;


        System.out.print("Informe o valor da diara: ");
        Diaria = sc.nextFloat();

        /*System.out.print("Mes de Hospedagem: ");
        mes = sc.nextInt();

        boolean promocao = (mes >= 4 && mes <= 11);
        apNum *= promocao ? 0.70f : 0.40f;*/

        DiariaD = Diaria - (Diaria * 0.22f); 

        //apNum = apNum  * 0.70f ;
        mesComDesconto = (DiariaD * 8 * apNumPromo) / 30;

        //apNum = apNum * 0.40f;
        mesSemDesconto = (Diaria * 8 * apNumSemPromo) / 30;
        LucroPrejuizo = mesComDesconto - mesSemDesconto;

        /*if (mes >= 4 && mes <= 11){
        System.out.println("Arrecadação media COM desconto: " + mesComDesconto);
        }else{
            
        System.out.println("Arrecadação media SEM desconto: " + mesSemDesconto);
        } */


        System.out.println("Diaria na Promoção: " + DiariaD);
        System.out.println("Arrecadação media COM desconto: " + mesComDesconto);
        System.out.println("Arrecadação media SEM desconto: " + mesSemDesconto);
        System.out.println("Lucrou ou Prejuizo Mensal com Promoção: " + LucroPrejuizo);


        sc.close();
        
    }
}
