package chapter07;

import java.util.Scanner;

public class Groupword_checker {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = Integer.parseInt(input.nextLine());
		String[] s = new String[n];
		
		int cnt = 0;
		
		for(int i=0;i<n;i++) {
			s[i] = input.nextLine();
			if(check(s[i])) cnt++;
		}
		
		System.out.println(cnt);
		input.close();
	}
	
	public static boolean check(String str) {
		char c = str.charAt(0);
		String tmp;
		char[] check = new char[str.length()];
		int chi = 0;
		int start = 0;
		int end = 0;
		for(int i=1;i<str.length();i++) {
			if(c != str.charAt(i)) {
				tmp = str.substring(start,end+1);
				check[chi] = tmp.charAt(0);
				chi++;
				start = i;
				end = i;
				c = str.charAt(i);
			}else {
				end++;
			}
			if(i == str.length()-1) {
				tmp = str.substring(start,end+1);
				check[chi] = tmp.charAt(0);
				chi++;
			}
		}
		for(int i=0;i<check.length;i++) {
			for(int j=i+1;j<check.length;j++) {
				if(check[i] != 0 && check[j] != 0 && check[i] == check[j]) return false;
			}
		}
		
		return true;
	}
}
