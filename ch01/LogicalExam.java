package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		// ������ �����ڴ� ũ�� 5���� ������ �ִ�.
		// & : �� �� -> ~�̰� 2���� ������ ��� ���� ��쿡 ��
		// | : �� �� -> ~�̰ų� 2���� �� �Ѱ��� ���� ��쿡 ��
		// ! : �� ���� -> ���� ������ ����
		// ^ : ��Ÿ�� �� �� -> ������ �������� 1 + 1 = ���� ����� ����
		
		String loginid = "abc";
		String loginpw = "1234";
		
		Scanner input = new Scanner(System.in);
		//�ֿܼ� Ű����� ���� �о� ���� ��ü�� ����
		
		System.out.println( "�α����� id�� �Է��ϼ��� : " );
		String id = input.nextLine();
		System.out.println("�Է��Ͻ� id�� : " + id + " �Դϴ�.");
		
		System.out.println("�α����� ��ȣ�� �Է��ϼ��� : ");
		String pw = input.nextLine();
		System.out.println("==���� ���Դϴ�.==");
		
		
		if ( (loginid.equals(id)) & (loginpw.equals(pw)) ) {
			System.out.println("id�� pw�� ��ġ�մϴ�.");
			System.out.println("�α��� ����~!");
		}	else { 
			System.out.println("id�� pw�� �ٸ��ϴ�.");
			System.out.println("�α��� ����!");
			}//if�� ����		
	}//main �޼��� ����
}//Class ����
