package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		// ���ݱ��� ��� ���� Ÿ���� �⺻Ÿ������ �ڹٿ��� ��ü���� ����
		// String�� ���� ��ü�� �����ϰ� ������ ������ ���ǻ� �����ؼ� ���
		
		String strval1 = "������";
		String strval2 = "������";
		String strval3 = new String( "������" );
		
		System.out.println( strval1 == strval2 );
		System.out.println( strval1 == strval3 );
		
		boolean eq1 = strval1.equals( strval3 );
		System.out.println( "1�� 3�� eqals�޼��� ��� ��� : " + eq1 );
		// String���� �񱳸� �Ҷ��� == ���ٴ� equals �޼��带 ����ؼ� �˾ƺ��°� ��Ȯ�ϴ�.
	
		
	}

}
