package chapter03;

import java.util.Scanner;

public class PrintN {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		for(int i=1;i<=n;i++) {
			System.out.println(i);
		}
		
		input.close();
	}
}
