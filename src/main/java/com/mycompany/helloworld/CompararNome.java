package com.mycompany.helloworld;
import java.util.Scanner;

public class CompararNome {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Insira seu Nome: ");
        String nome = ent.next();
        
        if (nome.equals("Rafael") || nome.equals("rafael")) {
            System.out.println("Bem-Vindo: "+nome);
        } else {
            System.out.println("Acesso Negado para: "+nome);
        }
    }
}