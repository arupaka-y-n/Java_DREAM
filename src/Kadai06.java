import java.util.InputMismatchException;
import java.util.Scanner;

public class Kadai06 {
//	[演習06]演習05のプログラムを以下のように変更してください。
//	1~12以外が入力された場合には、入力が間違っています、再度入力してください。と表示し、再入力を受け付けてください。

	public static void main (String[] args) {
		//変数numを宣言、初期値を0に設定
		int num = 0;
		
		System.out.println("月を1～12で入力してください。 ");
		//キーボードから、整数値の入力を取得
		Scanner scan = new Scanner(System.in);
		
		//1～12の値が入力されるまでループを繰り返す
		while(true) {
			//数値が入力された場合の処理
			try {
				num = scan.nextInt();	
			} 
			 //数値以外の値が入力された場合の処理
			 catch (InputMismatchException e) {
				scan.next();
			}
			
			
			//キーボードから入力された整数値を場合分け
			switch(num) {
				//1月の場合
				case 1: 
				//3月の場合
				case 3:
				//5月の場合	
				case 5:
				//7月の場合
				case 7:
				//8月の場合	
				case 8:
				//10月の場合
				case 10:
				//12月の場合
				case 12:    
					//日数の表示
					System.out.println(num + "月は31日です。");
					//31日表示ループを抜ける
					break;
					
				//4月の場合	
				case 4:
				//6月の場合		
				case 6:    
				//9月の場合
				case 9:
				//11月の場合
				case 11:   
					//日数の表示
					System.out.println(num +"月は30日です。");
					//30日表示ループを抜ける
					break;
					
				//2月の場合
				case 2:    
					//日数の表示
					System.out.println(num + "月は28日です。");
					//28日表示ループを抜ける
					break;
					
				//1から12以外の整数が入力された場合の表示	
				default:
					//誤っていることの表示
					System.out.println("入力が間違っています、再度入力して下さい。");
					//正しい値が入力されるまでループ
					continue;
			}
			//whileループを抜ける
			break;
			
		}
		scan.close();
	}
}

