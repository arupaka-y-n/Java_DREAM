package Java2.Kadai02;

public class Shain extends Person {
	//String�^�@companyName�ϐ���private�Ő錾
	private String companyName;
	
	//Main�N���X�Ŏ󂯎����companyName��Shain�N���X��companyName�ɑ��
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	//super�N���X��showProfile���\�b�h���I�[�o�[���C�h
	@Override
	public void showProfile() {
		//super�N���X��showProfile���\�b�h���Ăяo��
		super.showProfile();
		//companyName��\��
		System.out.println("��Ж��́A" + companyName +"�ł��B");
	}
	
}
