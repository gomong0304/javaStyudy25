package ch01;

public class VariableExam {

	public static void main(String[] args) {
		
		int mach ; // 정수 타입의 mach 변수를 선언
		int distance ; //정수 타입의 distance 변수를 선언
		mach = 340 ;
		distance = mach * 60 * 60 ; // 음속을 m/s로 계산
		System.out.println("소리가 1시간 동안 가는 거리 : " + distance + "m");
		
		double radius ; // 실수 타입의 radius 변수를 선언
		double area ; // 실수 타입의 area 변수를 선언
		radius = 25.4 ;
		area = radius * radius * 3.14 ; // 원의 넓이 계산
		System.out.println("반지름이 " + radius + "인 원의 넓이 : " + area);
		
		
		char firstName, midName, lastName ; //문자 타입의 변수 생성
		firstName = '박' ;
		midName = '희' ; 
		lastName = '진' ; 
		System.out.println("이름은 : " + firstName + midName + lastName );
		System.out.println(firstName);
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
