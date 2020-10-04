package chapter6;

import java.util.Scanner;

public class Hansu {
	static boolean han(int n) {
		int[] arr = new int[4];
		arr[0] = (n%10);
		arr[1] = (n%100)/10;
		arr[2] = (n%1000)/100;
		arr[3] = n/1000;
		
		int x = arr[0] - arr[1];
		int size;
		if(n<10) size=0;
		else if(n<100) size=1;
		else if(n<1000) size=2;
		else size=3;
		for(int i=0;i<size;i++) {
			if(arr[i] - arr[i+1] != x)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int result = 0;
		for(int i=1;i<=n;i++) {
			if(han(i)) result++;
		}
		System.out.println(result);
		input.close();
	}
}
