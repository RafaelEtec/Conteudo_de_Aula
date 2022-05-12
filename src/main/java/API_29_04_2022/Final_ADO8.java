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
        int tamanhoCaminho = 0, qntBombas, pontos = 0, posJogador;
        boolean jogando = true;
        
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
        
        // Criando Array para guardar a quantidade de bombas para posteriormente
        // atruir as bombas à sua posição
        int posBombasArray[] = new int[qntBombas];
        posBombasArray = embaralhaBombas(tamanhoCaminho, qntBombas);
        // Criando o caminho para visualização  
        String[] caminhoVis = new String[tamanhoCaminho];
        caminhoVis = visualizaPosDis(tamanhoCaminho);
        // Criando o caminho para atribuir as bombas
        int[] caminho = new int[tamanhoCaminho];
        
        // Atribuindo valores ao caminho
        for (int pos = 0; pos < tamanhoCaminho; pos++) {
            caminho[pos] = 0;
        }
        // Atribuindo as bombas ao caminho
        for (int pos = 0; pos < qntBombas; pos++) {
            int guarda = posBombasArray[pos];
            caminho[guarda] = -1;
        }
        
        //Visualizando o caminho
        while (jogando) {
            System.out.println();
            System.out.println(
                "|-------------------------| Caminho Minado |-------------------------|");
            
            // Visualização dos números das posições
            visualizaPosicoes(tamanhoCaminho);
            System.out.println();
            // Visualização das posições disponíveis
            for (int pos = 0; pos < tamanhoCaminho; pos++) {
                if (pos == 0) {
                    System.out.print("|");
                }
                if (pos >= 100) {
                    System.out.print(" "+caminhoVis[pos]+" |");
                } else if (pos >= 10) {
                    System.out.print(" "+caminhoVis[pos]+" |");
                } else {
                    System.out.print(" "+caminhoVis[pos]+" |");
                }
            }
            
            // Permitindo que o usuário decida a posição que será descoberta
            System.out.println();
            System.out.println(
                "| Informe a posição a ser atacada:                                   |");
            posJogador = ent.nextInt();
            while (posJogador >= tamanhoCaminho) {
                System.out.println(
                    "| A posição excede o tamanho do caminho !                            | \n"
                  + "| Insira novamente:                                                  |");
                posJogador = ent.nextInt();
            }
            while (caminho[posJogador] == 1) {
                System.out.println(
                    "| Posição já escolhida !                                             | \n"
                  + "| Insira novamente:                                                  |");
                posJogador = ent.nextInt();
            }
            
            // Verificando se há uma bomba na posição indicada
            if (caminho[posJogador] == -1) {
                visualizaPosicoes(tamanhoCaminho);
                System.out.println();
                for (int pos = 0; pos < tamanhoCaminho; pos++) {
                    if (caminho[pos] == -1) {
                        if (pos >= 100) {
                            caminhoVis[pos] = " b ";
                        } else if (pos >= 10) {
                            caminhoVis[pos] = " b";
                        } else {
                            caminhoVis[pos] = "b";
                        }
                    }
                    if (pos == 0) {
                        System.out.print("|");
                    }
                    if (pos >= 100) {
                        caminhoVis[posJogador] = " b ";
                        System.out.print(" "+caminhoVis[pos]+" |");
                    } else if (pos >= 10) {
                        caminhoVis[posJogador] = " b";
                        System.out.print(" "+caminhoVis[pos]+" |");
                    } else {
                        caminhoVis[posJogador] = "b";
                        System.out.print(" "+caminhoVis[pos]+" |");
                    }
                }
                System.out.println();
                System.out.println(
                    "|                           Game Over !                              |");
                visualizaPontos(pontos);
                jogando = false;
            } else {
                // Demarcando a posição
                if (posJogador >= 100) {
                    caminhoVis[posJogador] = " x ";
                } else if (posJogador >= 10) {
                    caminhoVis[posJogador] = " x";
                } else {
                    caminhoVis[posJogador] = "x";
                }
                caminho[posJogador] = 1;
                pontos++;
            }
            
            // Caso tenha ganhado
            if (pontos == (tamanhoCaminho - qntBombas)) {
                visualizaPosicoes(tamanhoCaminho);
                System.out.println();
                for (int pos = 0; pos < tamanhoCaminho; pos++) {
                    if (caminho[pos] == -1) {
                        if (pos >= 100) {
                            caminhoVis[pos] = " b ";
                        } else if (pos >= 10) {
                            caminhoVis[pos] = " b";
                        } else {
                            caminhoVis[pos] = "b";
                        }
                    }
                    if (pos == 0) {
                        System.out.print("|");
                    }
                    if (pos >= 100) {
                        System.out.print(" "+caminhoVis[pos]+" |");
                    } else if (pos >= 10) {
                        System.out.print(" "+caminhoVis[pos]+" |");
                    } else {
                        System.out.print(" "+caminhoVis[pos]+" |");
                    }
                }
                System.out.println();
                System.out.println(
                    "|                           Você ganhou !                            |");
                visualizaPontos(pontos);
                System.out.println("");
                jogando = false;
            }
            
            // Verificando se há bombas por perto
            if (jogando) {
                if (posJogador == 0) {
                    if (caminho[(posJogador + 1)] == -1) {
                        System.out.println(
                        "| Cuidado ! Há bombas por perto!                                     |");
                    }
                } else if (posJogador == (tamanhoCaminho - 1)) {
                    if (caminho[(posJogador - 1)] == -1) {
                        System.out.println(
                        "| Cuidado ! Há bombas por perto!                                     |");
                    }
                } else if (caminho[(posJogador - 1)] == -1 || caminho[(posJogador + 1)] == -1) {
                    System.out.println(
                        "| Cuidado ! Há bombas por perto!                                     |");
                }
            }
        }
    }
    
    public static void visualizaPosicoes(int tamanhoCaminho) {
        for (int pos = 0; pos < tamanhoCaminho; pos++) {
            if (pos == 0) {
                System.out.print("|");
            }
            System.out.print(" "+pos+" |");
        }
    }
    
    public static String[] visualizaPosDis(int tamanhoCaminho) {
        String[] caminhoVis = new String[tamanhoCaminho];
        for (int pos = 0; pos < tamanhoCaminho; pos++) {
            if (pos >= 100) {
                caminhoVis[pos] = "___";
            } else if (pos >= 10) {
                caminhoVis[pos] = "__";
            } else {
                caminhoVis[pos] = "_";
            }
        }
        
        return caminhoVis;
    }
    
    public static int[] embaralhaBombas(int tamanhoCaminho, int qntBombas) {
        Random ran = new Random();
        int[] posBombasArray = new int[tamanhoCaminho];
        int[] retornaBombas = new int[qntBombas];
        int posBombas = 0, checkBombs = 0;
        int numeroBombasColocadas = 0;
        while (numeroBombasColocadas<qntBombas) {
            posBombas = ran.nextInt(tamanhoCaminho-1);
            if(posBombasArray[posBombas]!=-1){
                posBombasArray[posBombas] = -1; 
                numeroBombasColocadas++;
            }
        }
        for (int pos = 0; pos < posBombasArray.length; pos++) {
            if (posBombasArray[pos] == -1) {
                retornaBombas[checkBombs] = pos;
                checkBombs++;
            }
        }
        
        // Mostra a posição das bombas
        //
        //for (int pos = 0; pos < posBombasArray.length; pos++) {
        //    System.out.print(posBombasArray[pos]+"\t");
        //}

        return retornaBombas;
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