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
        String pergunta = 
                  "Segundo o Sistema de Numeração Egípcio.\n"
                + "O número 1000 corresponde a: \n";
        String[] alternativas = {
                  "(A) Bastão"
                , "(B) Rolo de Corda"
                , "(C) Peixe"
                , "(D) Flor de Lótus"
                , "(E) Homem"};
        
        do {
            System.out.println(pergunta);
            for (int pos = 0; pos < alternativas.length; pos++) {
                System.out.println(alternativas[pos]);
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
                    System.out.println("<d> É a Resposta Correta!");
                    correto = true;
                    break;
                case "e":
                    System.out.println("Resposta Incorreta!");
                    tentativas--;
                    break;
            }
            
            trocarAlternativas(alternativas);
        } while (!correto && tentativas != 0);
        if (tentativas == 0) {
            System.out.println("Você excedeu o número de tentativas!");
        }
    }
    
    public static String[] trocarAlternativas(String[] alternativas) {
        
        List<String> strAlternativas = Arrays.asList(alternativas);
        Collections.shuffle(strAlternativas);
        strAlternativas.toArray(alternativas);
        
        return alternativas;
    }
}