package chapter01;

import java.util.Scanner;

public class AmultiplyB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println(a*b);
		input.close();
	}
}
