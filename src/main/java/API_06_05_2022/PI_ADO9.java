package API_06_05_2022;
import java.util.Random;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class PI_ADO9 {
    
    public static Scanner ent = new Scanner(System.in);
    public static Random ran = new Random();
    public static int caminhoLin;
    public static int caminhoCol;
    public static int qntBombas;
    
    public static void main(String[] args) {
        // Iniciando variáveis
        boolean jogando = true;
        int totalCelulas = 0, pontos = 0;
        
        // Inserindo valores
            // Tamanho do caminho (Linhas)
        System.out.println(
                "|-------------------------| Campo Minado |-------------------------| \n"
              + "| Informe o número de linhas do caminho:                           |");
        caminhoLin = ent.nextInt();
        while (caminhoLin < 2) {
            System.out.println(
                "| É necessário um número maior que 2!                              | \n"
              + "| Insira novamente:                                                |");
            caminhoLin = ent.nextInt();
        }
            // (Colunas)
        System.out.println(
                "| Informe o número de colunas do caminho:                          |");
        caminhoCol = ent.nextInt();
        while (caminhoCol < 2) {
            System.out.println(
                "| É necessário um número maior que 2!                              | \n"
              + "| Insira novamente:                                                |");
            caminhoCol = ent.nextInt();
        }
        totalCelulas = caminhoLin * caminhoCol;
            // Quantidade de bombas
        System.out.println(
                "| Informe o número bombas no caminho:                              |");
        qntBombas = ent.nextInt();
        while (qntBombas <= 0 || qntBombas >= totalCelulas) {
            if (qntBombas <= 0) {
                System.out.println(
                "| É necessário um número maior que 0!                              | \n"
              + "| Insira novamente:                                                |");
            }
            if (qntBombas >= totalCelulas) {
                System.out.println(
                "| É necessário um número menor que "+totalCelulas+" \n"
              + "| Insira novamente:                                                |");
            }
            qntBombas = ent.nextInt();
        }
        
        // Criando array para guardar a posição das bombas
        int[][] posBombasArray = new int[qntBombas][qntBombas];
        // Criando o caminho para visualização
        String[][] caminhoVis = new String[caminhoLin][caminhoCol];
        // Criando o caminho para atribuir as bombas
        int[][] caminho = new int[caminhoLin][caminhoCol];
        
        // Atribuindo valores ao caminho
        for (int posLin = 0; posLin < caminhoLin; posLin++) {
            for (int posCol = 0; posCol < caminhoCol; posCol++) {
                caminho[posLin][posCol] = 0;
            }
        }
        
        // Atribuindo as bombas ao caminho
        
        
        // Visualizando o caminho
        while (jogando) {
            System.out.println();
            System.out.println(
                "|-------------------------| Campo Minado |-------------------------|");
            
            // Visualização da matriz
            visualizaMatriz(caminhoVis);
            
            jogando = false;
        }
    }
    
    public static String[][] visualizaMatriz(String[][] caminhoVis) {
        System.out.print("|    |");
        for (int posCol = 0; posCol < caminhoCol; posCol++) {
            if (posCol >= 10) {
                System.out.print(" "+posCol+" |");
            } else {
                System.out.print(" "+posCol+" |");
            }
        }
        System.out.println();
        for (int posLin = 0; posLin < caminhoLin; posLin++) {
            if (posLin >= 10) {
                System.out.print("| "+posLin+" |");
            } else {
                System.out.print("|  "+posLin+" |");
            }
            for (int posCol = 0; posCol < caminhoCol; posCol++) {
                if (posCol >= 10) {
                    caminhoVis[posLin][posCol] = " __";
                } else {
                    caminhoVis[posLin][posCol] = " _";
                }
                System.out.print(caminhoVis[posLin][posCol] + " |");
            }
            System.out.println();
        }
        
        return caminhoVis;
    }
    
    public static void visualizaPontos(int pontos) {
        if (pontos >= 100) {
            System.out.println(
                "| Sua Pontuação: "+pontos+"                                                 |");
        } else if (pontos >= 10) {
            System.out.println(
                "| Sua Pontuação: "+pontos+"                                                  |");
        } else if (pontos < 10) {
            System.out.println(
                "| Sua Pontuação: "+pontos+"                                                   |");
        } 
    }
}