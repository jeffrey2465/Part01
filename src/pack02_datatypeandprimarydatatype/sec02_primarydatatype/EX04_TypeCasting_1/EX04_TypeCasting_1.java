package pack02_datatypeandprimarydatatype.sec02_primarydatatype.EX04_TypeCasting_1;

/*�� ���� ĳ���� ���*/

public class EX04_TypeCasting_1 {
	
	public static void main(String[] ar) {		
		//#1. ĳ����
		//#1-1. ĳ���� ���1 (������Ÿ��)
		int value1 = (int)5.3;
		long value2 = (long)10;
		float value3 = (float)5.8;
		double value4 = (double)16;
		
		System.out.println("value1="+value1);
		System.out.println("value2="+value2);
		System.out.println("value3="+value3);
		System.out.println("value4="+value4);
		
		//#1-2. ĳ���� ���2 (L, F) : ��ҹ��� ��� ����
		long value5 = 10L;
		long value6 = 10l;
		float value7 = 5.8F;
		float value8 = 5.8f;
		
		System.out.println("value5="+value5);
		System.out.println("value6="+value6);
		System.out.println("value7="+value7);
		System.out.println("value8="+value8);	
	}
}
