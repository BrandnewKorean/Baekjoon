package chapter3;

import java.util.Scanner;

public class Multiplication_table {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int g = input.nextInt();
		
		for(int i=1;i<=9;i++) {
			System.out.println(g+" * "+i+" = "+(g*i));
		}
		
		input.close();
	}
}
