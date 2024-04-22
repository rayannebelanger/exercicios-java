package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question03 {

    public static void main(String[] args) {  
        Scanner s = new Scanner(System.in);
        int valor[] = new int[2];
        int numero[] = new int[10];
        boolean intervalo = false;

        for(int i = 0; i < 2; i++) {
            valor[i] = s.nextInt();
        }

        for(int j = 0; j < 10; j++) {
            numero[j] = s.nextInt();
            if((numero[j] >= valor[0]) && (numero[j] <= valor[1])) {
                System.out.println(numero[j]);
                intervalo = true;
            }
        }

        if(intervalo != true) {
            System.out.println("nulo");
        }

    
		
    }

}
