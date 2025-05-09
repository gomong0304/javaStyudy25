package ch01;

public class CompareExam {

	public static void main(String[] args) {
		// 비교 연산자는 동등비교와 크기비교가 있다.
		// == : 같냐?
		// != : 다르냐? -> !는 부정의 의미
		// >  : 초과, 크냐?
		// >= : 이상, 크거나 같냐?
		// <  : 미만, 작냐?
		// <= : 이하, 작거나 같냐?
		
		int num1 = 10;
		int num2 = 10;
		boolean result1 = ( num1 <= num2 ); // 자동으로 true false 구분
		System.out.println( result1 );
		// boolean은 참 거짓 값을 갖는다.
		
		char char1 = 'A'; // 유니코드로 A값은 65
		char char2 = 'a'; // 유니코드로 a값은 97
		boolean result2 = ( char1 > char2 );
		System.out.println( result2 );
		boolean result3 = ( num1 > char2 );
		System.out.println( "num1 > char2? " + result3 );
		
		char char3 = 43;
		char char4 = 42;
		System.out.println(char3);
		System.out.println(char4);
		// char 부분이 좀 헷갈리네 아리까리
		
		int v2 = 1;
		double v3 =1.0;
		System.out.println("===================================");
		System.out.println(v2 == v3);
		// 동등비교연산자에 타입이 다른 변수를 비교하면 자동으로 타입 변환이 일어난다
		// 이때 자동 타입 변환은 큰 값으로 타입을 매칭한다.
		
		double v4 = 0.1;
		float v5 = 0.1F;
		System.out.println("===================================");
		System.out.println(v4 ==v5);
		// 실수형은 부동 소수점 연산을 수행해서 근사값으로 표현을한다
		// 때문에 double과 float의 값이 다르다.
		// true로 나오게 하려면 강제 타입 변환을 해야한다.
		System.out.println( (float)v4 == v5 );
		System.out.println( v4 == (double)v5 ); // 왜 false이지?
		
		System.out.println( (int)(v4*10) == (int)(v5*10) );
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
