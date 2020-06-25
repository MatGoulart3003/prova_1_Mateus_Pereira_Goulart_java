package br.edu.univas.main;

import java.util.Scanner;

public class Questão_2 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int pessoasCorona = 0; 
		int pessoasRegiao = 0;
		int sim1 = 0;
		int nao2 = 0;
		int sul = 0,sudeste = 0, centroeste = 0,norte = 0, nordeste = 0;
		
		for (int i = 0; i < 100; i++) {
			
			System.out.println("Você acredita que a vacina contra o COVID-19 fique pronta ainda em 2020?");
			
			pessoasCorona = read.nextInt();
			
			System.out.println("Qual região do Brasil você mora?");
			
			pessoasRegiao = read.nextInt();
			
			if (pessoasCorona == 1) {
				
				sim1++;
				
			}else if (pessoasCorona == 2) {
				
				nao2++;
				
			}
			
			if (pessoasRegiao == 1) {
				
				sul++;
				
			}else if (pessoasRegiao == 2) {
				
				sudeste++;
				
			}else if (pessoasRegiao == 3) {
				
				centroeste++;
				
			}else if (pessoasRegiao == 4) {
				
				norte++;
				
			}else if (pessoasRegiao == 5) {
				
				nordeste++;
				
			}
				
			
		}
		
		System.out.println("Pessoas que votaram sim = "+ sim1);
		System.out.println("Pessoas que votaram não = "+ nao2);
		System.out.println("Pessoas do Sul do Brasil = "+ sul);
		System.out.println("Pessoas do Sudeste do Brasil = "+ sudeste);
		System.out.println("Pessoas do Centroeste do Brasil = "+ centroeste);
		System.out.println("Pessoas do Norte do Brasil = "+ norte);
		System.out.println("Pessoas do Nordeste do Brasil = "+ nordeste);
		
		
		read.close();
		
	}

}
