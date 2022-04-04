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
        String[] alternativas = {"Bastão", "Rolo de corda", "Peixe", "Flor de Lótus", "Homem"};
        String pergunta = 
                  "Segundo o Sistema de Numeração Egípcio.\n"
                + "O número 1000 corresponde a: \n";
        String certoErrado = "";
        do {
            trocarAlternativas(alternativas);
            System.out.println(pergunta);
            System.out.println(
                    "(A) "+alternativas[0]
                + "\n(B) "+alternativas[1]
                + "\n(C) "+alternativas[2]
                + "\n(D) "+alternativas[3]
                + "\n(E) "+alternativas[4] ); 
            resp = ent.next();
            switch (resp.toLowerCase()) {
                case "a":
                    System.out.println(certoErrado(retornoResp(alternativas, resp)));
                    correto = retornoResp(alternativas, resp);
                    tentativas--;
                    break;
                case "b":
                    System.out.println(certoErrado(retornoResp(alternativas, resp)));
                    correto = retornoResp(alternativas, resp);
                    tentativas--;
                    break;
                case "c":
                    System.out.println(certoErrado(retornoResp(alternativas, resp)));
                    correto = retornoResp(alternativas, resp);
                    tentativas--;
                    break;
                case "d":
                    System.out.println(certoErrado(retornoResp(alternativas, resp)));
                    correto = retornoResp(alternativas, resp);
                    tentativas--;
                    break;
                case "e":
                    System.out.println(certoErrado(retornoResp(alternativas, resp)));
                    correto = retornoResp(alternativas, resp);
                    tentativas--;
                    break;
            }
            
        } while (!correto && tentativas != 0);
        if (tentativas == 0) {
            System.out.println("Você excedeu o número de tentativas!");
        }
    }
    
    public static boolean retornoResp(String[] alternativas, String resp) {
        boolean retornoResp = false;
        if (resp.equals("a") && alternativas[0].equals("Flor de Lótus")) {
            retornoResp = true;
        } else if (resp.equals("b") && alternativas[1].equals("Flor de Lótus")) {
            retornoResp = true;
        } else if (resp.equals("c") && alternativas[2].equals("Flor de Lótus")) {
            retornoResp = true;
        } else if (resp.equals("d") && alternativas[3].equals("Flor de Lótus")) {
            retornoResp = true;
        } else if (resp.equals("e") && alternativas[4].equals("Flor de Lótus")) {
            retornoResp = true;
        }
        
        return retornoResp;
    }
    
    public static String certoErrado(boolean retornoResp) {
        String certoErrado = "Resposta Incorreta!";
        
        if (retornoResp) {
            certoErrado = "Resposta Correta!";
        }
        
        return certoErrado;
    }
    
    public static String[] trocarAlternativas(String[] alternativas) {
        List<String> strList = Arrays.asList(alternativas);
        Collections.shuffle(strList);
        strList.toArray(alternativas);
        
        return alternativas;
    }
}