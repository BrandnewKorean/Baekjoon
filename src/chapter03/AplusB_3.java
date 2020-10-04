package chapter03;

import java.util.Scanner;

public class AplusB_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = input.nextInt();
		for(int i=0;i<t;i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			sb.append((a+b)+"\n");
		}
		System.out.println(sb.toString());
		
		input.close();
	}
}
