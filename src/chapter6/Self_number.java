package chapter6;

import java.util.HashSet;
import java.util.Iterator;

public class Self_number {
	public static void main(String[] args) {
		HashSet<Integer> answer = solution();
		
		Iterator<Integer> iter = answer.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
	public static HashSet<Integer> solution() {
		HashSet<Integer> arr = new HashSet<>();
		int[] num = new int[10000];
		
		for(int i=0;i<10000;i++) {
			arr.add(i+1);
			num[i] = d(i+1);
		}
		
		for(int i=0;i<10000;i++) {
			arr.remove(num[i]);
		}
		
		return arr;
	}
	
	public static int d(int n) {
		return n + n/10000 + (n%10000)/1000 + (n%1000)/100 + (n%100) / 10 + (n%10);
	}
}
