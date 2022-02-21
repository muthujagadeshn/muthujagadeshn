package org.college;

public class Student extends College {
	public void studentName() {
		System.out.println("MuthuJagadesh");
	}
	public void studentDept() {
		System.out.println("mechanicl engineering");
	}
	public void studentId() {
		System.out.println(412217114027l);
	}
	public static void main(String[] args) {
		Student suu=new Student();
		suu.collegeCode();
		suu.collegeName();
		suu.depName();
		suu.studentDept();
		suu.studentId();
		suu.studentName();
		suu.collegeRank();
	}
}
