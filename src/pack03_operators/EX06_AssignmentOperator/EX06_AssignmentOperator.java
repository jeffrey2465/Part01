package pack03_operators.EX06_AssignmentOperator;

/*���Կ����� �� ���ǥ��*/

public class EX06_AssignmentOperator {
	
	public static void main(String[] args) {
		
		//#1. ���Կ����� �� ���ǥ��
		//@ ���Կ���
		int value1 = 3;
		value1 = value1 + 3;
		System.out.println(value1);
		System.out.println();
		
		//@ ���� + �ٸ� ������ ���ǥ��
		int value2;
		value2= 5; System.out.println(value2+=2); 	//7
		value2= 5; System.out.println(value2-=2);	//3
		value2= 5; System.out.println(value2*=2);	//10
		value2= 5; System.out.println(value2/=2);	//2
		value2= 5; System.out.println(value2&=2);	//0
		value2= 5; System.out.println(value2|=2);	//7
		value2= 5; System.out.println(value2<<=2);	//20
		value2= 5; System.out.println(value2>>=2);	//1
		value2= 5; System.out.println(value2>>>=2);	//1				
	}
}
