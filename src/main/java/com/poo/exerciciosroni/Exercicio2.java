package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio2 {

    public static void resolucao2(){
        int numero1;
		System.out.print("Digite o numero1: \n");
		Scanner scanner1 = new Scanner(System.in);
		numero1 = scanner1.nextInt();
		System.out.print("O antecessor é -> "+(numero1-1)+"\n");

		System.out.print("O  número é -> "+numero1+"\n");

		System.out.print("A sucessor é -> "+(numero1 + 1)+"\n");
		
    }


}
