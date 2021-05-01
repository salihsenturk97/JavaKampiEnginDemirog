package day3hw2;

public class Main {

	public static void main(String[] args) {

		Instructor instructor1 = new Instructor();
		instructor1.setInstructorNumber("1");
		instructor1.setName("Engin Demiroğ");
		instructor1.setEmail("engin@kodlama.io");
		instructor1.setGivenCourses("Java");

		Student student1 = new Student();
		student1.setStudentNumber("1");
		student1.setName("Salih");
		student1.setEmail("salih@kodlama.io");
		student1.setTakenCourses("Java");

		Student student2 = new Student();
		student2.setStudentNumber("2");
		student2.setName("Çiğdem");
		student2.setEmail("cigdem@kodlama.io");
		student2.setTakenCourses("C#");

		Student student3 = new Student("Ersin", "3", "ersin@kodlama.io");
		
		System.out.println("---------------İŞLEMLER------------");

		Student[] students = { student1, student2, student3 };

		StudentManager studentManager = new StudentManager();
		studentManager.add(student1);
		studentManager.selectCourses(student1);

		studentManager.add(student2);
		studentManager.selectCourses(student2);
		studentManager.delete(student2);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.add(instructor1);

		studentManager.getAll(students);

	}

}