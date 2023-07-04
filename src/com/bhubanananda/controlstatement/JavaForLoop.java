package com.bhubanananda.controlstatement;

/**
 * The Class JavaForLoop.
 *
 * @author Bhubanananda
 */
public class JavaForLoop {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		JavaForLoop javaForLoop = new JavaForLoop();
		javaForLoop.simpleForLoop();
		javaForLoop.nestedForLoop();
		javaForLoop.forEachLoop();
	}

	/**
	 * Simple for loop.
	 */
	private void simpleForLoop() {
		System.out.println("----simple simpleForLoop----");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		System.out.println("----exit simpleForLoop----");
		System.out.println();
	}

	/**
	 * Nested for loop.
	 */
	private void nestedForLoop() {
		System.out.println();
		System.out.println("----simple nestedForLoop----");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.println(i + " " + j);
			}
		}
		System.out.println("----exit nestedForLoop----");
		System.out.println();
	}

	/**
	 * For each loop.
	 */
	private void forEachLoop() {
		System.out.println();
		System.out.println("----simple forEachLoop----");
		int arr[] = { 12, 23, 44, 56, 78 };

		for (int i : arr) {
			System.out.println(i);
		}
		System.out.println("----exit forEachLoop----");
		System.out.println();
	}
}