import java.util.Scanner;

public class Kadai08 {
//	[���K08]�L�[�{�[�h����5�l���̓_���̓��͂��󂯕t���A5�l�̍��v�_���A
//	���ϓ_���A�ō��_����\�����Ă��������B����ɁA���������ɕ��ׂĕ\�����Ă��������B
	public static void main(String[] args) {
		int people = 5;
		int sum = 0;
		int max = 0;
		int[] score = new int[5];
		
		for(int i = 0; i < people; i ++) {
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();
			score[i] = input; 
			
			sum += input;
			
			if (max < input) {
				max= input;
			}
			
		}
		
		System.out.println("���ϓ_: " + (double)sum / people);
		System.out.println("�ō��_�F�@" + max);
		
	}
}
