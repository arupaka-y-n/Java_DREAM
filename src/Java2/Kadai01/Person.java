package Java2.Kadai01;

public class Person {
	//privateでフィールド変数を定義
	private String name;
	private int age;
	
	//Mainクラスで受け取ったnameをPersonクラスのnameに代入
	public void setName(String nm) {
		this.name = nm;
	}
	
	//Mainクラスで受け取ったageをPersonクラスのageに代入
	public void setAge(int age) {
		this.age = age;
	}
	
	//名前と年齢を表示する
	public void showProfile() {
		System.out.println("名前は、" + name + "です。");
		System.out.println("年齢は、" + age + "です。");
	}
}
