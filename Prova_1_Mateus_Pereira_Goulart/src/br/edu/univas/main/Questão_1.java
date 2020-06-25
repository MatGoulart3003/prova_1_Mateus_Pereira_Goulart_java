package br.edu.univas.main;

import java.util.Scanner;

public class Questão_1 {
	
	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		int contador = 0;	
		
		do {
			
			int numero = read.nextInt();
			
				if (numero < 0) {
					
					contador++;
					
				}
				
				if (numero == 0) {
					
					break;
					
				}
			
		} while (true);
		
		System.out.println("a quantidade de numeros negativos é de: "+ contador);		
		
		read.close();
	}

}
