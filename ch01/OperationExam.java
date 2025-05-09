package ch01;

public class OperationExam {

	public static void main(String[] args) {
		// 연산자는 프로그램에서 데이터를 처리하여 결과를 산출
		// 피연산자는 변수, 값을 말한다
		
		
		// 단항 연산 (변수가 1개인것)
		
		int x = 10 ;
		x++ ; // x = x + 1을 의미한다.
		x-- ; // x = x - 1을 의미한다. 이때의 x는 위에서 계산된 x+1값이 내려옴!
		--x ; // 위에 과정을 거쳐서 x = 10이였는데 --x -> x = -1 + x
		
		System.out.println("x의 최종값 : " + x ); // x = 9
		
		// 이항 연산 (변수가 2개인것)
		
		int y = -5 ;
		int result = x + y ;
		
		System.out.println("===============================");
		System.out.println("x + y : " + result);
		
		
		// 삼항 연산 (변수가 3개인것)
		
		int z = 2 ;
		int result1 = result * z ;
		
		System.out.println("===============================");
		System.out.println("(x + y) * z : " + result1);
		
		boolean result2 = (result1 > 10) ? true : false ; 
		
		System.out.println("result1 > 10 결과 : " + result2);
		
		String result3 = (result1 > 10 ) ? "맞다" : "아니다" ;
		
		System.out.println("result1 > 10 결과 : " + result3);
		
		
		int x1 = 10 * 10 ;
		double x2 = 10 / 3 ;
		x2 = (double)10 / 3 ;
		double x3 = 10 % 3 ;
		
		
		System.out.println("10 x 10 = " + x1 + " 이고" + " 10 / 3 = " + x2 + " 이다.");
 		System.out.println("10을 3으로 나눈 나머지는 = " + x3);
	}

}
