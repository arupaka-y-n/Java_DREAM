package Java2.Kadai02;

//Person�N���X���Q�Ƃł���悤��public��
public class Person {
	//String�^��name,int�^��age�ϐ���private�Ő錾
	private String name;
	private int age;
	
	//Main�N���X�Ŏ󂯎����name��Person�N���X��name�ɑ��
	public void setName(String name) {
		this.name = name;
	}
	
	//Main�N���X�Ŏ󂯎����age��Person�N���X��age�ɑ��
	public void setAge(int age) {
		this.age = age;
	}
	
	//���O�ƔN���\������
	public void showProfile() {
		System.out.println("���O�́A" + name + "�ł��B");
		System.out.println("�N��́A" + age + "�΂ł��B");
	}
}
