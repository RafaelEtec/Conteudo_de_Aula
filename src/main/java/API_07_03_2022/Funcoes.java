package API_07_03_2022;
import java.util.Scanner;
/**
   por Rafael Ferreira Goulart
**/
public class Funcoes {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Prim. Valor: ");
        double n1 = ent.nextDouble();
        System.out.println("Seg. Valor: ");
        double n2 = ent.nextDouble();
        System.out.println("Terc. Valor: ");
        double n3 = ent.nextDouble();
        
        double media = CalcularMedia(n1, n2, n3);
        System.out.println("Sua média é: "+media);
    }
    
    public static double CalcularMedia(double nota1, double nota2, double nota3) {
        double media = (nota1 + nota2 + nota3) / 3;
        return media;
    }
}
