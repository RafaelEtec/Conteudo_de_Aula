package API_25_03_2022;
import java.util.Scanner;
/** 
   por Rafael Ferreira Goulart
**/
public class PI_ADO6 {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        String resp;
        boolean correto = false;
        int tentativas = 3;
        String pergunta =
                  "Segundo o Sistema de Numeração Egípcio.\n"
                + "O número 1000 corresponde a: \n"
                + "(A) Bastão\n"
                + "(B) Rolo de Corda\n"
                + "(C) Peixe\n"
                + "(D) Flor de Lótus\n"
                + "(E) Homem\n";
        
        do {
            System.out.println(pergunta);
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
        } while (!correto && tentativas != 0);
        if (tentativas == 0) {
            System.out.println("Você excedeu o número de tentativas!");
        }
    }
}