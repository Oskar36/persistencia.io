package com.txurdi.inicio;

import java.util.Scanner;

public class DimeTuNombre {

	public static void main(String[] args) {
			
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Dime tu nombre:");
		
		String nombre = sc.nextLine();
		
		System.out.println("Dime tu apellido:");
		
		String apellido = sc.nextLine();
		
		//System.out.println("Uwu " + nombre);
		System.out.printf("Uwu %s %s hasta luego" , nombre,apellido);
		
		sc.close();
	}

}
