package ch01;

public class StringConcatExam {

	public static void main(String[] args) {
		// ���ڿ� ���� �׽�Ʈ
		// print( "�׽�Ʈ" + "�Դϴ�." ) -> �߰��� +�� ���� �������̴�.
		// �ǿ����� �� ������ ���ڿ��̸�, +�����ڴ� ���ڿ� ����� �����Ѵ�.
		
		String str1 = "kor" + 17.0; // 17.0�� ���ڷ� ����
		System.out.println(str1);
		
		String str2 = str1 + " Ư¡ : ";
		System.out.println(str2);
		
		String str3 = str2 + 3.0 + 3; 
		System.out.println(str3);
		
		String str4 = 3.0 + 3.0 + "kor";
		System.out.println(str4);
		
		String str5 = 'm' + 3.0 + "kor"; 
		// '��'�� ���ڷ� ������->char�� �ν��ϱ� ������ "��"�� ��� �ѱ۷� ���´�..
		System.out.println(str5);
	}

}
