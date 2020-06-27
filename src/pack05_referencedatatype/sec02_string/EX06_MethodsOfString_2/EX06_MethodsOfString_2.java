package pack05_referencedatatype.sec02_string.EX06_MethodsOfString_2;

import java.util.Arrays;

/*String Ŭ������ �ֿ� �޼���2*/

public class EX06_MethodsOfString_2 {
	public static void main(String[] args) {						
		//#5. ���ڿ� ���� 
		//(toLowerCase(), toUpperCase(), replace(), substring(), split(), trim())		
		//@toLowerCase(), toUpperCase()
		String str1 = "Java Study";
		System.out.println(str1.toLowerCase()); //java study
		System.out.println(str1.toUpperCase()); //JAVA STUDY
		
		//@replace(.,.)
		System.out.println(str1.replace("Study", "����")); //Java ����
		
		//@substring(.)
		System.out.println(str1.substring(0,5)); //Java
		
		//@split(.)
		String[] strArray = "abc/def-ghi jkl".split("/|-| ");
		System.out.println(Arrays.toString(strArray)); //[abc, def, ghi, jkl]
		
		//@trim()
		System.out.println("  abc  ".trim()); //abc
		System.out.println();
		
		//#6. ���ڿ� ����� (equals(), equalsIgnoreCase(.))
		String str2 = new String("Java");
		String str3 = new String("Java");
		String str4 = new String("java");
		
		//@ == �޸𸮹��� �� (stack �޸� �� ��)
		System.out.println(str2==str3); //false
		System.out.println(str3==str4); //false
		System.out.println(str2==str4); //false
		System.out.println();
		
		//@ equals(.), equalsIgnoreCase(.) ���� ��
		System.out.println(str2.equals(str3));	//true
		System.out.println(str3.equals(str4));	//false
		System.out.println(str3.equalsIgnoreCase(str4));	//true											
	}
}
