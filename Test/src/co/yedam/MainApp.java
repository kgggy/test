package co.yedam;

import java.util.Scanner;

public class MainApp {
	static Scanner scn = new Scanner(System.in);
	static Student[] studentArray = new Student[10];

	public static void main(String[] args) {

		System.out.println("===========================================================");
		System.out.println("1.입력 | 2.수정 | 3.삭제 | 4.리스트 | 5.단건조회 | 6.분석 | 7.종료");
		System.out.println("===========================================================");

		while (true) {
			int menu = scn.nextInt();
			scn.nextLine();

			if (menu == 1) {
				create();
			} else if (menu == 2) {
				update();
			} else if (menu == 3) {
				delete();
			} else if (menu == 4) {
				list();
			} else if (menu == 5) {
				oneList();
			} else if (menu == 6) {
				details();
			} else if (menu == 7) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}

	}// end of main

//	public String scanStr(String msg) {
//		System.out.println(msg);
//		String val = scn.nextLine();
//		return val;
//	}

	public static void create() {
		System.out.println("학번 > ");
		int num = scn.nextInt();
		scn.nextLine();
		System.out.println("이름 > ");
		String name = scn.nextLine();
		System.out.println("영어점수 > ");
		int eng = scn.nextInt();
		System.out.println("수학점수 >");
		int math = scn.nextInt();

		Student students = new Student(num, name, eng, math);
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] == null) {
				studentArray[i] = students;
				break;
			}
		}
		System.out.println("-----------------");
		System.out.println("한 건 입력되었습니다.");
		System.out.println("-----------------");
	}

	public static void update() {
		System.out.println("학번 > ");
		int num = scn.nextInt();
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null && studentArray[i].getNum() == num) {
				System.out.println("영어점수 >");
				int updEng = scn.nextInt();
				studentArray[i].setEng(updEng);
				System.out.println("수학점수 >");
				int updMath = scn.nextInt();
				studentArray[i].setMath(updMath);
				break;
			}
		}
		System.out.println("수정되었습니다.");
	}

	public static void delete() {
		System.out.println("학번 >");
		int num = scn.nextInt();
		for (int i = 0; i < studentArray.length; i++) {
			if (num == studentArray[i].getNum()) {
				studentArray[i] = null;
				break;
			}
		}
		System.out.println("삭제되었습니다.");
	}

	public static void list() {
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				System.out.println("-----------------------------------------");
				System.out.println(studentArray[i].showInfo());
			}
		}
	}

	public static void oneList() {
		System.out.println("학번 > ");
		int num = scn.nextInt();
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				if (num == studentArray[i].num) {
					System.out.println(studentArray[i].showInfo());
				}
			}
		}
	}
	
	public static void details() {
		int engMax = 0;
		Student engMaxStudent = null;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				if (studentArray[i].getEng() > engMax) {
					engMax = studentArray[i].getEng();
					engMaxStudent = studentArray[i];
				}
			}
		}
		System.out.println("영어과목 최고점 > " + engMax);
		System.out.println(engMaxStudent.showInfo());

		int mathMax = 0;
		Student mathMaxStudent = null;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				if (studentArray[i].getMath() > mathMax) {
					mathMax = studentArray[i].getMath();
					mathMaxStudent = studentArray[i];
				}
			}
		}
		System.out.println("수학과목의 최고점수 : " + mathMax);
		System.out.println(mathMaxStudent.showInfo());
		
		int sum = 0;
		Student sumMaxStudent = null;
		for (int i = 0; i < studentArray.length; i++) {
			if (studentArray[i] != null) {
				if (studentArray[i].getMath() + studentArray[i].getEng() > sum) {
					sum = studentArray[i].getMath() + studentArray[i].getEng();
					sumMaxStudent = studentArray[i];
				}
			}
		}
		System.out.println("합산 최고점수 : " + sum);
		System.out.println(sumMaxStudent.showInfo());

	}

}// class
