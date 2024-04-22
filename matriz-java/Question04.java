package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[][] mat = new double[n][n];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i < j) {
                    mat[i][j] = 2*i + 7*j - 2;
                } else if(i == j) {
                    mat[i][j] = 3*Math.pow(i, 2) - 1;
                } else if(i > j) {
                    mat[i][j] = 4*Math.pow(i, 3) -  5*Math.pow(j, 2) + 1;
                }
			}
		}

        for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
                if(j == n - 1) {
                    System.out.print(mat[i][j]);
                } else {
                    System.out.print(mat[i][j] + ", "); 
                }
            }
            System.out.println();
        }
        
    }
}
