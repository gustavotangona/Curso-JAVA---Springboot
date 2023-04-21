package com.milprogramadores;
import  java.util.Scanner;
public class ejercicio3 {

	public static void main(String[] args) {
		/**
		 * Declarar tres variables de tipo entero, asignar un valor cualquiera y mostrar el mayor y el
menor.
		 */
		int var1,var2,var3;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese la primer variable entera: ");
		var1 = scanner.nextInt();
		
		System.out.print("Ingrese la segunda variable entera: ");
		var2 = scanner.nextInt();
		
		System.out.print("Ingrese la tercer variable entera: ");
		var3 = scanner.nextInt();
		
		if ( var1 > var2 && var1 > var3 ) {
			System.out.println("La variable 1 es la mayor ");
		}else if( var2 > var1 && var2 > var3) {
			System.out.println("La variable 2 es la mayor ");
		}else if( var3 > var1 && var3 > var2) {
			System.out.println("La variable 3 es la mayor ");
		}
		scanner.close();
	
	
	
	if ( var1 < var2 && var1 < var3 ) {
		System.out.println("La variable 1 es la menor ");
	}else if( var2 < var1 && var2 < var3) {
		System.out.println("La variable 2 es la menor ");
	}else if( var3 < var1 && var3 < var2) {
		System.out.println("La variable 3 es la menor ");
	}


}

}
