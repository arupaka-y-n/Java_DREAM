//[�ۑ�02] [�ۑ�01]��Person�N���X���g�p���āA���̃v���O�������쐬���Ă��������B
//		�@Person�N���X���p�������AShain�N���X�̍쐬�B
//		�AShain�N���X�ɁA��Ж���ێ�����ϐ��ucompanyName�v�ƁA��Ж���ݒ肷�郁�\�b�h�usetCompanyName�v��ǉ��B
//		�BShain�N���X�̃C���X�^���X��2�쐬����B
//		(�C���X�^���X������l�͊e�����߂Ă��������B�j
//		�C���ꂼ��̃v���t�B�[����\������B
//		�����O�A�N��A��Ж�


package Java2.Kadai02;

public class Main {

	public static void main (String[] args) {
		//�C���X�^���X�̐���
		Shain park = new Shain();
		Shain kim = new Shain();
		
		//Shain.park��name,age,companyName��ݒ�
		park.setName("park");
		park.setAge(56);
		park.setCompanyName("JYP");
		
		//Shain.kim��name,age,companyName��ݒ�
		kim.setName("kim");
		kim.setAge(34);
		kim.setCompanyName("Predis");
		
		//�ݒ肵������\��
		park.showProfile();
		kim.showProfile();
		
	}
}
