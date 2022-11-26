package contracts;

import java.util.*;

public class Department {
	public Department() {
		lecturers = new ArrayList<Lecturer>();
		courses = new ArrayList<Course>();
		students = new ArrayList<Student>();
	}
	
	private List<Lecturer> lecturers;
	private List<Course> courses;
	private List<Student> students;
	private Lecturer headOfDepartment;
	
	public List<Lecturer> getLecturers() {
		return Collections.unmodifiableList(this.lecturers);
	}
	
	public List<Student> getStudents() {
		return Collections.unmodifiableList(this.students);
	}
	
	public List<Course> getCourses() {
		return Collections.unmodifiableList(this.courses);
	}
	
	public void addStudent(Student student) {
		this.students.add(student);
	}
	
	public void addCourse(Course course) {
		this.courses.add(course);
	}
	
	public void addLecturer(Lecturer lecturer) {
		this.lecturers.add(lecturer);
	}

	public Lecturer getHeadOfDepartment() {
		return headOfDepartment;
	}

	public void setHeadOfDepartment(Lecturer headOfDepartment) {
		this.headOfDepartment = headOfDepartment;
	}
}	