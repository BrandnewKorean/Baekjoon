package chapter5;

import java.util.Scanner;

public class Count_number {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[3];
		int[] count = new int[10];
		
		for(int i=0;i<num.length;i++) {
			num[i] = input.nextInt();
		}
		String s = String.valueOf(num[0]*num[1]*num[2]);
		
		for(int i=0;i<s.length();i++) {
			count[s.charAt(i)-'0']++;
		}
		
		for(int i=0;i<count.length;i++) {
			System.out.println(count[i]);
		}
		input.close();
	}

}
