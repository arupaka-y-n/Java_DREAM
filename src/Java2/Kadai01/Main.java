//[�ۑ�01] �ȉ���Person�N���X��ύX���Ă��������B
//�@Person�N���X�ɔN���ێ����郁���o�ϐ�age�ƁA
//�N���ݒ肷�郁�\�b�hsetAge��ǉ�����B
//�AshowProfile���\�b�h�𖼑O�ƔN���\������悤�ɕύX����B
//�BMain�N���X��Person�N���X�̃C���X�^���X���쐬����B
//���R���X�g���N�^�͎g�p���Ȃ��B
//�C���O�ɁuTaroYamada�v�A�N��Ɂu47�v��ݒ肷��B
//�D�v���t�B�[����\������

//class Person{
//	private String name;
//	
//	public void setName( String nm ){
//		name = nm;
//	}
//	
//	public void showProfile(){
//		System.out.println( "���O�́A" + name + "�ł��B" );
//	}
//}


package Java2.Kadai01;

public class Main {

	public static void main (String[] args) {
		//�C���X�^���X�𐶐�
		Person person = new Person();
		//���O��ݒ肷��
		person.setName("Taro Yamada");
		//�N���ݒ肷��
		person.setAge(47);
		
		//person�N���X��showProfile���\�b�h�����s
		person.showProfile();
	}
}
