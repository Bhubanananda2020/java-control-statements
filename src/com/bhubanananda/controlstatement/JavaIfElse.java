package com.bhubanananda.controlstatement;

/**
 * The Class JavaIfElse.
 *
 * @author Bhubanananda
 */
public class JavaIfElse {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {

		JavaIfElse javaIfElse = new JavaIfElse();
		javaIfElse.ifStatement();
		javaIfElse.ifElseStatement();
		javaIfElse.ifElseIfStatement();
		javaIfElse.nestedIfStatement();

	}

	/**
	 * If statement.
	 */
	private void ifStatement() {
		System.out.println("======Entry ifStatement======");
		int age = 20;
		if (age >= 18) {
			System.out.println("you are eligiable for voting");
		}
		System.out.println("======Exit ifStatement======");
		System.out.println();
	}

	/**
	 * If else statement.
	 */
	private void ifElseStatement() {
		System.out.println();
		System.out.println("======Entry ifElseStatement======");
		int age = 10;
		if (age >= 18) {
			System.out.println("you are eligiable for voting");
		} else {
			System.out.println("you are not eligiable for voting");
		}
		System.out.println("======Exit ifElseStatement======");
		System.out.println();
	}

	/**
	 * If else if statement.
	 */
	private void ifElseIfStatement() {
		System.out.println();
		System.out.println("======Entry ifElseIfStatement======");

		String day = "Sunday";
		if (day == "Monday") {
			System.out.println("Today is " + day);
		} else if (day == "Tuesday") {
			System.out.println("Today is " + day);
		} else if (day == "Wednesday") {
			System.out.println("Today is " + day);
		} else if (day == "Thursday") {
			System.out.println("Today is " + day);
		} else if (day == "Friday") {
			System.out.println("Today is " + day);
		} else if (day == "Saturday") {
			System.out.println("Today is " + day);
		} else if (day == "Sunday") {
			System.out.println("Today is " + day);
		} else {
			System.out.println("Invalid day entry");
		}
		System.out.println("======Exit ifElseIfStatement======");
		System.out.println();
	}

	/**
	 * Nested if statement.
	 */
	private void nestedIfStatement() {
		System.out.println();
		System.out.println("======Entry nestedIfStatement======");
		int age = 20;
		int weight = 61;
		if (age >= 18) {
			System.out.println("you are eligiable for voting");
			if (weight > 60) {
				System.out.println("you are eligiable for Defence");
			} else {
				System.out.println("your weight is not eligiable for Defence");
			}

		} else {
			System.out.println("you are not eligiable for voting");
		}
		System.out.println("======Exit nestedIfStatement======");
		System.out.println();
	}
}
