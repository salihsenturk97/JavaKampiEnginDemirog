package day3hw2;

public class InstructorManager extends UserManager {
	public void add(Instructor instructor) {
		System.out.println(instructor.getName()+" eklendi");
	}
	public void delete(Instructor instructor) {
		System.out.println(instructor.getName()+" silindi");
		
	}
	public void selectCourses(Student student) {
		System.out.println(student.getName()+" "+student.getTakenCourses()+" ders onaylandý");
		
	}

}