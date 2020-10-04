package chapter10;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println(factorial(n));
		sc.close();
	}
	
	public static int factorial(int n) {
		if(n == 0) return 1;
		else if(n <= 1) return n;
		else return n * factorial(n-1);
	}
}