package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exo6 {
     public static void resolucao6(){
        
        double graus,fahrenheit;

		Scanner scan = new Scanner(System.in);
        System.out.print("Digite a temperatura em Celcius: ");
        graus = scan.nextDouble();
        fahrenheit = (graus * 1.8) + 32;
        String fahrenheitformat = String.format("%.2f", fahrenheit);
        
		System.out.println(" " +graus+ " graus Celcius equivalem a " +fahrenheitformat+ " graus Fahrenheit.");	
    }

}
