package javaDay2hw1;


public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor (1,"Engin","Demiroð");
		Instructor instructor2 = new Instructor (2,"Salih","Þentürk");
		
		Instructor[] instructors = { instructor1, instructor2 };
		
		System.out.println("-----------EÐÝTMENLER------------");
		
		for (Instructor instructor : instructors ) {

			System.out.print(instructor.name+" ");
			System.out.println(instructor.surname);
		}
		System.out.println("---------------------------------");
		Member member1 = new Member (1,"Ersin","Þentürk","ersinsenturk@gmail.com",123456);
		Member member2 = new Member (2,"Çiðdem","Þentürk","cigdemsenturk@gmail.com",123456);
			
		Member[] members = { member1, member2 };
		
		System.out.println("-------------ÜYELER--------------");
			
		for (Member member : members ) {

			System.out.print(member.name+" ");
			System.out.println(member.surname);
		
			
			}
		System.out.println("---------------------------------");
		
		CourseManager courseManager = new CourseManager();
		courseManager.addCourse(member1);
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.addCourseInstructor(instructor1);
	
	}
}
