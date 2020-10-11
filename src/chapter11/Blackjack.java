package chapter11;

import java.util.ArrayList;
import java.util.Scanner;

public class Blackjack {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(blackjack(arr,M));
		sc.close();
	}
	
	public static int blackjack(int[] arr, int M) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					list.add(arr[i]+arr[j]+arr[k]);
				}
			}
		}
		
		int min = M;
		int index = 0;
		
		for(int i=0;i<list.size();i++) {
			if(M-list.get(i) >= 0) {
				if(min > M-list.get(i)) {
					index = i;
					min = M-list.get(i);
				}
			}
		}
		
		return list.get(index);
	}
}
