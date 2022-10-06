package com.txurdi.binarios;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Binarios1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		FileOutputStream fos = null;
		DataOutputStream salida = null;
		int n;
		try {

			//uwu
			File carpeta =new File("ficheros");
			if(!carpeta.exists()) {
				carpeta.mkdir();
			}
			File carpeta2 =new File("/ficheros/datos.dat");
			if(!carpeta2.exists()){
				carpeta2.createNewFile();
			}
			fos = new FileOutputStream("/ficheros/datos.dat");
			salida = new DataOutputStream(fos);
			System.out.print("Introduce número entero. -1 para acabar: ");
			n = sc.nextInt();
			while (n != -1) {
				salida.writeInt(n); // se escribe el número entero en el fichero
				System.out.print("Introduce número entero. -1 para acabar: ");
				n = sc.nextInt();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (salida != null) {
					salida.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}//main
}
