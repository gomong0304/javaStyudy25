package ch01;

public class VarExam {

	public static void main(String[] args) {
		// 변수 선언 테스트
		
		int x = 1 ; // int=정수타입 정수타입 x 변수에 1의 값을 넣을꺼다.
		
		char y = 65 ; // char는 문자 타입인데 숫자로 변환되기도 한다
		// 컴퓨터는 문자를 유니코드로 변환해서 처리를 한다
		// 유니코드 표에 65는 A를 의미한다
		
		char z = 'A' ; // char 타입의 z변수에 문자 A를 넣음
		
		System.out.println("int x = " + x);
		System.out.println("char y = " + y);
		System.out.println("char z = " + z);
		
		// char z1 = 'b' ; // 문자로 쓸건지 문자열로 쓸건지 결정이 필요
		
		
		
		//변수의 선언
		
		int x1 ; // 초기화 안된 변수
		x1 = 10 ; // x1의 초기값을 10으로 넣음
		System.out.println("x1의 초기값 : " + x1);
		
		
		// 다중 변수 선언
		
		int kor, mat, eng, total, avg ; //초기화 안된 변수 5개
		 
		kor = 91 ;
		mat = 25 ;
		eng = 89 ;
		total = kor + mat + eng ; // 총점
		avg = total / 3 ; // 평균
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		// 평균 값의 소수점이 사라짐 ->int는 정수이기 때문에 소수점이 날라감
		// 이러면 석차를 구현하는 코딩에서 문제 발생
		
		// 변수 작성 규칙
		// 변수는 첫글자가 영문이여야 되며 $, _을 사용할 수 있다.
		// 관례로 첫글자 영문은 소문자로, 두번째 단어부터는 대문자로 시작 (Ex carBody, northFace)
		
		// int price, $price, price ; // 가급적이면 특수문자 사용 제외하자
		// int 1v ;
		// int @speed ; 
		// int $#value ; 
		
		char firstname ; // 초기값 설정 안된 변수 
		firstname = '김' ; //초기값 김으로 넣음
		char firstName  = '이' ; // 초기값 설정 이를 넣음
		
		System.out.println("성 : " + firstname);
		System.out.println("성 : " + firstName);
		// 변수 명에 대소문자는 서로 다른 변수로 인식
		
		//변수명에 예약어는 사용할 수 없다.
		//예약어는 자바에서 이미 사용중인 영문(변수, class)
		
		//int char와 같은 단어는 예약어
		
		//리터럴 : 직접 입력되어있는 값
		
		int literal1 = 75 ; //10진수
		int literal2 = 075 ; //8진수
		int literal3 = 0b0011 ; //2진수
		int literal4 = 0xA ; //16진수
		
		System.out.println("10진수  75 : " + literal1);
		System.out.println("8진수  75 : " + literal2);
		System.out.println("2진수  0011 : " + literal3);
		System.out.println("16진수  A : " + literal4);
		
		
		
		
		

	}

}
