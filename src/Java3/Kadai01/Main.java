//[�ۑ�01] ���l�̓��͂��󂯕t���A���͂��ꂽ���l�̐������A�|���Z�̕\���R���\�[���ɏo�͂��Ă��������B
//�Ⴆ�΁A15�Ɠ��͂��ꂽ��A1�~1�`15�~15�܂ł̊|���Z�̕\���o�͂��Ă��������B

package Java3.Kadai01;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		//�����o�ϐ��̐錾
		int total = 0;
		
		System.out.printf("��������͂��Ă��������F�@");
		//�L�[�{�[�h������͂��󂯎��
		Scanner scan = new Scanner(System.in);
		//���͂��ꂽ�l��int�^�Ŏ󂯎��A�ϐ��ɑ������
		int num = scan.nextInt();
		
		//�ő�̐��l���v�Z
		int value = num * num;
		//int�^��String�^�ɕϊ����A������̒��������߂�
		int c = String.valueOf(value).length(); 
		
		//�|�����鐔�̃��[�v���A���͂������܂ōs��
		for(int i = 0; i < num; i++) {
			//�|���鐔�̃��[�v���A���͂������܂ōs��
			for(int j = 0; j < num; j++) {
				//�|�����킹������ϐ��ɑ��
				total = (i+1) * (j+1);
				//�������w�肵�āA�\��
				System.out.printf("%" + (c+1) +"d",total);
			}
			//���s��\��
			System.out.println();
		}
		//Scanner�����
		scan.close();
	}
}
