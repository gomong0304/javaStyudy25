package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// ���� Ÿ�� ��ȯ(Casting)
		// ū ũ���� Ÿ���� ���� ũ���� Ÿ������ �ڵ� ��ȯ�� �� ����.
		// int(21��) 32bit -> byte 8bit Ÿ������ ������ ������ �߻��Ѵ�.
		// ���� ��ġ���� ������ �����ϴ� ���� ���� Ÿ�� ��ȯ�̶�� ��
		
		int intValue = 123456789 ;
		byte byteValue = (byte)intValue ; // ������ byte Ÿ������ ��ȯ�ߴ�
		
		System.out.println("int Ÿ�� �� ��� : " + intValue);
		System.out.println("byte Ÿ�� �� ��� : " + byteValue);
		
		int kor = 100 ;
		int eng = 99 ;
		int mat = 97 ;
		
		int total = kor + eng + mat ;
		System.out.println("=========����ǥ==========");
		System.out.println(" ���� + ���� + ���� = ���� : " + total);
		
 		int avg = total / 3 ; // int ���ÿ��� �����θ� ���
 		System.out.println("��� ���� : " + avg); // ������ �ڵ� Ÿ�� ��ȯ
 		
 		double avg2 = total / 3 ;
 		System.out.println("��� ���� : " + avg2);
 		
 		avg2 = (double)total / 3 ; // ���� Ÿ�Ժ�ȯ�Ͽ���
 		System.out.println("��� ���� : " + avg2);
 		
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
