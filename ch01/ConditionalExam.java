package ch01;

public class ConditionalExam {

	public static void main(String[] args) {
		// ���� �����ڴ� 3���� ���� ���� ������
		// if�� ���� ���ϴ� �����ڷ� ���� Ȱ��
		// ���ǽ� ? ��(����) : ����(����) -> �⺻ ����
		
		int x = 80;
		String y = ( x > 80 ) ? "�հ�" : "���հ�";
		System.out.println( x + " ������ " + y + "�Դϴ�." );
		
		int eng = 95;
		int mat = 75;
		int total = x + eng + mat;
		int avg = total / 3;
		System.out.println( total );
		System.out.println((double)avg);
	
	}

}
