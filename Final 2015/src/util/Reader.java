package util;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;
public class Reader {
	private static Scanner input = new Scanner(System.in);
	public static int readInt() {
		int number = 0;
		boolean correctNum;
		do {
			try {
				correctNum = true;
				number = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				correctNum = false;
				System.out.print("Error. Enter again: ");
			} catch (Exception e) {
				correctNum = false;
				System.out.print("Error: " + e.getMessage() + ". Please enter the number again: ");
			}
		} while (!correctNum);
		return number;
	}
	public static int readInt(int minValue, int maxValue) {
		if (minValue >= maxValue) {
			throw new RuntimeException("Error, incorrect use of method (minValue >= maxValue)");
		}
		int number = 0;
		boolean correctNum;
		do {
			try {
				correctNum = true;
				number = Integer.parseInt(input.nextLine());
			} catch (NumberFormatException e) {
				correctNum = false;
				System.out.print("Error. Enter again: ");
			} catch (Exception e) {
				correctNum = false;
				System.out.print("Error: " + e.getMessage() + ". Please enter the number again: ");
			}
			if (number > maxValue || number < minValue) {
				System.out.print("Error. number is out of bounds, please enter a number within " + minValue + " and " + maxValue + " Enter a new number: ");
			}
		} while (!correctNum || number > maxValue || number < minValue);
		return number;
	}
	public static float readFloat() {
		float number = 0;
		boolean correctNum;
		do {
			try {
				correctNum = true;
				number = Float.parseFloat(input.nextLine());
			} catch (NumberFormatException e) {
				correctNum = false;
				System.out.print("Error. Enter again: ");
			} catch (Exception e) {
				correctNum = false;
				System.out.print("Error: " + e.getMessage() + ". Please enter the number again: ");
			}
		} while (!correctNum);
		return number;
	}
	public static float readFloat(float minValue, float maxValue) {
		if (minValue >= maxValue) {
			throw new RuntimeException("Error, incorrect use of method (minValue >= maxValue)");
		}
		float number = 0;
		boolean correctNum;
		do {
			try {
				correctNum = true;
				number = Float.parseFloat(input.nextLine());
			} catch (NumberFormatException e) {
				correctNum = false;
				System.out.print("Error. Enter again: ");
			} catch (Exception e) {
				correctNum = false;
				System.out.print("Error: " + e.getMessage() + ". Please enter the number again: ");
			}
			if (number > maxValue || number < minValue) {
				System.out.print("Error. number is out of bounds, please enter a number within " + minValue + " and " + maxValue + " Enter a new number: ");
			}
		} while (!correctNum || number > maxValue || number < minValue);
		return number;
	}
	public static double readDouble() {
		double number = 0;
		boolean correctNum;
		do {
			try {
				correctNum = true;
				number = Double.parseDouble(input.nextLine());
			} catch (NumberFormatException e) {
				correctNum = false;
				System.out.print("Error. Enter again: ");
			} catch (Exception e) {
				correctNum = false;
				System.out.print("Error: " + e.getMessage() + ". Please enter the number again: ");
			}
		} while (!correctNum);
		return number;
	}
	public static double readDouble(double minValue, double maxValue) {
		if (minValue >= maxValue) {
			throw new RuntimeException("Error, incorrect use of method (minValue >= maxValue)");
		}
		double number = 0;
		boolean correctNum;
		do {
			try {
				correctNum = true;
				number = Double.parseDouble(input.nextLine());
			} catch (NumberFormatException e) {
				correctNum = false;
				System.out.print("Error. Enter again: ");
			} catch (Exception e) {
				correctNum = false;
				System.out.print("Error: " + e.getMessage() + ". Please enter the number again: ");
			}
			if (number > maxValue || number < minValue) {
				System.out.print("Error. number is out of bounds, please enter a number within " + minValue + " and " + maxValue + " Enter a new number: ");
			}
		} while (!correctNum || number > maxValue || number < minValue);
		return number;
	}
	public static String readString() {
		String aux = ("");
		boolean error = false;
		do {
			try {
				aux = input.nextLine();
			} catch (Exception e) {
				System.out.print("Unknown error, enter a new string: ");
				error = true;
			}
		} while (error);
		return aux;
	}
	public static String readString(int maxLength) {
		if (maxLength < 1) {
			throw new RuntimeException("Error, incorrect use of method (minValue >= maxValue)");
		}
		String aux = ("");
		boolean error = false;
		do {
			do {
				try {
					aux = input.nextLine();
				} catch (Exception e) {
					System.out.print("Unknown error, enter a new string: ");
					error = true;
				}
			} while (error);
			if (aux.length() > maxLength) {
				System.out.print("Error. the string is too long, write a shorter string: ");
			}
		} while (aux.length() > maxLength);
		return aux;
	}
	public static char readChar() {
		String charRead;
		char charToSend = 0;
		boolean error = true;
		do {
			charRead = input.nextLine();
			if (charRead.length() == 1) {
				charToSend = charRead.charAt(0);
				error = false;
			}
		} while (error);
		return charToSend;
	}
	public static char readChar(char[] possibleChars) {
		if (possibleChars == null || possibleChars.length < 1) {
			throw new RuntimeException("Error, incorrect use of method (minValue >= maxValue)");
		}
		String charRead;
		char charToSend = 0;
		boolean error = true;
		boolean wrongChar = false;
		do {
			do {
				charRead = input.nextLine();
				if (charRead.length() == 1) {
					charToSend = charRead.charAt(0);
					error = false;
				}
			} while (error);
			for (int i = 0; i < possibleChars.length; i++) {
				if (charToSend == possibleChars[i]) {
					wrongChar = false;
					System.out.print("The char you entered is not a valid one, please enter a valid char: ");
					break;
				}
			}
		} while (wrongChar);
		return charToSend;
	}
	public static boolean readBoolean() {
		boolean bool = false, notABool = false;
		String aux;
		do {
			try {
				aux = input.nextLine();
				if (aux.equalsIgnoreCase("1") || aux.equalsIgnoreCase("true") || aux.equalsIgnoreCase("t") || aux.equalsIgnoreCase("yes")) {
					bool = true;
				} else if (aux.equalsIgnoreCase("0") || aux.equalsIgnoreCase("false") || aux.equalsIgnoreCase("f") || aux.equalsIgnoreCase("no")) {
					bool = false;
				} else {
					System.out.print("You haven't entered a valid boolean value, please enter a valid value: ");
					notABool = true;
				}
			} catch (Exception e) {
				System.out.print("You haven't entered a valid boolean value, please enter a valid value: ");
				notABool = true;
			}
		} while (notABool);
		return bool;
	}
	public static LocalDate readDate(String format) {
		if (format == null || format.isEmpty()) {
			throw new RuntimeException("Error, incorrect use of method (minValue >= maxValue)");
		}
		String aux = input.nextLine();
		LocalDate date = LocalDate.now();
		boolean error = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		do {
			try {
				date = LocalDate.parse(aux, formatter);
			} catch (DateTimeParseException e) {
				System.out.print("Error: " + e + " Please enter a valid date: ");
				error = true;
			}
		} while (error);
		return date;
	}
	public static LocalDateTime readDateTime(String format) {
		if (format == null || format.isEmpty()) {
			throw new RuntimeException("Error, incorrect use of method (minValue >= maxValue)");
		}
		LocalDateTime date = LocalDateTime.now();
		String aux = input.nextLine();
		boolean error = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		do {
			try {
				date = LocalDateTime.parse(aux, formatter);
			} catch (DateTimeParseException e) {
				System.out.print("Error: " + e + " Please enter a valid date: ");
				error = true;
			}
		} while (error);
		return date;
	}
	public static LocalTime readTime(String format) {
		if (format == null || format.isEmpty()) {
			throw new RuntimeException("Error, incorrect use of method (minValue >= maxValue)");
		}
		LocalTime date = LocalTime.now();
		String aux = input.nextLine();
		boolean error = false;
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
		do {
			try {
				date = LocalTime.parse(aux, formatter);
			} catch (DateTimeParseException e) {
				System.out.print("Error: " + e + " Please enter a valid date: ");
				error = true;
			}
		} while (error);
		return date;
	}
}
