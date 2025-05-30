package Test.Service;

import java.util.Scanner;

import Test.DTO.StudentDTO;

public class StudentService {
	// 학생 메뉴 진입했을때 사용할 보조메뉴
	// 필드
	
	// 생성자
	
	// 메서드
	public void menu(Scanner inputStr, Scanner inputint, StudentDTO[] students) {
		boolean subrun = true;
		while(subrun) {
			System.out.println("---학생 관리 메뉴입니다.---");
			System.out.println("원하시는 메뉴를 선택해주세요");
			System.out.println("1.학생등록 | 2.학생목록 | 3.학생수정 | 4.학생삭제 | 5.메인메뉴");
			System.out.print("1~5 >>> ");
			String select = inputStr.next();
			System.out.println("---학생 관리 메뉴입니다.---");
			switch(select) {
			case "1" :
				System.out.println("학생 등록 메뉴입니다.");
				regStudent(inputStr, inputint, students);
				break;
			case "2" :
				System.out.println("학생 목록 메뉴입니다.");
				for(int i =0; i<students.length; i++) {
					if(students[i] != null) {
						System.out.print("이름 : " + students[i].getName() + "\t");
						System.out.print("학번 : " + students[i].getStudentID() + "\t");
						System.out.print("학년 : " + students[i].getGrade() + "\t");
						System.out.print("반 : " + students[i].getRoom() + "\n");
					}// if문 종료
				}// for문 종료
				break;
			case "3" :
				System.out.println("학생 수정 메뉴입니다.");
				System.out.println("수정할 학생을 입력해주세요");
				System.out.print(">>> ");
				
				break;
			case "4" :
				System.out.println("학생 삭제 메뉴입니다.");
				break;
			case "5" :
				System.out.println("메인 메뉴로 돌아갑니다.");
				subrun = false;
				break;
			default :
				System.out.println("없는 메뉴입니다. 다시 선택해주세요");
				break;
			}// 보조 메뉴 switch문 종료
		}// 보조 메뉴 while문 종료
	}

	void regStudent(Scanner inputStr, Scanner inputint, StudentDTO[] students) {
		StudentDTO regStudent = new StudentDTO();
		
		System.out.print("등록하실 학생의 이름을 입력해주세요 : ");
		regStudent.setName(inputStr.next()); 
		
		System.out.print("등록하실 학생의 학번을 입력해주세요 : ");
		regStudent.setStudentID(inputint.nextInt());
		
		System.out.print("등록하실 학생의 학년을 입력해주세요 : ");
		regStudent.setGrade(inputint.nextInt());
		
		System.out.print("등록하실 학생의 반을 입력해주세요 : ");
		regStudent.setRoom(inputint.nextInt());
		
		for(int i = 0; i< students.length; i++) {
			if(students[i] == null) {
				students[i] = regStudent;	
				break;
			}//if문 종료
		}// for문 종료
		
	}// 학생 등록 메뉴 종료
}
