package pack05_referencedatatype.sec01_array.EX10_ArgumentOfMainMethod;

public class EX10_ArgumentOfMainMethod {
	public static void main(String[] args) {
		
		//#1. args �迭�� ���� ���ϱ�
		int length = args.length;
		System.out.println("length = "+length);
		
		//#2. �Ű����� �� ��� ��� 1
		for (int i=0; i<args.length; i++) {
			System.out.println(args[i]);
		}
		
		//#2. �Ű����� �� ��� ��� 2
		for (String s : args) {
			System.out.println(s);
		}
		
	}
	
}
