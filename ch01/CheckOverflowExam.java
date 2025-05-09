package ch01;

public class CheckOverflowExam {

	public static void main(String[] args) {
		// �츮�� ����Ÿ���� Ű����� �Է� �޾� ó���ϴ� ���� ��Ģ�̴�.
		// �Է��Ҷ� ������ üũ�� �ʿ伺�� �ִ�.
		// main �޼��� �̿ܿ� �Ǵٸ� �Լ��� �߰��Ͽ� ����Ѵ�.
		
		int result = safeAdd(70, 80);
		System.out.println(result);
		
	}// main �޼��� ����
	
	public static int safeAdd(int left, int right) {
		if (right > 0) { // true ������ ���� 0���� Ŀ�ߵ�
		  if (left > (Integer.MAX_VALUE - right)) {
		   // Integer.MAX_VALUE int Ÿ���� �ִ밪 �� 21��
		   // int Ÿ�Կ� �ִ밪���� ������ ���� ������ ���� ������ �۾ƾ��Ѵ�.
		   throw new ArithmeticException("�����÷ο�߻�");
		   // ����ó�� ���� �߻��� ��,
		  } // ���� if�� ����
		}else {// false �϶�
				if (left < (Integer.MIN_VALUE - right)) {
				// Integer.MIN_VALUE int Ÿ���� �ּҰ� �� -21��
				throw new ArithmeticException("�����÷ο�߻�");			
				}// ���� if�� ����
		}// �����÷ο� if�� ����
		
		return left + right ;
	} // safeAdd �޼��� ����
}//Class ����

