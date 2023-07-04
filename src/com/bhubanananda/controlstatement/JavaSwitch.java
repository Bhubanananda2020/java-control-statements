package com.bhubanananda.controlstatement;

/**
 * The Class JavaSwitch.
 *
 * @author Bhubanananda
 */
public class JavaSwitch {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		new JavaSwitch().switchStatement();
	}

	/**
	 * Switch statement.
	 */
	private void switchStatement() {
		String day = "Sunday";
		switch (day) {
		case "Monday": {
			System.out.println("Today is " + day);
			break;
		}
		case "Tuesday": {
			System.out.println("Today is " + day);
			break;
		}
		case "Wednesday": {
			System.out.println("Today is " + day);
			break;
		}
		case "Thursday": {
			System.out.println("Today is " + day);
			break;
		}
		case "Friday": {
			System.out.println("Today is " + day);
			break;
		}
		case "Saturday": {
			System.out.println("Today is " + day);
			break;
		}
		case "Sunday": {
			System.out.println("Today is " + day);
			break;
		}

		default:
			System.out.println("Invalid day entry");
			break;
		}

	}
}
