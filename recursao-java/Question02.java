package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question02 {

	public static int decide(Scanner scanner) {
        int negativos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um valor:");
            int valor = scanner.nextInt();

            if (valor < 0) {
                negativos++;
            }
        }

        return negativos;
    }


	public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);

        int negativos = decide(dado);

        System.out.println("Foram digitados " + negativos + " numeros negativos");
    
	}

}