package chapter3;

import java.util.Scanner;

public class Smaller_number_than_X {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		StringBuffer sb = new StringBuffer();
		int n = input.nextInt();
		int x = input.nextInt();
		int[] a = new int[n];
		
		for(int i=0;i<n;i++) {
			a[i] = input.nextInt();
			if(a[i] < x)
				sb.append(a[i]+" ");
		}
		
		System.out.println(sb.toString());
		input.close();
	}
}
