package ch01;

public class IntToFloatExam2 {

	public static void main(String[] args) {
		
		int num1 = 123456780 ;
		int num2 = 123456780 ;
		
		float num3 = num2 ;
		num2 = (int) num3 ;
		
		System.out.println("num1 : " + num1) ; // 123456780
		System.out.println("num2 : " + num2) ; // 123456784
		System.out.println("num3 : " + num3) ; // 1.23456784E8
		// num2�� int -> float���ϸ鼭 ���� ������ �޶����� num1, num2�� ���� �޶���

		int result = num1 - num2 ;
		System.out.println("==============================");
		System.out.println("float���� �ٳ�� �Ŀ� num2 �� �����");
		System.out.println("num1 - num2 : " + result);
		
		// float�� �Ҽ����� ����ϱ� ������ int-> float ���� ������ �Ͼ
		// �̷����� float ���� �� ū double �� ����ؼ� �ذ��غ���

	}

}
