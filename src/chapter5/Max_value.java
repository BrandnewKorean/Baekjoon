package chapter5;

import java.util.Scanner;

public class Max_value {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[9];
		
		for(int i=0;i<num.length;i++) {
			num[i] = input.nextInt();
		}
		
		int max = num[0];
		int max_i = 0;
		for(int i=0;i<num.length;i++) {
			if(max < num[i]) {
				max = num[i];
				max_i = i;
			}
		}
		System.out.println(max);
		System.out.println(max_i+1);
		input.close();
	}
}
