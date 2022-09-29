package com.txurdi.inicio;

import java.util.Scanner;

/**
 * Es un ejemplo par apracticar con el debugger y las excepciones Este metodo
 * main llamará a la clase service que a su vez llama a la clase dao En
 * cualquier momento se puede producir una excepcion y deberemos saber como se
 * propagan
 * 
 * @author oskar llaguno
 *
 */

public class Ejercicio3 {
	public static void main(String[] args) {

		System.out.println("Comenzamos");
		try (Scanner sc = new Scanner(System.in)){
			int resultado = Service.ejecutar(sc);
			System.out.printf("El resultado es %s \n", resultado);
		} catch (Exception e) {
			System.out.printf("Excepcion %s \n", e.getMessage());
			e.printStackTrace();
		}
		System.out.println("Terminamos");
	}
}
