package com.bhubanananda.controlstatement;

/**
 * The Class JavaBreak.
 *
 * @author Bhubanananda
 */
public class JavaBreak {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i == 5) {
				break;
			}
			System.out.println("hello world");
		}
	}
}