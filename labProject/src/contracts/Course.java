package contracts;
import enums.CourseType;
public class Course {
	private Lecturer instructor;
	private String code;
	private String courseLocation;
	private int credit;
	private String name;
	private String courseNote;
	private CourseType courseType;
	
	public Course(String code, String name, int credit) {
		this.code = code;
		this.name = name;
		this.credit = credit;
	}
	public Boolean setInstructor(Lecturer instructor) {
		if(!instructor.hasSpaceForCourses()) {
			return false;
		}
		
		this.setInstructor(instructor);
		instructor.AddCourse(this);
		return true;
	}

	public Lecturer getInstructor() {
		return instructor;
	}
	public String getName() {
		return name;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getCourseLocation() {
		return courseLocation;
	}
	public void setCourseLocation(String courseLocation) {
		this.courseLocation = courseLocation;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(byte credit) {
		this.credit = credit;
	}
	public String getCourseNote() {
		return courseNote;
	}
	public void setCourseNote(String courseNote) {
		this.courseNote = courseNote;
	}
	public CourseType getCourseType() {
		return courseType;
	}
	public void setCourseType(CourseType courseType) {
		this.courseType = courseType;
	}
}