//[課題01] 数値の入力を受け付け、入力された数値の数だけ、掛け算の表をコンソールに出力してください。
//例えば、15と入力されたら、1×1～15×15までの掛け算の表を出力してください。

package Java3.Kadai01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//メンバ変数の宣言
		int total = 0;
		
		System.out.printf("数字を入力してください：　");
		//キーボードから入力を受け取る
		Scanner scan = new Scanner(System.in);
		//入力された値をint型で受け取り、変数に代入する
		int num = scan.nextInt();
		
		//最大の数値を計算
		int value = num * num;
		//int型をString型に変換し、文字列の長さを求める
		int c = String.valueOf(value).length(); 
		
		//掛けられる数のループを、入力した数まで行う
		for(int i = 0; i < num; i++) {
			//掛ける数のループを、入力した数まで行う
			for(int j = 0; j < num; j++) {
				//掛け合わせた数を変数に代入
				total = (i+1) * (j+1);
				//桁数を指定して、表示
				System.out.printf("%" + (c+1) +"d",total);
			}
			//改行を表示
			System.out.println();
		}
		//Scannerを閉じる
		scan.close();
	}
}
