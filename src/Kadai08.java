import java.util.Scanner;

public class Kadai08 {
//	[演習08]キーボードから5人分の点数の入力を受け付け、5人の合計点数、
//	平均点数、最高点数を表示してください。さらに、小さい順に並べて表示してください。
	public static void main(String[] args) {
		int people = 5;
		int sum = 0;
		int max = 0;
		int[] score = new int[5];
		
		for(int i = 0; i < people; i ++) {
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			score[i] = input; 
			
			sum += input;
			
			if (max < input) {
				max= input;
			}
			
		}
		
		System.out.println("平均点: " + (double)sum / people);
		System.out.println("最高点：　" + max);
		
	}
}
