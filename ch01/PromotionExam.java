package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		// �ڵ� Ÿ�� ��ȯ ����
		// ���� Ÿ�� ���� �ս� ���� ū Ÿ�� ������ ��ȯ�ϴ°�
		// byte(1byte : 8bit)
		// short(2byte : 16bit) & char(�����ڵ�� : ����ǥ��)
		// int(4byte : 32bit)
		// long(8byte : 64bit)   // ���̻� L�� �ٿ��� �� 
		
		// float(4byte : 32 bit) // ���⼭ ���� �Ǽ��� ���̻�F�� �ٿ��� ��
		// double(8byte : 64bit)
		
		byte byteValue = 10 ; // ����Ʈ Ÿ���� ������ 10���� �ִ´�.
		int intValue = byteValue ; // �ڵ� Ÿ�� ��ȯ�� �� ��? ������->ū�� �� ��ȯ�̶�
		System.out.println("�ڵ� Ÿ�� �� int : " + intValue);
		
		char charValue = '��' ; // ���� 10������ 44032->16������ AC00
		intValue = charValue ;
		System.out.println("�ڵ� Ÿ�� �� int : " + intValue);
		
		intValue = 500 ;
		long longValue = intValue ; //���� ��->ū�ŷ� ��ȯ
		System.out.println("�ڵ� Ÿ�� �� long  " + longValue);
		
		double doubleValue = intValue ;
		System.out.println("�ڵ�Ÿ�� �� double : " + doubleValue);

		
	}

}
