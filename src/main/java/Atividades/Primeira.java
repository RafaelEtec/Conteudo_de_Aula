package Atividades;
import java.util.Scanner;
/** por Rafael Ferreira Goulart
    Dados 3 valores reais (float ou double) imprimir o valor do produto destes valores 
**/
public class Primeira {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Insira o primeiro valor");
        double Pri = entrada.nextDouble();
        
        System.out.println("Insira o Segundo valor");
        double Seg = entrada.nextDouble();
        
        System.out.println("Insira o Terceiro valor");
        double Ter = entrada.nextDouble();
        
        System.out.println("Os valores são: "+Pri+", "+Seg+" e "+Ter);
    }
}