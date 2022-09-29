package com.txurdi.inicio;

public class ForBreakpoint {

	public static void main(String[] args) throws Exception {
		
		for (int i = 0; i < 300; i++) {
			System.out.println(i);
			if (i==107) {
				throw new Exception("F");
			}
		}

	}

}
