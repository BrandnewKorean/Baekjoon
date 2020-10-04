package chapter1;

import java.util.Scanner;

public class AdivisionB {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		System.out.println((double)a/b);
		input.close();
	}
}
