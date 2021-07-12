package co.yedam;

public class Student {
	int num;
	String name;
	int eng;
	int math;
	
	
	
	public Student(int num, String name, int eng, int math) {
		super();
		this.num = num;
		this.name = name;
		this.eng = eng;
		this.math = math;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public String showInfo() {
		return "학번: " + getNum() + " | 이름: " + getName() + " | 영어점수: " + getEng() + " | 수학점수: " + getMath();
	}
	

}
