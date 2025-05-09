package ch01;

import java.util.Scanner;

public class LogicalExam {

	public static void main(String[] args) {
		// 논리적인 연산자는 크게 5가지 유형이 있다.
		// & : 논리 곱 -> ~이고 2가지 변수가 모두 참일 경우에 참
		// | : 논리 합 -> ~이거나 2가지 중 한개라도 참일 경우에 참
		// ! : 논리 부정 -> 참과 거짓을 반전
		// ^ : 배타적 논리 합 -> 논리합의 마지막인 1 + 1 = 으로 결론이 난다
		
		String loginid = "abc";
		String loginpw = "1234";
		
		Scanner input = new Scanner(System.in);
		//콘솔에 키보드로 값을 밀어 넣을 객체를 생성
		
		System.out.println( "로그인할 id를 입력하세요 : " );
		String id = input.nextLine();
		System.out.println("입력하신 id는 : " + id + " 입니다.");
		
		System.out.println("로그인할 암호를 입력하세요 : ");
		String pw = input.nextLine();
		System.out.println("==검증 중입니다.==");
		
		
		if ( (loginid.equals(id)) & (loginpw.equals(pw)) ) {
			System.out.println("id나 pw가 일치합니다.");
			System.out.println("로그인 성공~!");
		}	else { 
			System.out.println("id나 pw가 다릅니다.");
			System.out.println("로그인 실패!");
			}//if문 종료		
	}//main 메서드 종료
}//Class 종료
