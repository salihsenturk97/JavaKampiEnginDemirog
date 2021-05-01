package day3hw2;

public class Instructor extends User {
	private String givenCourses;
	private String instructorNumber;
	
	public String getGivenCourses() {
		return givenCourses;
	}
	public void setGivenCourses(String givenCourses) {
		this.givenCourses = givenCourses;
	}
	public String getInstructorNumber() {
		return instructorNumber; 
	}
	public void setInstructorNumber(String instructorNumber) {
		this.instructorNumber = instructorNumber;
	}

}