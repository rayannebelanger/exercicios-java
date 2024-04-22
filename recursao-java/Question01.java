package br.unicap.progImp.exercicio01;

import java.util.Scanner;

public class Question01 {

	public static double delta(int a, int b, int c) {
		double delta = b * b - 4 * a * c;
		return delta;
	}
	
	public static String eq2grau(int a, int b, int c) {
		 double d = delta(a, b, c);

		 if (a == 0) {
			return "Coeficient a cannot be zero!";
		} else if (d < 0) {
			return "There are no roots!";
		}

		 double x1 = (-b + Math.sqrt(Math.max(d, 0))) / (2 * a);
		 double x2 = (-b - Math.sqrt(Math.max(d, 0))) / (2 * a);
		 
    	if (x1 == x2) {
        return "The root is " + x1 + ".";
    	} else {
        return "The roots are " + x2 + " and " + x1 + ".";
    	}
}
	public static void main(String[] args) {
		Scanner dado = new Scanner(System.in);
		int a = dado.nextInt();
		int b = dado.nextInt();
		int c = dado.nextInt();
		
		System.out.println(eq2grau(a, b, c));
	}
}