package ch02;

public class IfNestedExam {

	public static void main(String[] args) {
		// if 중첩문 연습
		
		int score = (int)(Math.random()*20) + 81 ; // 81~100 사이값을 난수로 발생시킨다.
		System.out.println("현재 점수는 : " + score);
		String grade;
		if(score >= 90) {
			if(score >= 95) {
			grade = "A+";
			}	else {
				grade = "A";
				}// 95점 이상이면 A+ 90점 이상이면 A
		}	else {
				if(score >= 85 ) {
				grade = "B+";
				}	else {
					grade = "B";
					}
			}// if-else문 종료
		
		System.out.println("학점 : " + grade);
		
	}// main 메소드 종료

}// Class 종료
