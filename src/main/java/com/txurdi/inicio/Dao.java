package com.txurdi.inicio;

import java.util.Scanner;

public class Dao {
	public static int ejecutar(Scanner sc) throws Exception {
		System.out.println("Ejecutando dao");

		return Utilidades.pedirEdad(sc);
	}
}
