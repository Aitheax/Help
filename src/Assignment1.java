/**
 * 
 * @author Greg Smith
 *Algorithm:
 *1.
 */
import java.util.*;

public class Assignment1 {
Scanner keyboard = new Scanner(System.in);

	public static void fourDigit() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a four digit integer:");
		int number = keyboard.nextInt();
		System.out.println(number / 1000);
		number = number % 1000;
		System.out.println(number / 100);
		number = number % 100;
		System.out.println(number / 10);
		System.out.println(number % 10);
String text = keyboard.nextLine();
System.out.println(text);
	}

	public static void fourChar() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter a four digit integer:");
		String number = keyboard.next();
		System.out.println(number.charAt(0));
		System.out.println(number.charAt(1));
		System.out.println(number.charAt(2));
		System.out.println(number.charAt(3));
	}

	public static void loveToHate() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a line of text:");
		String text = keyboard.nextLine();
		text = text.replaceFirst("hate", "love");
		System.out.println(text);
	}

	public static void main(String[] args) {
		fourDigit();
		fourChar();
		loveToHate();
	}

}
