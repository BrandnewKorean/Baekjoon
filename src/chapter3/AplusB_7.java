package chapter3;

import java.util.Scanner;

public class AplusB_7 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int t = input.nextInt();
		
		for(int i=0;i<t;i++) {
			int a = input.nextInt();
			int b = input.nextInt();
			
			sb.append("Case #"+(i+1)+": "+(a+b)+"\n");
		}
		System.out.println(sb.toString());
		
		input.close();
	}
}