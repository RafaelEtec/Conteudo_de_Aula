package com.mycompany.helloworld;
import java.util.Scanner;
public class MultiploDeTres {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        System.out.println("Insira sua Idade: ");
        int idade = ent.nextInt();
        
        if (idade >= 18 || (idade % 3 == 0)) {
            System.out.println("Idade maior que 18 OU idade múltiplo de 3");
        } else {
            System.out.println("Idade menor que 18 E não é múltiplo de 3");
        }
    }
}