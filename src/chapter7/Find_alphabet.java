package chapter7;

import java.util.Scanner;

public class Find_alphabet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] location = new int[26];
		String s = input.nextLine();
		
		for(int i=0;i<26;i++) {
			location[i] = -1;
		}
		
		for(int i=s.length()-1;i>=0;i--) {
			location[(int)(s.charAt(i)-'a')] = i;
		}

		for(int i=0;i<26;i++) {
			System.out.print(location[i]+" ");
		}
		input.close();
	}
}
