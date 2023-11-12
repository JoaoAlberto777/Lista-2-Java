import java.util.Scanner;
public class Distância {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float Distância;
        float Tempo;
        float Velocidade;
        float Litros;

        System.out.print("Informe quanto tempo levara a viagem em HORAS: ");
        Tempo = sc.nextFloat();

        System.out.print("Informe a velocidade Média da via: ");
        Velocidade = sc.nextFloat();

        Distância = Tempo * Velocidade;

        Litros = Distância / 12;

        System.out.println("Velocidade media: " + Velocidade + " Km/h");
        System.out.println("Tempo gasto: " + Tempo + " Horas");
        System.out.println("Distância percorrida: " + Distância +" Kilometos");
        System.out.println("Litros gastos durante a viagem: " + Litros);

        
        sc.close();
    }
}
