package pack04_controlstatement.EX04_WhileControlStatement;

/*while �ݺ������ �⺻��������, for�� ��ȯ, Ư���� ����, ���ѷ��� Ż��*/

public class EX04_WhileControlStatement {
	
	public static void main(String[] args) {		
		//#1. while �⺻���� ���� 
		int a=0;
		while(a<10){
		  System.out.print(a+" ");
		  a++;
		} //0 1 ... 9
		System.out.println();
		
		//@ for���� ��ȯ
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
		} //0 1 ... 9
		System.out.println();
		
		int b=10;
		while(b>0) {
			System.out.print(b+" ");
			b-=2;
		} //10 8 ... 2
		System.out.println();
		
		//@ for���� ��ȯ
		for(int i=10; i>0; i-=2) {
			System.out.print(i+" ");
		} //0 1 ... 9
		System.out.println();
		
		//#2. while���� Ư���� ���� (���ѷ���)		
		//while(true) {
		//System.out.println("���ѷ���");
		//}
		
		//#3. ���ѷ������� Ż���ϱ� (break)
		int c=0;
		while(true){
		  if(c>10){
		    break;
		  }
		  System.out.print(c+" ");
		  c++;
		} //0 1 2 ... 10		
	}
}
