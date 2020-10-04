package chapter07;

import java.util.Scanner;

public class Constant {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
     
		int ta = (a%10)*100 + ((a%100)/10)*10 + a/100;
		int tb = (b%10)*100 + ((b%100)/10)*10 + b/100;
		
		if(ta>tb) System.out.println(ta);
		else System.out.println(tb);
		
		input.close();
	}
}
