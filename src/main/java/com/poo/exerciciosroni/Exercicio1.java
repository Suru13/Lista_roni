package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exercicio1 {

    public static void resolucao1(){
        int numero1;
		int numero2;
		System.out.print("Digite o numero1: \n");
		Scanner scanner1 = new Scanner(System.in);
		numero1 = scanner1.nextInt();
		System.out.print("O primeiro número é: "+numero1+"\n");

		System.out.print("Digite o numero2: \n");
		numero2 = scanner1.nextInt();
		System.out.print("O primeiro número é: "+numero2+"\n");

		System.out.print("A soma é : "+(numero1 + numero2)+"\n");
		

    }

}
