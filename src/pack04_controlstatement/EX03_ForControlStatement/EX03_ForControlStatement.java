package pack04_controlstatement.EX03_ForControlStatement;

public class EX03_ForControlStatement {
	public static void main(String[] args) {
		
		//#1. for �⺻���� ���� 
		int a;
		for(a=0; a<3; a++) {
			System.out.print(a+" ");
		} //0 1 2
		System.out.println();
		
		for(int i=0; i<3; i++) {
			System.out.print(i+" ");
		} //0 1 2
		System.out.println();
		
		for(int i=0; i<100; i++){
		  System.out.print(i+" ");
		} //0 1 2 ...100
		System.out.println();
		
		for(int i=10; i>0; i--){
		  System.out.print(i+" ");
		} //10 9 ... 1
		System.out.println();
		
		for(int i=0; i<10; i+=2){
		  System.out.print(i+" ");
		} //0 2 4 6 8
		System.out.println();
		
		for(int i=0,j=0; i<10; i++,j++){
		  System.out.print(i+j+" ");
		} //0 2 4 ... 18
		System.out.println();
		
		//#2. for���� Ư���� ���� (���ѷ���)
		//@ ���ѷ��� 1
//		for(int i=0; ; i++){
//		  System.out.println("���ѷ���");
//		}
		//@ ���ѷ��� 2
//		for(;;) {
//		  System.out.println("���ѷ���");
//		}
		
		//#3. ���ѷ������� Ż���ϱ� (break)
		for(int i=0; ; i++){
		  if(i>10){
		    break;
		  }
		  System.out.println(i+" ");
		}

	}
}
