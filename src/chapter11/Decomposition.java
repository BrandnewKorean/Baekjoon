package chapter11;

import java.util.Scanner;

public class Decomposition {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		
		System.out.println(decomposition(N));
	}
	
	public static int decomposition(int N) {
		int result = 0;
		
		for(int i=0;i<N;i++) {
			String tmp = String.valueOf(i);
			int sum = 0;
			for(int j=0;j<tmp.length();j++) {
				sum += tmp.charAt(j) - '0';
			}
			sum += i;
			if(sum == N) return i;
		}
		
		return result;
	}
}
