package pack03_operators.sec01_operators.EX02_BitwiseOperator;

/*�پ��� ������ ǥ���� ��Ʈ������*/

public class EX02_BitwiseOperator {
	
	public static void main(String[] args) {		
		
		//#0. �ڹ��ڵ�� ���� ��ȯ
		int data = 13;
		System.out.println(Integer.toBinaryString(data));
		System.out.println(Integer.toOctalString(data));
		System.out.println(Integer.toHexString(data));
		
		System.out.println(Integer.parseInt("1101",2));
		System.out.println(Integer.parseInt("15",8));
		System.out.println(Integer.parseInt("d",16));
				
		//#1. �پ��� ������ ǥ��
		System.out.println(13);		//10����
		System.out.println(0b1101);	//2����
		System.out.println(015);	//8����
		System.out.println(0x0D);	//16����
		System.out.println();
				
		//#2. ��Ʈ������ 
		//@ AND ������
		System.out.println(3 & 10); 		//2
		System.out.println(0b0011 & 0b1010);//2		
		System.out.println(0x03 & 0x0A);	//2		
		System.out.println();
		
		//@ OR ������
		System.out.println(3 | 10); 		//11
		System.out.println(0b0011 | 0b1010);//11		
		System.out.println(0x03 | 0x0A);	//11		
		System.out.println();
				
		//@ XOR ������
		System.out.println(3 ^ 10); 		//9
		System.out.println(0b0011 ^ 0b1010);//9		
		System.out.println(0x03 ^ 0x0A);	//9		
		System.out.println();
				
		//@ ~ ������
		System.out.println(~3);			//-4
		System.out.println(~0b0011); 	//-4
		System.out.println(~0x03); 		//-4
		System.out.println();				
	}

}
