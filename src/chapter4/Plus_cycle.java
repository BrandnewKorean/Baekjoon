package chapter4;

import java.util.Scanner;

public class Plus_cycle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		int tmp=n;
		int count = 0;
		int sum = 0;
		do {
			sum = tmp/10 + tmp%10;
			tmp = sum%10 + (tmp%10)*10;
			count++;
		}while(tmp != n);
		System.out.println(count);
		input.close();
	}
}
