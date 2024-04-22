package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question03 {

    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[][] mat = new int[10][10];

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				mat[i][j] = s.nextInt();
			}
		}

		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}

		int maior = 0;
		//int maior1 = 0;
		for(int i = 0; i < 10; i++) {
			for(int j = 0; j < 10; j++) {
				if(i == 5) {
					if(mat[i][j] > maior) {
						maior = mat[i][j];
					}
				}
			}
		
	}
	int maiorj = 0;
	for(int i = 0; i < 10; i++) {
		for(int j = 0; j < 10; j++) {
			if(j == 7) {
				if(mat[i][j] > maiorj) {
					maiorj = mat[i][j];
				}
			}
		}
	
}
	System.out.println(maior);
	System.out.println(maiorj);


}
}
