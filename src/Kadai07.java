import java.util.Scanner;

class Kadai07 {
//	[���K07]���K04�̃v���O�����������āA�Q�̕�����̓��͂��󂯂��A
//	�󂯕t���������񓯎m�������������肵�Ă��������B
	public static void main(String[] args) {
	
		//main�S�̂ŗ��p���邽�߁A�����Ŕz��̐錾
		String num[] = new String[2];

		for(int i = 0; i < 2; i++) {
			System.out.println(i+1 + "�ڂ̕��������͂��Ă��������B");
			//�L�[�{�[�h����̓��͂��󂯎��A�l��������
			Scanner scan = new Scanner(System.in);
			String msg = scan.nextLine();
			//�󂯎�����������z��ɑ��
			num[i] = msg;
		}
		
		//�����񂪈�v���邩�ǂ����Aequals�֐��𗘗p���Ĕ���
		//��v����ꍇ
		if(num[0].equals(num[1])) {
			System.out.println("���͂��ꂽ������͓������ł��B");
		} 
		//��v���Ȃ��ꍇ
		  else {
			System.out.println("���͂��ꂽ������͈قȂ��Ă��܂��B");
		}
		

		
	}
}
