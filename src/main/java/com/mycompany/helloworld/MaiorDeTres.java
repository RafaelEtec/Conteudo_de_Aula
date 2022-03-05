package com.mycompany.helloworld;
import java.util.Scanner;

public class MaiorDeTres {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        
        int A,B,C;
        String maior = " É o maior número!";
        System.out.println("Insira um valor para A: ");
        A = ent.nextInt();        
        System.out.println("Insira um valor para B: ");
        B = ent.nextInt();
        System.out.println("Insira um valor para C: ");
        C = ent.nextInt();
        
        if (A > B && A > C) {
            System.out.println(A+maior);
        } else if ( (B > A) && (B > C)) {
            System.out.println(B+maior);
        } else {
            System.out.println(C+maior);
        }
    }
}