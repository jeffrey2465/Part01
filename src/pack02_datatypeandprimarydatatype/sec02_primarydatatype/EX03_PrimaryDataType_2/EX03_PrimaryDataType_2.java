package pack02_datatypeandprimarydatatype.sec02_primarydatatype.EX03_PrimaryDataType_2;

/*���� ���� �پ��� ������ �� ���*/

public class EX03_PrimaryDataType_2 {
	
	public static void main(String[] ar) {		
		//#4. ����(char) : ����, ����
		//#4-1. ���ڷ� �����ϴ� ���
		char value1 = 'A';		
		char value2 = '��';
		char value3 = '3';
		
		System.out.println("value1="+value1);
		System.out.println("value2="+value2);
		System.out.println("value3="+value3);
		
		//#4-2. ������ �����ϴ� ��� 
		char value4 = 65; //10����
		char value5 = 0xac00; //16����
		char value6 = 51; //10����
		
		System.out.println("value4="+value4);
		System.out.println("value5="+value5);
		System.out.println("value6="+value6);
		
		//#4-3. �����ڵ�� �����ϴ� ���
		char value7 = '\u0041';
		char value8 = '\uac00';
		char value9 = '\u0033';
		
		System.out.println("value7="+value7);
		System.out.println("value8="+value8);
		System.out.println("value9="+value9);					
	}
}
