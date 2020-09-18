package Java2.Kadai03;

//MakeVehicleクラスを作る
public class MakeVehicle {

	public static void main(String[] args) {
		//Vehicleをインスタンス化
		Vehicle bicycle = new Vehicle("coco", "JYP", "1909年5月6日", 20);
		
		bicycle.showPofile();
		
		bicycle.move(-20);
		
		System.out.println();
		bicycle.showPofile();
		
		bicycle.move(50);
		bicycle.showPofile();
		
		bicycle.move(50);
		bicycle.showPofile();
		
		
	}
	
}
