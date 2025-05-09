package ch01;

public class AccuracyExam2 {

	public static void main(String[] args) {
		// 그렇담 소수점을 빼기 위해서 사과 1개에 10을 곱해서 활용해봅시다.
		// int 타입만 사용해보자는 의미
		
		int apple = 1 ;
		int totalPieces = apple * 10 ;
		int number = 7 ;
		int temp = totalPieces - number ; 
		
		double result = temp / 10.0 ; 
		System.out.println("사과 남은 조각 수 : " + result); 
		
		// 정수로 계산했던것을 원래대로 돌려놓기 위해서 10.0으로 나눔
		// 10.0은 실수여서 double 사용
	}

}
