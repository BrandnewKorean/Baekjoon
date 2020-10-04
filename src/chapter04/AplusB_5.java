package chapter04;

import java.util.Scanner;

public class AplusB_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int a, b;
		
		do {
			a = input.nextInt();
			b = input.nextInt();
			if(a == 0 && b == 0) break;
			sb.append((a+b)+"\n");
		}while(true);
		
		System.out.println(sb.toString());
		input.close();
	}
}
