package com.milprogramadores;

import java.util.Scanner;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * Declare un variable de tipo entero y asigne un valor cualquiera, determine si el numero es
par o impar y muestre un mensaje con esa informacion. mensaje: "El numero... es (par o
impar)"
		 */
		int numero;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ingrese un numero: ");
		numero = scanner.nextInt();
		
		if (numero % 2 == 0) {
			System.out.print("El numero es par");
		}else {
			System.out.print("El numero es impar");
		}
		scanner.close();
	}

}
