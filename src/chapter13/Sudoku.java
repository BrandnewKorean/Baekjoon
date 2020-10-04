package chapter13;

import java.util.Scanner;

public class Sudoku {
	static int[][] map = new int[9][9];
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				map[i][j] = input.nextInt();
			}
		}
		
		sudoku(0);
		input.close();
	}
	
	public static boolean rule(int col, int row, int num) {
		// 세로로 같은 값이 있는지 검사
		for(int i=0;i<9;i++) {
			if(col != i && map[i][row] == num)
				return false;
		}
		
		// 가로로 같은 값이 있는지 검사
		for(int j=0;j<9;j++) {
			if(row != j && map[col][j] == num)
				return false;
		}
		
		// 3*3 사각형 안에 같은 값이 있는지 검사
		for(int i=(col/3)*3;i<(col/3)*3+3;i++) {
			for(int j=(row/3)*3;j<(row/3)*3+3;j++) {
				if(i != col && j != row && map[i][j] == num)
					return false;
			}
		}
		return true;
	}
	
	public static void sudoku(int cnt) {
		if(cnt == 81) {
			print();
			System.exit(0);
		}
		
		int y = cnt / 9;
		int x = cnt % 9;
		
		if(map[y][x] == 0) {
			for(int k=1;k<=9;k++) {
				if(rule(y,x,k)) {
					map[y][x] = k;
					sudoku(cnt+1);
					map[y][x] = 0;
				}
			}
		}else {
			sudoku(cnt+1);
		}
	}
	
	public static void print() {
		for(int i=0;i<9;i++) {
			for(int j=0;j<9;j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
	}
	
}