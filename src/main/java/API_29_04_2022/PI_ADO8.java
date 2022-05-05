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
        int tamanhoCaminho = 123, qntBombas = 0, bombasNoJogo = 0, posJogador = 0, points = 0;
        int[] bombasPos = new int[qntBombas];
        boolean vivo = true, start = true;
        Random ran = new Random();
        
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
        int posBombasArray[] = new int[qntBombas];
        // criando o caminho para visualização
        String[] caminhoVis = new String[tamanhoCaminho];
        // criando o caminho para atribuir as bombas
        String[] caminho = new String[tamanhoCaminho];
        
        // Visualizando o caminho
        while (vivo) {
            System.out.println();
            System.out.println(
                "|-------------------------| Caminho Minado |-------------------------|");
            
            // Visualização do número das posições
            for (int pos = 0; pos < tamanhoCaminho; pos++) {
                if (pos == 0) {
                    System.out.print("|");
                }
                System.out.print(" "+pos+" |");
            }
            System.out.println();
            
            // Visualização das posições disponíveis
            if (start) {
                for (int pos = 0; pos < tamanhoCaminho; pos++) {
                    if (pos >= 100) {
                        caminhoVis[pos] = "___";
                    } else if (pos >= 10) {
                        caminhoVis[pos] = "__";
                    } else {
                        caminhoVis[pos] = "_";
                    }
                }
            }
            for (int pos = 0; pos < tamanhoCaminho; pos++) {
                if (pos == 0) {
                    System.out.print("|");
                }
                if (pos >= 100) {
                    if (caminhoVis[pos].equals("-1")) {
                        System.out.print("  "+caminhoVis[pos]+" |");
                    } else {
                        System.out.print(" "+caminhoVis[pos]+" |");
                    }
                } else if (pos >= 10) {
                    if (caminhoVis[pos].equals("-1")) {
                        System.out.print(" "+caminhoVis[pos]+" |");
                    } else {
                        System.out.print(" "+caminhoVis[pos]+" |");
                    }              
                } else {
                    if (caminhoVis[pos].equals("-1")) {
                        System.out.print(""+caminhoVis[pos]+" |");
                    } else {
                        System.out.print(" "+caminhoVis[pos]+" |");
                    }
                }
            }
            
            // Embaralhando as bombas
            if (start) {
                System.out.println();
                for (int pos = 0; pos < qntBombas; pos++) {
                    int posBombas = ran.nextInt(tamanhoCaminho);
                    caminho[posBombas] = "-1";
                    posBombasArray[pos] = posBombas;
                    System.out.print(posBombasArray[pos]+" ");
                }
            }
            
            // Permitindo que o usuário decida a posição que será descoberta
            if (vivo) {
                System.out.println(
                "| Informe a posição a ser atacada:                                   |");
            posJogador = ent.nextInt();
            }

            for (int pos = 0; pos < tamanhoCaminho; pos++) {
                if (caminho[posJogador].equals("-1")) {
                    System.out.println(
                            "|                           Game Over !                              |");
                    if (points >= 100) {
                        System.out.println(
                            "| Sua Pontuação: "+points+"                                                 |");
                        break;
                    } else if (points >= 10) {
                        System.out.println(
                            "| Sua Pontuação: "+points+"                                                  |");
                        break;
                    } else if (points < 10) {
                        System.out.println(
                            "| Sua Pontuação: "+points+"                                                   |");
                        break;
                    }
                    vivo = false;
                } else {
                    caminhoVis[posJogador] = "x";
                }
            }
            
            vivo = false;
            if (start) {
                vivo = true;
            }
            start = false;
        }  
    } 
}
/**String[] caminho = new String[tamanhoCaminho];
        for (int pos = 0; pos < qntBombas; pos++) {
            int posBombas = ran.nextInt(tamanhoCaminho) + 1;
            caminho[posBombas] = "-1";
            posBombasArray[pos] = posBombas;
            System.out.print(posBombasArray[pos]+" ");
        }
**/