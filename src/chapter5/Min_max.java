package chapter5;

import java.util.Scanner;

public class Min_max {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] num = new int[n];
		
		for(int i=0;i<num.length;i++) {
			num[i] = input.nextInt();
		}
		
		int min = num[0];
		int max = num[0];
		for(int i=1;i<num.length;i++) {
			if(min > num[i]) min = num[i];
			if(max < num[i]) max = num[i];
		}
		
		System.out.println(min+" "+max);
		input.close();
	}
}
