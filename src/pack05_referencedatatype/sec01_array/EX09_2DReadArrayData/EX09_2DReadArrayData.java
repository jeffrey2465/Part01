package pack05_referencedatatype.sec01_array.EX09_2DReadArrayData;

/*2���� �迭�� ���Ұ� ���*/

public class EX09_2DReadArrayData {
	
	public static void main(String[] args) {		
		//#1. 2���� �迭�� ���� ���ϱ� (length)
		//@1-1. �������
		int[][] array1 = new int[2][3];
		System.out.println(array1.length); //2
		System.out.println(array1[0].length); //3
		System.out.println(array1[1].length); //3
		
		System.out.println();
		
		//@1-2. ���������
		int[][] array2 = new int[][] {{1,2},{3,4,5}};
		System.out.println(array2.length); //2
		System.out.println(array2[0].length); //2
		System.out.println(array2[1].length); //3
		
		System.out.println();
		
		//#2. ��¹��1. �迭 �ϳ��� ����ϱ�		
		System.out.println(array2[0][0]);
		System.out.println(array2[0][1]);
		System.out.println(array2[1][0]);
		System.out.println(array2[1][1]);
		System.out.println(array2[1][2]);		
		System.out.println();		
		
		//#3. ��¹��2. for �ݺ������� ����ϱ�
		for(int i=0; i<array2.length; i++)
			for(int j=0; j<array2[i].length; j++)
				System.out.println(array2[i][j]); //1,2,3,4,5
		System.out.println();
				
		//#4. ��¹��3. for-each �ݺ��� ����Ͽ� ����ϱ�
		for (int[] array : array2) {
			for(int k : array){
				System.out.println(k); //1,2,3,4,5
			}
		}									
	}
}
