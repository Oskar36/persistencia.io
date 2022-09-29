package com.txurdi.inicio;

import java.util.Scanner;

/**
 * Ejercicio basico para pedir un int por pantalla, sin capturar la Excepcion que pueda lanzar
 * @author oskar llaguno
 *
 */

public class Dametuedad {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Dime tu edad:");
		
		String stedad = sc.nextLine();
		
		int edad= Integer.parseInt(stedad);
		
		System.out.printf("Tu edad es %s \n",edad);
		
		sc.close();
	}
}
