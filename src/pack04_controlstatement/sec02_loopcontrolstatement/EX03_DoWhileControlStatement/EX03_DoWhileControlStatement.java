package pack04_controlstatement.EX05_DoWhileControlStatement;

/*do-while�� �⺻��������, do-while vs. while�� ��*/

public class EX05_DoWhileControlStatement {

	public static void main(String[] args) {		
		//#1. do-while �⺻���� ���� 
		//@ �ݺ�ȸ���� 0�϶��� while�� do-while
		//while
		int a;
		a=0;
		while(a<0){
		  System.out.print(a+" ");
		  a++;
		}
		System.out.println();
		
		//do-while		
		a=0;
		do{
		  System.out.print(a+" ");
		  a++;
		} while(a<0);
		System.out.println();
		System.out.println();
		
		//@ �ݺ�ȸ���� 1�϶��� while�� do-while
		//while
		a=0;
		while(a<1){
		  System.out.print(a+" ");
		  a++;
		}
		System.out.println();
		
		//do-while		
		a=0;
		do{
		  System.out.print(a+" ");
		  a++;
		} while(a<1);
		System.out.println();
		System.out.println();
		
		//@ �ݺ�ȸ���� 10�϶��� while�� do-while
		//while
		a=0;
		while(a<10){
		  System.out.print(a+" ");
		  a++;
		}
		System.out.println();
		
		//do-while		
		a=0;
		do{
		  System.out.print(a+" ");
		  a++;
		} while(a<10);
		System.out.println();		
	}
}
