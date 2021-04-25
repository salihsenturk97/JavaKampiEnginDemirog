package javaDay2hw1;

public class Course {

	int id;
	String courseName;
	String courseInstructor;	
	boolean active;	
	
	
	public Course(int id,String courseName,String courseInstructor,boolean active)
	{
		
		this.id=id;
		this.courseName=courseName;
		this.courseInstructor=courseInstructor;		
		this.active=active;
	}

}