package test;

public class Lambda {

	public static void main(String[] args) {
		Calc minNum = (x, y) -> x < y ? x : y; // �߻� �޼ҵ��� ����
		 System.out.println(minNum.min(3, 4));  // �Լ��� �������̽��� ���
	}

}
