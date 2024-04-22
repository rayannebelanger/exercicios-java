package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question03 {

    public static int soma(int n){
        if(n == 1) {
            return 1;
        }
        return n + soma(n-1);
    }

    public static void main(String[] args) {  
        Scanner dado = new Scanner(System.in);
        int n = dado.nextInt();

        System.out.println(soma(n));
    }
}
