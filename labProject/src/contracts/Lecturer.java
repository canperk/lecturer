package contracts;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class Lecturer {
	public Lecturer(int id, String fullName) {
		courses = new ArrayList<Course>();
		this.id = id;
		this.fullName = fullName;
	}
	private int id;
	private String fullName;
	private List<Course> courses;
	
	public Boolean AddCourse(Course course) {
		if(this.hasSpaceForCourses())
		{
			return false;
		}
		this.courses.add(course);
		return true;
	}
	
	public void AddNoteToCourse(String note, String courseCode) {
		Optional<Course> course = this.courses.stream()
											  .filter(f -> f.getCode() == courseCode)
											  .findFirst();
		if(course.isEmpty()) {
			return;
		}
		course.get().setCourseNote(note);
	}
	
	public Boolean hasSpaceForCourses() {
		return courses.size() < 10;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int GetId() {
		return id;
	}
	
	public List<Course> getCourses() {
		return Collections.unmodifiableList(this.courses);
	}
}