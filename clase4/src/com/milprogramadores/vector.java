package com.milprogramadores;

public class vector {

	public static void main(String[] args) {
		
		int arreglo[] = new int[3];
		arreglo[0]= 15;
		arreglo[1]= 20;
		
	for (int indice = 0; indice< arreglo.length; indice++) {
		System.out.println("en la posicion " + indice + " esta el numero: "+arreglo[indice]);
	}
	
	String[] arregloDeString = {"nombre1","nombre2","nombre3"};
	for (int indice = 0; indice< arregloDeString.length; indice++) {
		System.out.println("en la posicion " + indice + " esta el nombre: "+arregloDeString[indice]);

}
}
}