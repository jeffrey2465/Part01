package pack05_referencedatatype.sec02_string.EX03_SharingStringObject;

public class EX03_SharingStringObject {
	public static void main(String[] args) {
		
		//#1. ���ڿ� ��ü�� ���� (literal�� ���� �Է��� ���) / ���� ��ü ���� (new�� ������ ���) 
		
		String str1 = new String("�ȳ�");
		String str2 = "�ȳ�";
		String str3 = "�ȳ�";
		String str4 = new String("�ȳ�");
		
		//@stack�޸𸮰� �� (��ü�� ����(��ġ))
		System.out.println(str1==str2); //false
		System.out.println(str2==str3); //true
		System.out.println(str3==str4); //false
		System.out.println(str4==str1); //false		
		
	}
}
