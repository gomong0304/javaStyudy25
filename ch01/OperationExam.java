package ch01;

public class OperationExam {

	public static void main(String[] args) {
		// �����ڴ� ���α׷����� �����͸� ó���Ͽ� ����� ����
		// �ǿ����ڴ� ����, ���� ���Ѵ�
		
		
		// ���� ���� (������ 1���ΰ�)
		
		int x = 10 ;
		x++ ; // x = x + 1�� �ǹ��Ѵ�.
		x-- ; // x = x - 1�� �ǹ��Ѵ�. �̶��� x�� ������ ���� x+1���� ������!
		--x ; // ���� ������ ���ļ� x = 10�̿��µ� --x -> x = -1 + x
		
		System.out.println("x�� ������ : " + x ); // x = 9
		
		// ���� ���� (������ 2���ΰ�)
		
		int y = -5 ;
		int result = x + y ;
		
		System.out.println("===============================");
		System.out.println("x + y : " + result);
		
		
		// ���� ���� (������ 3���ΰ�)
		
		int z = 2 ;
		int result1 = result * z ;
		
		System.out.println("===============================");
		System.out.println("(x + y) * z : " + result1);
		
		boolean result2 = (result1 > 10) ? true : false ; 
		
		System.out.println("result1 > 10 ��� : " + result2);
		
		String result3 = (result1 > 10 ) ? "�´�" : "�ƴϴ�" ;
		
		System.out.println("result1 > 10 ��� : " + result3);
		
		
		int x1 = 10 * 10 ;
		double x2 = 10 / 3 ;
		x2 = (double)10 / 3 ;
		double x3 = 10 % 3 ;
		
		
		System.out.println("10 x 10 = " + x1 + " �̰�" + " 10 / 3 = " + x2 + " �̴�.");
 		System.out.println("10�� 3���� ���� �������� = " + x3);
	}

}
