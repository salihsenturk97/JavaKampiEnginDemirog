package day3hw2;

public class StudentManager extends UserManager {

	public void add(Student student) {
		System.out.println(student.getStudentNumber() + " öğrenci numarası eklendi");
	}

	public void delete(Student student) {
		System.out.println(student.getStudentNumber() + " öğrenci nosu silindi");
	}

	public void selectCourses(Student student) {
		System.out.println(student.getName() + " " + student.getTakenCourses() + " ders onaylandı");
	}

	public void getAll(Student[] students) {
		for (Student student : students) {
			System.out.println(student.getName() + " " + student.getStudentNumber());
		}
	}

}