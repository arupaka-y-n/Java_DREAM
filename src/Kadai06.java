import java.util.InputMismatchException;
import java.util.Scanner;

public class Kadai06 {
//	[���K06]���K05�̃v���O�������ȉ��̂悤�ɕύX���Ă��������B
//	1~12�ȊO�����͂��ꂽ�ꍇ�ɂ́A���͂��Ԉ���Ă��܂��A�ēx���͂��Ă��������B�ƕ\�����A�ē��͂��󂯕t���Ă��������B

	public static void main (String[] args) {
		//�ϐ�num��錾�A�����l��0�ɐݒ�
		int num = 0;
		
		System.out.println("����1�`12�œ��͂��Ă��������B ");
		//�L�[�{�[�h����A�����l�̓��͂��擾
		Scanner scan = new Scanner(System.in);
		
		//1�`12�̒l�����͂����܂Ń��[�v���J��Ԃ�
		while(true) {
			//���l�����͂��ꂽ�ꍇ�̏���
			try {
				num = scan.nextInt();	
			} 
			 //���l�ȊO�̒l�����͂��ꂽ�ꍇ�̏���
			 catch (InputMismatchException e) {
				scan.next();
			}
			
			
			//�L�[�{�[�h������͂��ꂽ�����l���ꍇ����
			switch(num) {
				//1���̏ꍇ
				case 1: 
				//3���̏ꍇ
				case 3:
				//5���̏ꍇ	
				case 5:
				//7���̏ꍇ
				case 7:
				//8���̏ꍇ	
				case 8:
				//10���̏ꍇ
				case 10:
				//12���̏ꍇ
				case 12:    
					//�����̕\��
					System.out.println(num + "����31���ł��B");
					//31���\�����[�v�𔲂���
					break;
					
				//4���̏ꍇ	
				case 4:
				//6���̏ꍇ		
				case 6:    
				//9���̏ꍇ
				case 9:
				//11���̏ꍇ
				case 11:   
					//�����̕\��
					System.out.println(num +"����30���ł��B");
					//30���\�����[�v�𔲂���
					break;
					
				//2���̏ꍇ
				case 2:    
					//�����̕\��
					System.out.println(num + "����28���ł��B");
					//28���\�����[�v�𔲂���
					break;
					
				//1����12�ȊO�̐��������͂��ꂽ�ꍇ�̕\��	
				default:
					//����Ă��邱�Ƃ̕\��
					System.out.println("���͂��Ԉ���Ă��܂��A�ēx���͂��ĉ������B");
					//�������l�����͂����܂Ń��[�v
					continue;
			}
			//while���[�v�𔲂���
			break;
			
		}
		scan.close();
	}
}

