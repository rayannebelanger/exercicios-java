package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question03 {

    public static double areaparede(double hp, double lp){
        return hp * lp;
    }

    public static double areaazulejo(double ha, double la){
        return ha * la;
    }

    public static void main(String[] args) {  
        Scanner dado = new Scanner(System.in);
        double hp = dado.nextDouble();
        double lp = dado.nextDouble();
        double ha = dado.nextDouble();
        double la = dado.nextDouble();

        System.out.println(areaparede(hp, lp) / areaazulejo(ha, la));
    }

}