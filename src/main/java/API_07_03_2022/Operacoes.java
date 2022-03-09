package API_07_03_2022;
/**
   por Rafael Ferreira Goulart
**/
public class Operacoes {
    public String Soma(double X, double Y) {
        double resp = X + Y;
        String respSoma = String.valueOf(resp);
        
        return respSoma;
    } 
    
    public String Subtracao(double X, double Y) {
        double resp = X - Y;
        String respSubtracao = String.valueOf(resp);
        
        return respSubtracao;
    }
    
    public String Multiplicacao(double X, double Y) {
        double resp = X * Y;
        String respMultiplicacao = String.valueOf(resp);
        
        return respMultiplicacao;
    }
    
    public String Divisao(double X, double Y) {
        double resp = X / Y;
        String respDivisao = String.valueOf(resp);
        
        return respDivisao;
    }
}