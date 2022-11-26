package contracts;

public class Grade{
	private int grade;
	private Course course;

	public Grade(int grade, Course course) {
		this.grade = grade;
		this.course = course;
	}

	public Course getCourse() {
		return course;
	}

	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
}