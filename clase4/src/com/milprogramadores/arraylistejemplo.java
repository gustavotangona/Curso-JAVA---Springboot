package com.milprogramadores;

import java.util.ArrayList;

public class arraylistejemplo {

	public static void main(String[] args) {
     
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(1);
        lista.add(25);
        lista.add(10);
        
        System.out.println(lista);
        
        ArrayList<String> listaString = new ArrayList<String>();
        listaString.add("nombre");
        listaString.add("edad");
        System.out.println(listaString);
	}

}
