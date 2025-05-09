package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// 강제 타입 변환(Casting)
		// 큰 크기의 타입은 작은 크기의 타입으로 자동 변환할 수 없다.
		// int(21억) 32bit -> byte 8bit 타입으로 담으면 누수가 발생한다.
		// 값이 넘치더라도 강제로 적용하는 법을 강제 타입 변환이라고 함
		
		int intValue = 123456789 ;
		byte byteValue = (byte)intValue ; // 강제로 byte 타입으로 변환했다
		
		System.out.println("int 타입 값 출력 : " + intValue);
		System.out.println("byte 타입 값 출력 : " + byteValue);
		
		int kor = 100 ;
		int eng = 99 ;
		int mat = 97 ;
		
		int total = kor + eng + mat ;
		System.out.println("=========성적표==========");
		System.out.println(" 국어 + 영어 + 수학 = 총점 : " + total);
		
 		int avg = total / 3 ; // int 사용시에는 정수로만 출력
 		System.out.println("평균 점수 : " + avg); // 정수로 자동 타입 변환
 		
 		double avg2 = total / 3 ;
 		System.out.println("평균 점수 : " + avg2);
 		
 		avg2 = (double)total / 3 ; // 강제 타입변환하였음
 		System.out.println("평균 점수 : " + avg2);
 		
 		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
