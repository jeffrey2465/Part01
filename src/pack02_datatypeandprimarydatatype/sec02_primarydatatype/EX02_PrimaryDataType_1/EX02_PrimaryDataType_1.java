package pack02_datatypeandprimarydatatype.sec02_primarydatatype.EX02_PrimaryDataType_1;

public class EX02_PrimaryDataType_1 {
	public static void main(String[] ar) {
		
		//#1. �ο��� (boolean) : true/false
		boolean bool1 = true;
		boolean bool2 = false;
		System.out.println("bool1="+bool1); //true
		System.out.println("bool2="+bool2); //false
		
		//#2. ����(byte, short, int, long) : ���� ����, 0, ���� ����
		byte value1 = 10;
		short value2 = -10;
		int value3 = 100;
		long value4 = -100L;
		System.out.println("value1="+value1); //10
		System.out.println("value2="+value2); //-10		
		System.out.println("value3="+value3); //100
		System.out.println("value4="+value4); //-100
		
		//#3. �Ǽ�(float, double) : ���ǽǼ�, 0, ���ǽǼ�
		float value5 = 1.2F;
		double value6 = -1.5;
		double value7 = 5;
		System.out.println("value5="+value5); //1.2
		System.out.println("value6="+value6); //-1.5
		System.out.println("value7="+value7); //5.0		
		
	}
}
