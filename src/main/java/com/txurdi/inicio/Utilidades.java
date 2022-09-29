package com.txurdi.inicio;

import java.util.Scanner;

public class Utilidades {
	/**
	 * @author oskar
	 * @return edad en formato int
	 * @throws Exception si no es un numero entero
	 */
	public static int pedirEdad(Scanner sc) throws Exception {
		int edad = -1;

		try {
			System.out.println("Dime tu edad");
			String stedad = sc.nextLine();
			edad = Integer.parseInt(stedad);
		} catch (Exception e) {
			throw new Exception("Lanzamos exception error: " + e.getMessage());
		}
		return edad;
	}
}
