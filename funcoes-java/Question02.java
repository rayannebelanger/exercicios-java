package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question02 {

	public static int tabuada(int n, int i){
		return n * i;
	}
	public static void main(final String[] args) {
		Scanner dado = new Scanner(System.in);
		int n = dado.nextInt();
		

		for(int i = 1; i <= 10; i++){
			System.out.println(n + " x " + i + " = " + tabuada(n, i));
		}
	}

}