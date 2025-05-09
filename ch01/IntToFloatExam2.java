package ch01;

public class IntToFloatExam2 {

	public static void main(String[] args) {
		
		int num1 = 123456780 ;
		int num2 = 123456780 ;
		
		float num3 = num2 ;
		num2 = (int) num3 ;
		
		System.out.println("num1 : " + num1) ; // 123456780
		System.out.println("num2 : " + num2) ; // 123456784
		System.out.println("num3 : " + num3) ; // 1.23456784E8
		// num2이 int -> float변하면서 값의 범위가 달라져서 num1, num2의 값이 달라짐

		int result = num1 - num2 ;
		System.out.println("==============================");
		System.out.println("float으로 다녀온 후에 num2 값 변경됨");
		System.out.println("num1 - num2 : " + result);
		
		// float이 소수점을 사용하기 때문에 int-> float 값의 변조가 일어남
		// 이럴때는 float 보다 더 큰 double 을 사용해서 해결해보자

	}

}
