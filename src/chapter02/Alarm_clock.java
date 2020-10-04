package chapter02;

import java.util.Scanner;

public class Alarm_clock {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int h = input.nextInt();
		int m = input.nextInt();
		
		m -= 45;
		if(m < 0) {
			if(h == 0) {
				h = 24;
			}
			h -= 1;
			m += 60;
		}
		
		System.out.println(h+" "+m);
		input.close();
	}
}
