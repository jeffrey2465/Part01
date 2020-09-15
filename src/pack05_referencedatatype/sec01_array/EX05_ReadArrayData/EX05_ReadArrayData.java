package pack05_referencedatatype.sec01_array.EX05_ReadArrayData;

import java.util.Arrays;

/*1���� �迭�� ���Ұ� ���*/

public class EX05_ReadArrayData {
	
	public static void main(String[] args) {		
		int[] array = new int[]{3,4,5,6,7};
		
		//#1. �迭�� ���� ���ϱ� (length)
		System.out.println(array.length); //5
		System.out.println();
		
		//#2. ��¹��1. �迭 �ϳ��� ����ϱ�
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println();
		
		//#3. ��¹��2. for �ݺ������� ����ϱ�
		for(int i=0; i<array.length; i++)
			System.out.println(array[i]);
		System.out.println();
		
		//#4. ��¹��3. for-each �ݺ��� ����Ͽ� ����ϱ�
		//for(���� �ϳ��� ���Ҹ� ������ �� �ִ� ����:���հ�ü) {} for each ����	
		for (int k : array)
			System.out.println(k);		
		
		//#5. ����ϱ� 4 : Arrays ��ƿ��Ƽ Ŭ���� ����ϱ�
		System.out.println(Arrays.toString(array)); 
	}
}
