package ch01;

import java.util.Scanner;

public class LogicalAndExam {

	public static void main(String[] args) {
		// ���� �׽�Ʈ��
		// & ������ ��κ� ������ 2�� �̻��� ��� �Ǵ��ϴ� �뵵�� ���
		// ���� ��� id�� pw�� �Ѵ� �¾ƾ� �α����� �Ǵ� ���
		// (������ �ִ� id == Ű����� �Է��� id) & (������ �ִ� pw == Ű����� �Է��� pw)
		//              false                           false             = false
		//              false                           true              = false
		//              true                            false             = false
		//              true                            true              = true
		
		Scanner input = new Scanner(System.in);
		// Ű����� �Է��� �� �ִ� ��ü�� �����Ѵ�
		System.out.println("������ �Է��Ͻø� ��ҹ��ڳ� ���� �Ǵ��� �ص帱����.");
		System.out.println("�����ڵ�ǥ�� �����Ͽ� ���α׷��� �����Ͽ����ϴ�.");
		System.out.print("���� �Է� >>> ");
		int charCode = input.nextInt(); // Ű����� ���� �ִ� �κб��� �ϼ�, �Ǵ��ϴ� �κ��� ��������
		
		if((charCode >= 65) & (charCode <= 90)) {
		System.out.println("���� �Էµ� ���ڴ� �빮�� �Դϴ�. : " + (char)charCode);
		} else if ((charCode < 48 ) && ())
		
		
		
		
		
	}

}
