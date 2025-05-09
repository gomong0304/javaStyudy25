package ch01;

public class StringConcatExam {

	public static void main(String[] args) {
		// 문자열 연결 테스트
		// print( "테스트" + "입니다." ) -> 중간에 +가 연결 연산자이다.
		// 피연산자 중 한쪽이 문자열이면, +연산자는 문자열 연결로 반응한다.
		
		String str1 = "kor" + 17.0; // 17.0을 문자로 생각
		System.out.println(str1);
		
		String str2 = str1 + " 특징 : ";
		System.out.println(str2);
		
		String str3 = str2 + 3.0 + 3; 
		System.out.println(str3);
		
		String str4 = 3.0 + 3.0 + "kor";
		System.out.println(str4);
		
		String str5 = 'm' + 3.0 + "kor"; 
		// '가'는 숫자로 나오고->char로 인식하기 때문에 "가"로 써야 한글로 나온다..
		System.out.println(str5);
	}

}
