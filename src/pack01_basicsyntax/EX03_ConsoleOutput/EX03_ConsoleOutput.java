package pack01_basicsyntax.EX03_ConsoleOutput;

public class EX03_ConsoleOutput {
	public static void main(String[] args) {
		
		//#1. System.out.println(...)
		System.out.println("ȭ�����");
		System.out.println("ȭ��"+"���");
		System.out.println(3.8);
		System.out.println(3+5);
		System.out.println("ȭ��"+3);
		System.out.println("ȭ��"+3+5);
		System.out.println(3+5+"ȭ��");
		System.out.println();
		
		int a = 3;
		String b = "ȭ��";
		System.out.println(a);
		System.out.println(b);
		System.out.println(b+"���");
		System.out.println(a+b+"���");
		System.out.println();
		
		//#2. System.out.print(...)
		System.out.print("ȭ��");
		System.out.print("���");
		System.out.print(3);
		System.out.print("\n");
		System.out.print("\n");
		
		//#3. System.out.print(...)
		System.out.printf("%d\n",30);//10����
		System.out.printf("%o\n",30);//8����
		System.out.printf("%x\n",30);//16����

		System.out.printf("%s\n","���");
		System.out.printf("%f\n",5.8);
		System.out.printf("%4.2f\n",5.8);
		System.out.printf("%d�� %4.2f\n",4,5.8);
		
	}
}
