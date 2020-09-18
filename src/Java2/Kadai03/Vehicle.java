package Java2.Kadai03;

public class Vehicle {
	//フィールド変数を定義
	private String name;
	private String maker;
	private String date;
	private int xpoint;
	private int fuel;
	
	Vehicle(String name,String maker, String date, int fuel){
		//Vehicleのフィールド変数に渡した引数を代入
		this.name = name;
		this.maker = maker;
		this.date = date;
		this.xpoint = 0;
		this.fuel = fuel;
	}
	
	public String getDate() {
		return date;
	}
	
	public int getXpoint() {
		return xpoint;
	}
	
	public int getFuel() {
		return fuel;
	}
	
	public void move(int dotx) {
		this.xpoint += dotx;
		
		this.fuel -= Math.abs(dotx);
	}
	
	public void showPofile() {
		System.out.println("名前は、" + name + "です。");
		System.out.println("メーカーは、" + maker + "です。");
		System.out.println("購入日は、" + date + "です。");
		System.out.println("現在位置のX座標は、" + xpoint + "です。");
		System.out.println("残りの燃料は、" + fuel + "lです。");
	}
	
}
