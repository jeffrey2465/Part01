﻿package pack05_referencedatatype.sec01_array.EX07_RectangleValueAssignment;

/*2차원 정방행렬 배열의 4가지 원소값 대입 방법*/

public class EX07_RectangleValueAssignment {
	
	public static void main(String[] args) {
		
		//#1. 배열 원소의 값 대입 (방법 1)
		int[][] array1 = new int[2][3];		
		array1[0][0]=1;
		array1[0][1]=2;
		array1[0][2]=3;
		array1[1][0]=4;
		array1[1][1]=5;
		array1[1][2]=6;		
		System.out.println(array1[0][0] + " "+array1[0][1] + " "+array1[0][2]);
		System.out.println(array1[1][0] + " "+array1[1][1] + " "+array1[1][2]);
		
		int[][] array2;
		array2 = new int[2][3];
		array2[0][0]=1;
		array2[0][1]=2;
		array2[0][2]=3;
		array2[1][0]=4;
		array2[1][1]=5;
		array2[1][2]=6;
		System.out.println(array2[0][0] + " "+array2[0][1] + " "+array2[0][2]);
		System.out.println(array2[1][0] + " "+array2[1][1] + " "+array2[1][2]);
		
		System.out.println();
				
		//#2. 배열 원소의 값 대입 (방법 2)
		int[][] array3 = new int[][]{{1,2,3},{4,5,6}};
		System.out.println(array3[0][0] + " "+array3[0][1] + " "+array3[0][2]);
		System.out.println(array3[1][0] + " "+array3[1][1] + " "+array3[1][2]);
		
		int[][] array4;
		array4 = new int[][]{{1,2,3},{4,5,6}};
		System.out.println(array4[0][0] + " "+array4[0][1] + " "+array4[0][2]);
		System.out.println(array4[1][0] + " "+array4[1][1] + " "+array4[1][2]);
		
		System.out.println();
				
		//#3. 배열의 원소값 대입 (방법3)
		int[][] array5 = {{1,2,3},{4,5,6}};
		System.out.println(array5[0][0]+ " "+array5[0][1]+ " "+array5[0][2]+ " ");
		System.out.println(array5[1][0]+ " "+array5[1][1]+ " "+array5[1][2]+ " ");
		
//		int[][] array6;
//		array6 = {{1,2,3},{4,5,6}}; //불가능
//		System.out.println(array6[0][0]+ " "+array6[0][1]+ " "+array6[0][2]+ " ");
//		System.out.println(array6[1][0]+ " "+array6[1][1]+ " "+array6[1][2]+ " ");			
	}
}
