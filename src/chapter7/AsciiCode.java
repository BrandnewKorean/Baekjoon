package chapter7;

import java.util.Scanner;

public class AsciiCode {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		
		System.out.println((int)s.charAt(0));
		
		input.close();
	}
}