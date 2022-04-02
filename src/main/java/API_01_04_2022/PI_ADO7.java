package API_01_04_2022;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;
/** 
   por Rafael Ferreira Goulart
**/
public class PI_ADO7 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        String resp;
        boolean correto = false;
        int tentativas = 3;
        int[] posAlt = {0, 1, 2, 3, 4};
        String[] alternativa = {"Bastão", "Rolo de Corda", "Peixe", "Flor de Lótus", "Homem"};
        String pergunta = 
                  "Segundo o Sistema de Numeração Egípcio.\n"
                + "O número 1000 corresponde a: \n";
        String[] alternativaOpcao = {
                  "(A) "+alternativa[posAlt[0]]
                , "(B) "+alternativa[posAlt[1]]
                , "(C) "+alternativa[posAlt[2]]
                , "(D) "+alternativa[posAlt[3]]
                , "(E) "+alternativa[posAlt[4]] };
        
        do {
            System.out.println(pergunta);
            for (int pos = 0; pos < alternativaOpcao.length; pos++) {
                System.out.println(alternativaOpcao[pos]);
            }
            
            resp = ent.next();
            
            switch (resp.toLowerCase()) {
                case "a":
                    System.out.println("Resposta Incorreta!");
                    tentativas--;
                    break;
                case "b":
                    System.out.println("Resposta Incorreta!");
                    tentativas--;
                    break;
                case "c":
                    System.out.println("Resposta Incorreta!");
                    tentativas--;
                    break;
                case "d":
                    System.out.println("<D> É a Resposta Correta!");
                    correto = true;
                    break;
                case "e":
                    System.out.println("Resposta Incorreta!");
                    tentativas--;
                    break;
            }
            
        } while (!correto && tentativas != 0);
        if (tentativas == 0) {
            System.out.println("Você excedeu o número de tentativas!");
        }
    }
    
    public static String[] trocarAlternativas(String[] alternativa) {
        
        List<String> strAlternativas = Arrays.asList(alternativa);
        Collections.shuffle(strAlternativas);
        strAlternativas.toArray(alternativa);

        return alternativa;
    }
    
    public static int[] trocarPosicao(int[] posAlt) {
        
        List<Integer> intList = Arrays.asList(posAlt);
        Collections.shuffle(intList);
        intList.toArray(posAlt);
        
        return posAlt;
    }
}