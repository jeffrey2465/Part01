package pack05_referencedatatype.sec02_string.EX04_PlusOperationOfString;

public class EX04_PlusOperationOfString {
	public static void main(String[] args) {
		
		//#1. case1. String + String		
		String str1 = "�ȳ�"+"�ϼ���"+"!";
		System.out.println(str1); //�ȳ��ϼ���!
		
		String str2 = "�ݰ�";
		str2+="���ϴ�";
		str2+="!";
		System.out.println(str2); //�ݰ����ϴ�!
		System.out.println();
				
		
		//#2. case2. String + �⺻�ڷ���  �Ǵ� �⺻�ڷ��� + String
		String str3 = "�ȳ�" + 1; //
		String str4 = "�ȳ�" + String.valueOf(1);
		String str5 = "�ȳ�" + "1";
		
		System.out.println(str3);	//�ȳ�1
		System.out.println(str4);	//�ȳ�1
		System.out.println(str5);	//�ȳ�1
		System.out.println();
		
		
		//#3. case3. String/�⺻�ڷ��� ȥ�� 
		System.out.println(1+"�ȳ�");	//1�ȳ�
		System.out.println(1+"�ȳ�"+2);	//1�ȳ�2
		System.out.println("�ȳ�"+1+2);	//�ȳ�12
		System.out.println(1+2+"�ȳ�");	//3�ȳ�
					
	}
}
