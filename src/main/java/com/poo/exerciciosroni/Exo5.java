package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exo5 {
       
    public static void resolucao5(){
        
        String nome_funcionario;
        int horas_trabalhadas,horas_extra;

		System.out.print("Digite o nome do funcionario: ");
		Scanner scan = new Scanner(System.in);
		nome_funcionario = scan.nextLine();
        System.out.print("Digite suas horas trabalhadas no ano: ");
        horas_trabalhadas = scan.nextInt();
        System.out.print("Digite suas horas extra no ano: ");
        horas_extra = scan.nextInt();
        
		System.out.println("O salário anual do funcionario " +nome_funcionario+ " é de: R$ " +((horas_trabalhadas*10)+ (horas_extra*15)));	
    }

}
