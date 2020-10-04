package chapter5;

import java.util.Scanner;

public class OXquiz {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		
		int t = Integer.parseInt(input.nextLine());
		String[] s = new String[t];
		
		for(int i=0;i<t;i++) {
			s[i] = input.nextLine();
		}
		
		int score;
		int increase = 1;
		for(int i=0;i<t;i++) {
			score = 0;
			increase = 1;
			for(int j=0;j<s[i].length();j++) {
				if(s[i].charAt(j) == 'O') {
					score += increase;
					increase++;
				}else {
					increase = 1;
				}
			}
			sb.append(score+"\n");
		}
		
		System.out.println(sb.toString());
		input.close();
	}
}
