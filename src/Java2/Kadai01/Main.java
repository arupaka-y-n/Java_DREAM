//[課題01] 以下のPersonクラスを変更してください。
//�@Personクラスに年齢を保持するメンバ変数ageと、
//年齢を設定するメソッドsetAgeを追加する。
//�AshowProfileメソッドを名前と年齢を表示するように変更する。
//�BMainクラスでPersonクラスのインスタンスを作成する。
//※コンストラクタは使用しない。
//�C名前に「TaroYamada」、年齢に「47」を設定する。
//�Dプロフィールを表示する

//class Person{
//	private String name;
//	
//	public void setName( String nm ){
//		name = nm;
//	}
//	
//	public void showProfile(){
//		System.out.println( "名前は、" + name + "です。" );
//	}
//}


package Java2.Kadai01;

public class Main {

	public static void main (String[] args) {
		//インスタンスを生成
		Person person = new Person();
		//名前を設定する
		person.setName("Taro Yamada");
		//年齢を設定する
		person.setAge(47);
		
		//personクラスのshowProfileメソッドを実行
		person.showProfile();
	}
}
