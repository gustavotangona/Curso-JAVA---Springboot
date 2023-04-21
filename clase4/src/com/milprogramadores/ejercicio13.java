package com.milprogramadores;

import java.util.Scanner;

public class ejercicio13 {

	public static void main(String[] args) {
		
		/**
		 * Dado un natural K. Generar y mostrar todos los numeros enteros pares comprendidos en
         *  el intervalos [-K,K]. Considerar K mayor que 1.
		 */

		int k;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese un numero mayor que 1: ");
		k = scanner.nextInt();
		
		for (int inicio = -k; inicio < k; inicio++) {
			if (inicio % 2 == 0) {
				System.out.println(inicio);
			}
			
		}
		
	scanner.close();
		
	}

}
