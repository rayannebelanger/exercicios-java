package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a[] = new int[5];
		int b[] = new int[5];

		for(int i = 0; i < 5; i++) {
			a[i] = s.nextInt();
			b[i] = a[i] * 2;
		}

		for(int j = 0; j < 5; j++) {
			System.out.println("A[" + j + "]: " + a[j] + ", B[" + j + "]: " + b[j]);
		}
		
	}
}