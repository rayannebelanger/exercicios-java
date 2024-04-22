package br.unicap.progImp.exercicio01;

import java.util.Locale;
import java.util.Scanner;

public class Question04 {

    public static void main(String[] args) {
        //useLocale garante que o scanner leia numeros
        //naturais com ponto, formato US (7.5) e nao
        //com virgula, formato BR (7,5)
        Scanner s = new Scanner(System.in).useLocale(Locale.US);
        int n = s.nextInt();
        String nome[] = new String[n];
        double nota[] = new double[n];
        double soma = 0;
        double media;

        for(int i = 0; i < n; i++) {
          nome[i] = s.next();
        }

        for(int j = 0; j < n; j++) {
            nota[j] += s.nextDouble();
            soma += nota[j];
        }

        media = soma/n;

        for(int y = 0; y < n; y++) {
            if(nota[y] >= media) {
                System.out.println(nome[y]);
            }
        }

    }
}
