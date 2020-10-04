package chapter07;

import java.util.Scanner;

public class Croatia_alphabet {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String tmp;
		String[] r = {"c=","c-","dz=","d-","lj","nj","s=","z="};
		int cnt = 0;
		for(int i=0;i<s.length();i++) {
			for(int j=0;j<r.length;j++) {
				if(s.charAt(i) == r[j].charAt(0)) {
					if(i+r[j].length()-1 < s.length()) {
						tmp = s.substring(i, i+r[j].length());
						if(tmp.equals(r[j])) {
							cnt++;
						}
					}
				}
			}
		}
		System.out.println(s.length()-cnt);
		input.close();
	}
}
