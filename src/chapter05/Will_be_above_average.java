package chapter05;

import java.util.Scanner;

public class Will_be_above_average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int c = input.nextInt();
		float[] ratio = new float[c];
		
		
		for(int i=0;i<c;i++) {
			int n = input.nextInt();
			int[] score = new int[n];
			
			for(int j=0;j<n;j++) {
				score[j] = input.nextInt();
			}
			
			int sum = 0;
			for(int j=0;j<n;j++) {
				sum += score[j];
			}
			float avg = (float)sum/n;
			
			int count = 0;
			for(int j=0;j<n;j++) {
				if(score[j] > avg) count++;
			}
			
			
			ratio[i] = ((float)count/n)*100;
		}
		
		for(int i=0;i<c;i++) {
			System.out.printf("%.3f%%\n",ratio[i]);
		}
		input.close();
	}
}
