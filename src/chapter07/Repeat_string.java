package chapter07;

import java.util.Scanner;

public class Repeat_string {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(input.nextLine());
		
		for(int i=0;i<t;i++) {
			int n = Integer.parseInt(input.next());
			String s = input.next();
			
			for(int j=0;j<s.length();j++) {
				for(int k=0;k<n;k++) {
					sb.append(s.charAt(j));
				}
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
		input.close();
	}
}
