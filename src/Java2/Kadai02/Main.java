//[課題02] [課題01]のPersonクラスを使用して、次のプログラムを作成してください。
//		①Personクラスを継承した、Shainクラスの作成。
//		②Shainクラスに、会社名を保持する変数「companyName」と、会社名を設定するメソッド「setCompanyName」を追加。
//		③Shainクラスのインスタンスを2つ作成する。
//		(インスタンス化する値は各自決めてください。）
//		④それぞれのプロフィールを表示する。
//		※名前、年齢、会社名


package Java2.Kadai02;

public class Main {

	public static void main (String[] args) {
		//インスタンスの生成
		Shain park = new Shain();
		Shain kim = new Shain();
		
		//Shain.parkのname,age,companyNameを設定
		park.setName("park");
		park.setAge(56);
		park.setCompanyName("JYP");
		
		//Shain.kimのname,age,companyNameを設定
		kim.setName("kim");
		kim.setAge(34);
		kim.setCompanyName("Predis");
		
		//設定した情報を表示
		park.showProfile();
		kim.showProfile();
		
	}
}
