package API_29_04_2022;
import java.util.Random;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class Final_ADO8 {
    public static void main(String[] args) {
        // Iniciando variáveis
        Scanner ent = new Scanner(System.in);
        int tamanhoCaminho = 0, qntBombas;
        boolean vivo = true;
        
        // Inserindo valores
        // Tamanho do Caminho
        System.out.println(
                "|-------------------------| Caminho Minado |-------------------------| \n"
              + "| Informe o tamanho do caminho:                                      |");
        tamanhoCaminho = ent.nextInt();
        while (tamanhoCaminho <= 1) {
            System.out.println(
                "| É necessário um número maior que 1!                                | \n"
              + "| Informe novamente:                                                 |");
            tamanhoCaminho = ent.nextInt();
        }
        
        // Quantidade de bombas
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
        
        // Criando Array para guardar quantidade de bombas para posteriormente
        // atruir as bombas à sua posição
        int posBombasArray[] = new int[qntBombas];
        // Criando o caminho para visualização
        String[] caminhoVis = new String[tamanhoCaminho];
        // Criando o caminho para atribuir as bombas
        String[] caminho = new String[tamanhoCaminho];
        
        //Visualizando o caminho
        while (vivo) {
            System.out.println();
            System.out.println(
                "|-------------------------| Caminho Minado |-------------------------|");
            
            // Visualização dos números das posições
            for (int pos = 0; pos < tamanhoCaminho; pos++) {
                if (pos == 0) {
                    System.out.print("|");
                }
                System.out.print(" "+pos+" |");
            }
            System.out.println();
            
            // Visualização das posições disponíveis
            
            vivo = false;
        }
    }
}
