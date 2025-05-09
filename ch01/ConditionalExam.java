package ch01;

public class ConditionalExam {

	public static void main(String[] args) {
		// 삼항 연산자는 3개의 항을 가진 연산자
		// if와 같이 비교하는 연산자로 많이 활용
		// 조건식 ? 참(실행) : 거짓(실행) -> 기본 구조
		
		int x = 80;
		String y = ( x > 80 ) ? "합격" : "불합격";
		System.out.println( x + " 점수는 " + y + "입니다." );
		
		int eng = 95;
		int mat = 75;
		int total = x + eng + mat;
		int avg = total / 3;
		System.out.println( total );
		System.out.println((double)avg);
	
	}

}
