package Java2.Kadai03;

//MakeVehicle�N���X�����
public class MakeVehicle {

	public static void main(String[] args) {
		//Vehicle���C���X�^���X��
		Vehicle bicycle = new Vehicle("coco", "JYP", "1909�N5��6��", 20);
		
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
