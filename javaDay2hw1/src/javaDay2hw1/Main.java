package javaDay2hw1;


public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor (1,"Engin","Demiro�");
		Instructor instructor2 = new Instructor (2,"Salih","�ent�rk");
		
		Instructor[] instructors = { instructor1, instructor2 };
		
		System.out.println("-----------E��TMENLER------------");
		
		for (Instructor instructor : instructors ) {

			System.out.print(instructor.name+" ");
			System.out.println(instructor.surname);
		}
		System.out.println("---------------------------------");
		Member member1 = new Member();
		member1.id=1;
		member1.name="Ersin";
		member1.surname="�ent�rk";
		member1.email="ersinsenturk@kodlama.io";
		member1.password=123456;
		
		Member member2 = new Member();
		member2.id=2;
		member2.name="�i�dem";
		member2.surname="�ent�rk";
		member2.email="cigdemsenturk@kodlama.io";
		member2.password=123456;
			
		Member[] members = { member1, member2 };
		
		System.out.println("-------------�YELER--------------");
			
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
