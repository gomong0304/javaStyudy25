package ch01;

public class AccuracyExam1 {

	public static void main(String[] args) {
		// 사과 1개를 10조각으로 쪼개면 1조각이 0.1로 10 ->1개가 된다.
		
		int apple = 1 ; // 사과 1개 (정수)
		double pieceUint = 0.1 ; // 사과 1조각 (실수) 
		int number = 7 ; // 7개의 조각 (정수)
		
		double result = apple - number * pieceUint ; 
		System.out.println("사과 7조각을 뺌 : " + result); // 0.29999999999999993 -> 3조각이 안됨
		System.out.println("7조각의 값 : " + number*pieceUint); // 0.7000000000000001 
		
		// 서로 값이 다르게 나온다
		// 결론 : 정확한 값을 얻기 위해서는 실수타입을 사용하지 않는 편이 좋다!
		
	}// main 메서드 종료

}// Class 종료
