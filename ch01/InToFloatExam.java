package ch01;

public class InToFloatExam {

	public static void main(String[] args) {
		// float�� 32bit�� �Ǿ��ִ� �ε��Ҽ��� ���꿡 ����
		// ����Ÿ���� �Ǽ�Ÿ������ ��ȯ �� �� �ս��� �߻��Ѵ�.
		// int(32bit) = float(32bit)
		
		int num1 = 123456781 ;
		int num2 = 123456780 ;
		
		float num3 = num2 ; // int Ÿ�� ���� float�� ����
		
		System.out.println(num1); // 123456781
		System.out.println(num2); // 123456780
		System.out.println(num3); // 1.23456784E8
	}

}
