package chapter5;

import java.util.Scanner;

public class Remainder {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] num = new int[10];
		int count = 0;
		
		for(int i=0;i<num.length;i++) {
			num[i] = input.nextInt();
			num[i] %= 42;
		}
		
		for(int i=0;i<num.length;i++) {
			for(int j=i+1;j<num.length;j++) {
				if(num[i] == num[j]) num[i] = -1;
			}
		}
		
		for(int i=0;i<num.length;i++) {
			if(num[i] >= 0) count++;
		}
		System.out.println(count);
		
		input.close();
	}
}
