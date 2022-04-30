package API_29_04_2022;
import java.util.Random;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class PI_ADO8 {
    public static void main(String[] args) {
        // Iniciando variáveis
        Scanner ent = new Scanner(System.in);
        int tamanhoCaminho = 123, qntBombas = 0, bombasNoJogo = 0;
        int[] bombasPos = new int[qntBombas];
        boolean vivo = true;
        
        // Inserindo valores
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
        
        // criando o caminho
        // int valor = new Random().nextInt(tamanhoCaminho) + 1;
        int[] caminho = new int[tamanhoCaminho];
        for (int pos = 0; pos < qntBombas; pos++) {
            int posBombas = new Random().nextInt(tamanhoCaminho) + 1;
            
        }
        
        for (int pos = 0; pos < tamanhoCaminho; pos++) {
            
            
        }
        
        // Visualizando o caminho
        while (vivo) {
            System.out.println(
                "|-------------------------| Caminho Minado |-------------------------|");
            for (int pos = 0; pos < tamanhoCaminho; pos++) {
                if (pos == 0) {
                    System.out.print("|");
                }
                System.out.print(" "+pos+" |");
            }
            System.out.println();
            for (int pos = 0; pos < tamanhoCaminho; pos++) {
                if (pos == 0) {
                    System.out.print("|");
                }
                if (pos >= 100) {
                    System.out.print(" ___ |");
                } else if (pos >= 10) {
                    System.out.print(" __ |");
                } else {
                    System.out.print(" _ |");
                }
            }
            System.out.println();
            for (int pos = 0; pos < tamanhoCaminho; pos++) {
                if (pos == 0) {
                    System.out.print("|");
                }
                if (pos >= 100) {
                    if (caminho[pos] == -1) {
                        System.out.print("  "+caminho[pos]+" |");
                    } else {
                        System.out.print("   "+caminho[pos]+" |");
                    }
                } else if (pos >= 10) {
                    if (caminho[pos] == -1) {
                        System.out.print(" "+caminho[pos]+" |");
                    } else {
                        System.out.print("  "+caminho[pos]+" |");
                    }              
                } else {
                    if (caminho[pos] == -1) {
                        System.out.print(""+caminho[pos]+" |");
                    } else {
                        System.out.print(" "+caminho[pos]+" |");
                    }
                }
            }
            vivo = false;
        }
    } 
}