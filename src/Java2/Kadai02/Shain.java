package Java2.Kadai02;

public class Shain extends Person {
	//String型　companyName変数をprivateで宣言
	private String companyName;
	
	//Mainクラスで受け取ったcompanyNameをShainクラスのcompanyNameに代入
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	//superクラスのshowProfileメソッドをオーバーライド
	@Override
	public void showProfile() {
		//superクラスのshowProfileメソッドを呼び出し
		super.showProfile();
		//companyNameを表示
		System.out.println("会社名は、" + companyName +"です。");
	}
	
}
