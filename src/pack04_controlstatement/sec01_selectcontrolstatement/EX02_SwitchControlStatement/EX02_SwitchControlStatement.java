package pack04_controlstatement.EX02_SwitchControlStatement;

/*switch �������(break ������, break ����, if�� ��ȯ)*/

public class EX02_SwitchControlStatement {

	public static void main(String[] args) {
		
		//#1. break�� ���Ե��� �ʴ� ��� 
		int value1=2;
		switch(value1){
		case 1:
		  System.out.print("A");
		case 2:
		  System.out.print("B");
		case 3:
		  System.out.print("C");
		default:
		  System.out.print("D");
		} //BCD
		System.out.println();
		
		//#2. break�� ���Ե� ���
		int value2=2;
		switch(value2){
		case 1:
		  System.out.print("A");
		  break;
		case 2:
		  System.out.print("B");
		  break;
		case 3:
		  System.out.print("C");
		  break;
		default:
		  System.out.print("D");
		} //B
		System.out.println();
		
		//@ if-else if...-else�� ��ȯ
		if(value2==1) {
			System.out.print("A");
		}
		else if(value2==2) {
			System.out.print("B");
		} 
		else if(value2==3) {
			System.out.print("C");
		}
		else {
			System.out.print("D");
		}				

	}
}
