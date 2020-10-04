package chapter7;

import java.util.Scanner;

public class Sum_of_number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		String s = input.nextLine();
		int sum = 0;
		
		for(int i=0;i<n;i++) {
			sum += (int)(s.charAt(i) - '0');
		}
		System.out.println(sum);
		input.close();
	}
}
