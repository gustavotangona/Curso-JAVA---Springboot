package com.milprogramadores;

import java.util.Scanner;

public class ejercicio11 {

	public static void main(String[] args) {
		/**
		 * Dado 3 numeros naturales que representan los lados de un triángulo, se pide determinar
si el triángulo es Isosceles, Escaleno o Equilatero.
Tipos de triángulo según la longitud de sus lados Según la longitud de sus lados, los
triángulos pueden clasificarse en:
1. Equilátero: Todos sus lados son iguales.
2. Isósceles: Dos de sus tres lados son de igual longitud.
3. Escaleno: Todos sus lados son de diferente longitud.
		 */

		int lado1, lado2, lado3;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese lado 1: ");
		lado1 = scanner.nextInt();
		System.out.print("Ingrese lado 2: ");
		lado2 = scanner.nextInt();
		System.out.print("Ingrese lado 3: ");
		lado3 = scanner.nextInt();
		if(lado1 == lado2 && lado1 == lado3) {
			System.out.print("El triangulo es equilatero ");
		}else if( lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
			System.out.print("Es Isosceles ");
		}else {
			System.out.print("Es Escaleno ");
		}
		scanner.close();
	
	}

}
