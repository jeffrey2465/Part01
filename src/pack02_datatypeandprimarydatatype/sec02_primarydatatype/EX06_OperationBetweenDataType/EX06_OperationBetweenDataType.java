package pack02_datatypeandprimarydatatype.sec02_primarydatatype.EX06_OperationBetweenDataType;

/*���� �ڷ������� ����� �ٸ� �ڷ������� ����*/

public class EX06_OperationBetweenDataType {
	public static void main(String[] ar) {		
		//#1. ���� �ڷ������� ����
		int value1 = 3+5;
		int value2 = 8/5;
		float value3 = 3.0f + 5.0f;
		double value4 = 8.0/5.0;
		
		byte data1 = 3;
		byte data2 = 5;
		//byte value5 = data1 + data2; //���� (byte, short�� ����� int�� ��ȯ�Ǿ� ���� ����)
		int value5 = data1 + data2;
		
		System.out.println("value1="+value1);
		System.out.println("value2="+value2); //1
		System.out.println("value3="+value3);
		System.out.println("value4="+value4);
		System.out.println("value5="+value5);
		
		//#2. �ٸ� �ڷ������� ���� (������ ���� ������ �ڵ�ĳ����)
		//int value6 = 5 + 3.5; //����
		double value6 = 5 + 3.5;
		int value7 = 5 + (int)3.5;
		
		double value8 = 5/2.0;
		byte data3 = 3;
		short data4 = 5;
		int value9 = data3 + data4;
		double value10 = data3 + data4;
		
		System.out.println("value6="+value6);
		System.out.println("value7="+value7); 
		System.out.println("value8="+value8);
		System.out.println("value9="+value9);
		System.out.println("value10="+value10);				
	}
}
