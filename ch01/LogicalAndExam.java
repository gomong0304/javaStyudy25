package ch01;

import java.util.Scanner;

public class LogicalAndExam {

	public static void main(String[] args) {
		// 논리곱 테스트용
		// & 연산은 대부분 조건이 2개 이상일 경우 판단하는 용도로 사용
		// 예를 들어 id와 pw가 둘다 맞아야 로그인이 되는 경우
		// (가지고 있던 id == 키보드로 입력한 id) & (가지고 있던 pw == 키보드로 입력한 pw)
		//              false                           false             = false
		//              false                           true              = false
		//              true                            false             = false
		//              true                            true              = true
		
		Scanner input = new Scanner(System.in);
		// 키보드로 입력할 수 있는 객체를 생성한다
		System.out.println("정수를 입력하시면 대소문자나 숫자 판단을 해드릴께요.");
		System.out.println("유니코드표를 참고하여 프로그램을 제작하였습니다.");
		System.out.print("숫자 입력 >>> ");
		int charCode = input.nextInt(); // 키보드로 숫자 넣는 부분까지 완성, 판단하는 부분을 만들어야함
		
		if((charCode >= 65) & (charCode <= 90)) {
		System.out.println("현재 입력된 숫자는 대문자 입니다. : " + (char)charCode);
		} else if ((charCode < 48 ) && ())
		
		
		
		
		
	}

}
