package chapter10;

import java.util.Scanner;

public class Hanoi {
	private static StringBuilder sb = new StringBuilder();
	private static int count = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		hanoi(n,1,2,3);
		System.out.println(count);
		System.out.println(sb);
		sc.close();
	}
	
	public static void hanoi(int n, int from, int middle, int to) {
		if(n == 1) {
			sb.append(from+" "+to+"\n");
			count++;
			return;
		}
		else {
			hanoi(n-1,from, to, middle);
			sb.append(from+" "+to+"\n");
			count++;
			hanoi(n-1,middle,from,to);
		}
	}
}
