package ch01;

public class CompareExam {

	public static void main(String[] args) {
		// �� �����ڴ� ����񱳿� ũ��񱳰� �ִ�.
		// == : ����?
		// != : �ٸ���? -> !�� ������ �ǹ�
		// >  : �ʰ�, ũ��?
		// >= : �̻�, ũ�ų� ����?
		// <  : �̸�, �۳�?
		// <= : ����, �۰ų� ����?
		
		int num1 = 10;
		int num2 = 10;
		boolean result1 = ( num1 <= num2 ); // �ڵ����� true false ����
		System.out.println( result1 );
		// boolean�� �� ���� ���� ���´�.
		
		char char1 = 'A'; // �����ڵ�� A���� 65
		char char2 = 'a'; // �����ڵ�� a���� 97
		boolean result2 = ( char1 > char2 );
		System.out.println( result2 );
		boolean result3 = ( num1 > char2 );
		System.out.println( "num1 > char2? " + result3 );
		
		char char3 = 43;
		char char4 = 42;
		System.out.println(char3);
		System.out.println(char4);
		// char �κ��� �� �򰥸��� �Ƹ��
		
		int v2 = 1;
		double v3 =1.0;
		System.out.println("===================================");
		System.out.println(v2 == v3);
		// ����񱳿����ڿ� Ÿ���� �ٸ� ������ ���ϸ� �ڵ����� Ÿ�� ��ȯ�� �Ͼ��
		// �̶� �ڵ� Ÿ�� ��ȯ�� ū ������ Ÿ���� ��Ī�Ѵ�.
		
		double v4 = 0.1;
		float v5 = 0.1F;
		System.out.println("===================================");
		System.out.println(v4 ==v5);
		// �Ǽ����� �ε� �Ҽ��� ������ �����ؼ� �ٻ簪���� ǥ�����Ѵ�
		// ������ double�� float�� ���� �ٸ���.
		// true�� ������ �Ϸ��� ���� Ÿ�� ��ȯ�� �ؾ��Ѵ�.
		System.out.println( (float)v4 == v5 );
		System.out.println( v4 == (double)v5 ); // �� false����?
		
		System.out.println( (int)(v4*10) == (int)(v5*10) );
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
