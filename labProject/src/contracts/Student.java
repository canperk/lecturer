package contracts;

import enums.Degree;
import java.util.*;

public class Student {
	private int id;
	private String fullName;
	private int entranceYear;
	private Degree degree;
	private List<Grade> grades;
	
	public Student(int id, String fullName, int entranceYear) {
		this.id = id;
		this.fullName = fullName;
		this.entranceYear = entranceYear;
		this.grades = new ArrayList<Grade>();
	}
	
	public int getId() {
		return id;
	}
	public String getFullName() {
		return fullName;
	}
	public int getEntranceYear() {
		return entranceYear;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	public List<Grade> getGrades() {
		return Collections.unmodifiableList(this.grades);
	}
	
	public void registerCourse(Course course) {
		Grade grade = new Grade(0, course);
		this.grades.add(grade);
	}
	
	public void AddGrade(int grade, String courseCode) {
		Optional<Grade> existing = this.grades.stream()
											  .filter((f) -> f.getCourse().getCode() == courseCode)
											  .findFirst();
		if(existing.isEmpty()) {
			throw new Error("Course was not registered");
		}
		existing.get().setGrade(grade);
	}
	
	public double getGPA() {
		if(this.grades.isEmpty()) {
			return 0;
		}
		int sumofGrades = this.grades.stream().mapToInt(g -> g.getGrade()).sum();		
		return sumofGrades / this.grades.size();
	}
}