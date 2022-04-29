package API_29_04_2022;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
/** 
   por Rafael Ferreira Goulart
**/
public class PI_ADO8 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int tamanhoCaminho = 123, qntBombas = 0;
        
        System.out.println(
                "|-------------------------| Caminho Minado |-------------------------| \n"
              + "| Informe o tamanho do caminho:                                      |");
        do {
            if (tamanhoCaminho <= 1) {
                System.out.println(
                "| É necessário um número maior que 1!                                | \n"
              + "| Informe novamente:                                                 |");
            }
            tamanhoCaminho = ent.nextInt();
        } while (tamanhoCaminho <= 1);
        
        System.out.println(
                "| Informe a quantidade de Bombas:                                    |");
        qntBombas = ent.nextInt();
        while (qntBombas <= 0 || qntBombas >= tamanhoCaminho) {
            if (qntBombas <= 0) {
                System.out.println(
                "| É necessário um número maior que 0                                 | \n"
              + "| Informe novamente:                                                 |");
            }
            if (qntBombas >= tamanhoCaminho) {
                System.out.println(
                "| É necessário um número menor que o tamanho do caminho              | \n"
              + "| Informe novamente:                                                 |");
            }
            qntBombas = ent.nextInt();
        }
        
        System.out.println(
                "|-------------------------| Caminho Minado |-------------------------|");
        for (int pos = 0; pos < tamanhoCaminho; pos++) {
            if (pos == 0) {
                System.out.print("|-");
            }
            System.out.print(" "+pos+" -");
            if (pos == (tamanhoCaminho - 1)) {
                System.out.print("|");
            }
        }
        System.out.println();
        for (int pos = 0; pos < tamanhoCaminho; pos++) {
            if (pos == 0) {
                System.out.print("|-");
            }
            if (pos >= 100) {
                System.out.print(" ___ -");
            } else if (pos >= 10) {
                System.out.print(" __ -");
            } else {
                System.out.print(" _ -");
            }
            if (pos == (tamanhoCaminho - 1)) {
                System.out.print("|");
            }
        }
        
        int[] caminho = new int[tamanhoCaminho];
        for (int pos = 0; pos < tamanhoCaminho; pos++) {
            caminho[pos] = 0;
        }
    }
    
    public static int[] entIntArray() {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira a quantidade de números a serem guardados: ");
        int tamanhoArray = ent.nextInt();
        int[] entIntArray = new int[tamanhoArray];
        
        for (int pos = 0; pos < tamanhoArray; pos++) {
            System.out.println("pos: "+pos+" - Insira o número da posição: ");
            int num = ent.nextInt();
            entIntArray[pos] = num;
        }
        
        return entIntArray;
    }
}