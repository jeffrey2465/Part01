package pack04_controlstatement.EX08_ContinueControlKeyword;

/*continue ����Ű���� (���� �ݺ��� �� ���� �ݺ���)*/

public class EX08_ContinueControlKeyword {
	
	public static void main(String[] args) {
		// #1. ���� loop continue
		for (int i = 0; i < 10; i++) {
			continue;
			// System.out.println(i); //����
		}

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			continue;
		} // 0~9
		System.out.println();

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.print(i + " ");
		} // 0,1..4,6,...9
				
		// #2. ���� loop continue
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					continue;
				}
				System.out.println(i + ", " + j);
			}
		}
		System.out.println();

		POS1: for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				if (j == 3) {
					continue POS1;
				}
				System.out.println(i + ", " + j);
			}
		}
	}
}
