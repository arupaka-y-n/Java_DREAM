package Java2.Kadai01;

public class Person {
	//private�Ńt�B�[���h�ϐ����`
	private String name;
	private int age;
	
	//Main�N���X�Ŏ󂯎����name��Person�N���X��name�ɑ��
	public void setName(String nm) {
		this.name = nm;
	}
	
	//Main�N���X�Ŏ󂯎����age��Person�N���X��age�ɑ��
	public void setAge(int age) {
		this.age = age;
	}
	
	//���O�ƔN���\������
	public void showProfile() {
		System.out.println("���O�́A" + name + "�ł��B");
		System.out.println("�N��́A" + age + "�ł��B");
	}
}
