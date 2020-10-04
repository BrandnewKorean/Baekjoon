package chapter04;

import java.util.Scanner;

public class AplusB_4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int a, b;
		while(input.hasNextInt()){
			a = input.nextInt();
			b = input.nextInt();
			sb.append((a+b)+"\n");
		};
		
		System.out.println(sb.toString());
		input.close();
	}
}
