package pack03_operators.EX03_ShiftOperator;

/*�������Ʈ�� ������Ʈ*/

public class EX03_ShiftOperator {
	
	public static void main(String[] args) {		
		//#1. �������Ʈ (��ȣ��ȭ ����)
		//@ << Left Shift
		System.out.println(3<<1);	//6
		System.out.println(-3<<1); 	//-6
		System.out.println(3<<2); 	//12
		System.out.println(-3<<2); 	//-12
		
		System.out.println();
		
		//@ >> Right Shift
		System.out.println(5>>1); 	//2
		System.out.println(-5>>1);	//-3
		System.out.println(5>>2); 	//1
		System.out.println(-5>>2); 	//-2
		
		System.out.println();
				
		//#2. ������Ʈ (>>>)		
		System.out.println(3>>>1);		//1
		System.out.println(-3>>>31);	//1
	}
}
