package br.edu.univas.main;

import java.util.Scanner;

public class Questão_3 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		System.out.println("Digite um numero:");
		
		int numero = read.nextInt();
		
		if (numero % 5 == 3) {
			
			numero = numero + 2;
			
		}else if (numero % 5 == 4) {
			
			numero = numero + 1;
			
		}
		
		System.out.println(numero);
		
		read.close();
		
	}

}
