package com.txurdi.inicio;

import java.util.Scanner;

/**
 * Ejercicio basico para pedir un int por pantalla, capturarando la Excepcion
 * que pueda lanzar y solicitamos de nuevo La edad debe estar comprendida entre
 * 0 y 120 años
 * 
 * @author oskar llaguno
 *
 */

public class Dametuedad2 {
	public static void main(String[] args) {
		boolean numero = false;
		int edad = 0;
		Scanner sc = new Scanner(System.in);
		do{
			try {
				System.out.println("Dime tu edad:");
				String stedad = sc.nextLine();
				edad = Integer.parseInt(stedad);
				if (edad < 120 && edad > 0) {
					numero = true;
					System.out.printf("Tu edad es %s \n", edad);
				}else {
					System.out.println("Tu eres estupido, nadie vive mas de 120 años o menos de 0, subnormal");
				}				
			} catch (NumberFormatException e) {
				System.out.println("Eres gilipollas, escribe un puto número entre 0 y 120");
			}
		}while (!numero);
		
	}
}
