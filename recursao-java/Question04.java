package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question04 {

    public static int mult(int n1, int n2){
        if(n2 == 0) 
            return 1;
            return n1 * mult(n1, n2 - 1);
    }
    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        int n1 = dado.nextInt();
        int n2 = dado.nextInt();

        System.out.println(mult(n1, n2));
    }
}
