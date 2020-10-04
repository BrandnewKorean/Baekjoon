package chapter5;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		float[] grade = new float[n];
		float sum = 0;
		
		for(int i=0;i<grade.length;i++) {
			grade[i] = input.nextInt();
		}
		
		float max = grade[0];
		for(int i=1;i<grade.length;i++) {
			if(max < grade[i]) {
				max = grade[i];
			}
		}
		
		for(int i=0;i<grade.length;i++) {
			grade[i] = grade[i]/max*100;
			sum += grade[i];
		}
		
		System.out.println(sum/grade.length);
		input.close();
	}
}
