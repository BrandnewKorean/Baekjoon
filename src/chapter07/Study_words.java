package chapter07;

import java.util.Scanner;

public class Study_words {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		int[] count = new int[26];
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				count[(int)(s.charAt(i) - 'a')]++;
			}else {
				count[(int)(s.charAt(i) - 'A')]++;
			}
		}
		
		int max = count[0];
		int maxi = 0;
		int cnt = 0;
		
		for(int i=0;i<26;i++) {
			if(max<count[i]) {
				max = count[i];
				maxi = i;
			}
		}
		
		for(int i=0;i<26;i++) {
			if(count[i] == max) cnt++;
		}
		
		if(cnt == 1) System.out.println((char)(maxi+'A'));
		else System.out.println("?");
		
		input.close();
	}
}
