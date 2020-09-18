import java.util.Scanner;

class Kadai07 {
//	[演習07]演習04のプログラムをつかって、２つの文字列の入力を受けつけ、
//	受け付けた文字列同士が等しいか判定してください。
	public static void main(String[] args) {
	
		//main全体で利用するため、ここで配列の宣言
		String num[] = new String[2];

		for(int i = 0; i < 2; i++) {
			System.out.println(i+1 + "つ目の文字列を入力してください。");
			//キーボードからの入力を受け取り、値を代入する
			Scanner scan = new Scanner(System.in);
			String msg = scan.nextLine();
			//受け取った文字列を配列に代入
			num[i] = msg;
		}
		
		//文字列が一致するかどうか、equals関数を利用して判定
		//一致する場合
		if(num[0].equals(num[1])) {
			System.out.println("入力された文字列は等しいです。");
		} 
		//一致しない場合
		  else {
			System.out.println("入力された文字列は異なっています。");
		}
		

		
	}
}
