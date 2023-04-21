package com.milprogramadores;

import java.util.Scanner;

public class ejercicio18 {

	public static void main(String[] args) {
	
		int k;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero mayor que 1: ");
		k = scanner.nextInt();
		
		int original = k;
		int aux = k % 10;
		k = k /10;
		while( k > 0) {
			aux = aux * 10 + (k % 10);
			k /= 10;
		}
		if ( aux == original) {
			System.out.println("Es capicua");
		}else {
			System.out.println("no Es capicua");
		}
		scanner.close();
		
	}

}
