package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];

		for(int i = 0; i < 10; i++) {
			a[i] = s.nextInt();
		}

		for(int j = 0; j < 10; j++) {
			b[j] = s.nextInt();
		}

		for(int k = 0; k < 10; k++) {
			System.out.println(c[k] = a[k] * b[k]);
		}
		
	}

}