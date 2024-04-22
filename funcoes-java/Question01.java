package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question01 {

	public static double afim(double a, double b){
		return -b/a;
	}

	public static void main(final String[] args) {
		Scanner dado = new  Scanner(System.in);
		int a =  dado.nextInt();
		int b = dado.nextInt();


		System.out.println(afim(a, b));


	}
}