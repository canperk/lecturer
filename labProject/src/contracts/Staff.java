package contracts;
public abstract class Staff {
	public Staff() {
		this.workingHour = new WorkingHour(9, 18);
	}
	public int id;
	public String fullName;
	public String taskInformation;
	public WorkingHour workingHour;
}

class Secretary extends Staff {
	public Boolean changeInstructor(Course course, Lecturer instructor)
	{	
		return course.setInstructor(instructor);
	}
}

class Technician extends Staff {
	
}

class Cleaner extends Staff {
	
}