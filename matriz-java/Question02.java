package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int mult;
		int[][] mat = new int[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
			mult = i * j;
			mat[i][j] = mult;
			}
		}

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
			System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		

	}

}