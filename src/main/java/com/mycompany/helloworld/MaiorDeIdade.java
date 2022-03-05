package com.mycompany.helloworld;
import java.util.Scanner;

public class MaiorDeIdade {
    public static void main(String[] args) {
        System.out.println("Insira sua Idade: ");
        Scanner ent = new Scanner(System.in);
        
        int idade = ent.nextInt();
        if (idade >= 18 ) {
            System.out.println("Você é maior de Idade!");
        } else {
            System.out.println("Você é menor de Idade!");
        }
    }
}