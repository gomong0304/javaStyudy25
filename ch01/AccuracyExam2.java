package ch01;

public class AccuracyExam2 {

	public static void main(String[] args) {
		// �׷��� �Ҽ����� ���� ���ؼ� ��� 1���� 10�� ���ؼ� Ȱ���غ��ô�.
		// int Ÿ�Ը� ����غ��ڴ� �ǹ�
		
		int apple = 1 ;
		int totalPieces = apple * 10 ;
		int number = 7 ;
		int temp = totalPieces - number ; 
		
		double result = temp / 10.0 ; 
		System.out.println("��� ���� ���� �� : " + result); 
		
		// ������ ����ߴ����� ������� �������� ���ؼ� 10.0���� ����
		// 10.0�� �Ǽ����� double ���
	}

}
