package pack05_referencedatatype.sec01_array.EX01_ArrayDefinition;

/*1���� �迭�� �� ���� �������� �پ��� �迭 ����*/

public class EX01_ArrayDefinition {
	public static void main(String[] args) {
		
		//#1. �迭�� ���� ��� 1
		int[] array1 = new int[3];
		int[] array2;
		array2 = new int[3];
		
		//#2. �迭�� ���� ��� 2
		int array3[] = new int[3];
		int array4[];
		array4=new int[3];
		
		//#3. �پ��� �迭 ���� (�⺻�ڷ�迭, �����ڷ�迭)
		boolean[] array5 = new boolean[3];
		int[] array6 = new int[5];
		double[] array7 = new double[7];
		String[] array8 = new String[9]; // �����ڷ�迭
		
	}
}
