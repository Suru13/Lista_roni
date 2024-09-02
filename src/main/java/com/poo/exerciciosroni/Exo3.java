package com.poo.exerciciosroni;

import java.util.Scanner;

public class Exo3 {
     public static void resolucao3(){
        
        String nome_aluno,disciplina;
        //double nota1,nota2,nota3,nota4;
        double[]notas  = new double[4];

		System.out.print("Digite o nome do aluno: ");
		Scanner scan = new Scanner(System.in);
		nome_aluno = scan.nextLine();
        System.out.print("Digite a disciplina do aluno: ");
        disciplina = scan.nextLine();
        System.out.print("Digite a nota1 do aluno: ");
        notas[0] = scan.nextDouble();
        System.out.print("Digite a nota2 do aluno: ");
        notas[1] = scan.nextDouble();
        System.out.print("Digite a nota3 do aluno: ");
        notas[2] = scan.nextDouble();
        System.out.print("Digite a nota4 do aluno: ");
        notas[3] = scan.nextDouble();

        double total = notas[0]+ notas[1]+ notas[2]+ notas[3];
		System.out.println("A média do aluno: " +nome_aluno+ " " +disciplina+ " é -> " +(total /notas.length)+"\n");

		
		
    }

}
