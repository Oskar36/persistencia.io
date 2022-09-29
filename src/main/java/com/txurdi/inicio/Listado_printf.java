package com.txurdi.inicio;

import java.util.ArrayList;

public class Listado_printf {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");
		cars.add("Mazda");
		cars.add("Ferrari");

		ArrayList<String> models = new ArrayList<String>();
		models.add("XC90");
		models.add("M4");
		models.add("Mustang");
		models.add("MX80");
		models.add("Enzo");

		for (String buga : cars) {
			System.out.printf("%-20s%s%n", buga, models.get(cars.indexOf(buga)));
		}
	}

}
