package chapter1;

import java.util.Scanner;

public class Multiply {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		int[] cal = new int[3];
		
		cal[0] = (b%10) * a;
		cal[1] = (b%100 - b%10)/10 * a;
		cal[2] = (b/100) * a;
		
		System.out.println(cal[0]);
		System.out.println(cal[1]);
		System.out.println(cal[2]);
		System.out.println(cal[0] + cal[1]*10 + cal[2]*100);
		input.close();
	}
}
