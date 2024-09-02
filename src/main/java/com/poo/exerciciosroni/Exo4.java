package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exo4 {
     public static void resolucao4(){

        int ano_nasc, ano_futuro = 2035;
        String nome;

       
        Scanner scan = new Scanner(System.in);

		System.out.print("Digite seu nome : ");
        nome = scan.nextLine();
		System.out.print("Digite o ano de nascimento: ");
		ano_nasc = scan.nextInt();
		System.out.print("Em 2035, " +nome+ " terá -> "+ (ano_futuro - ano_nasc)+ " anos");
    }


}
