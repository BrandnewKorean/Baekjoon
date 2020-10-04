package chapter7;

import java.util.Scanner;

public class Count_of_words {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();
		String[] n = s.trim().split(" ");
		int cnt=0;
     
		for(int i=0;i<n.length;i++){
			if(n[i].length() != 0) cnt++;
		}
	     
		System.out.println(cnt);
		input.close();
   }
}
