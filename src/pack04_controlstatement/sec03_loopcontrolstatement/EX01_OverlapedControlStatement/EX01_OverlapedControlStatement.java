package pack04_controlstatement.sec03_loopcontrolstatement.EX01_OverlapedControlStatement;

/*����� �ߺ�*/

public class EX01_OverlapedControlStatement {
	
	public static void main(String[] args) {		
		//#1. if-if �ߺ�
		int value1=5, value2=3;
		if(value1>5){
			if(value2<2){
				System.out.println("����1");
			}
			else{
				System.out.println("����2");
			}
		}
		else {
			System.out.println("����3"); //����
		}		
		
		//#2. switch-for �ߺ�
		int value3=2;
		switch(value3){
		case 1:
			for(int k=0; k<10; k+=2){
				System.out.print(k+" ");				
			}
			break;
		case 2:
			for(int k=10; k>0; k-=2){
				System.out.print(k+" ");				
			}
			break;
		} //10 8 6 4 2		
		
		//#3. for-for-if �ߺ�
		for(int i=0; i<3; i++){
			for(int j=0; j<5; j++){
				System.out.println(i+" "+j);
				if(i==j){
					System.out.println("i=j");					
				}
			}
		}		
	}
}
