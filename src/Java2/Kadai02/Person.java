package Java2.Kadai02;

//Personクラスを参照できるようにpublic化
public class Person {
	//String型のname,int型のage変数をprivateで宣言
	private String name;
	private int age;
	
	//Mainクラスで受け取ったnameをPersonクラスのnameに代入
	public void setName(String name) {
		this.name = name;
	}
	
	//Mainクラスで受け取ったageをPersonクラスのageに代入
	public void setAge(int age) {
		this.age = age;
	}
	
	//名前と年齢を表示する
	public void showProfile() {
		System.out.println("名前は、" + name + "です。");
		System.out.println("年齢は、" + age + "歳です。");
	}
}
