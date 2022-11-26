import contracts.*;
public class Program {

	public static void main(String[] args) {
		Lecturer l1 = new Lecturer(1, "Ahmet Yılmaz");
		Lecturer l2 = new Lecturer(2, "Zeynep Kaya");
		Lecturer l3 = new Lecturer(3, "Gencay Peri");
		
		//Bachelor's Degree Courses
		Course b1 = new Course("B-101", "Mathematics", 4);
		Course b2 = new Course("B-102", "Psyhics", 2);
		Course b3 = new Course("B-103", "English", 3);
		Course b4 = new Course("B-201", "Music", 1);
		Course b5 = new Course("B-202", "Art", 1);
		Course b6 = new Course("B-203", "Electonics", 2);
		Course b7 = new Course("B-301", "OOP", 5);
		Course b8 = new Course("B-302", "Software Design", 3);
		Course b9 = new Course("B-403", "Architecture", 3);
		Course b10 = new Course("B-401", "Operating Systems", 2);
		Course b11 = new Course("B-402", "MicroProcessors", 6);
		Course b12 = new Course("B-403", "Data Structures", 4);
		Course b13 = new Course("B-404", "Frameworks", 2);
		Course b14 = new Course("B-405", "Web Deveoplemt", 3);
		Course b15 = new Course("B-405", "Image Processing", 2);
		
		//Master's Degree Courses
		Course m1 = new Course("M-101", "Design Patterns", 4);
		Course m2 = new Course("M-102", "Language Theory", 4);
		Course m3 = new Course("M-103", "Project Management", 4);
		
		//Doctoral Degree Courses
		Course d1 = new Course("D-101", "GIS System", 4);
		Course d2 = new Course("D-102", "ML", 4);
		Course d3 = new Course("D-103", "Artifical Intelligence", 4);
		
		l1.AddCourse(b1);
		l1.AddCourse(b2);
		l1.AddCourse(b3);
		l1.AddCourse(b4);
		l1.AddCourse(b5);
		l1.AddCourse(b11);
		l1.AddCourse(b12);
		l1.AddCourse(b13);
		l1.AddCourse(b14);
		l1.AddCourse(b15);
		
		l2.AddCourse(b6);
		l2.AddCourse(b7);
		l2.AddCourse(b8);
		l2.AddCourse(b9);
		l2.AddCourse(b10);
		l2.AddCourse(d2);
		l2.AddCourse(d3);
		
		l3.AddCourse(m1);
		l3.AddCourse(m2);
		l3.AddCourse(m3);
		l3.AddCourse(d1);
		
		Student s1 = new Student(1001, "Can Perk", 2021);
		s1.registerCourse(b1);
		s1.registerCourse(b2);
		
		s1.AddGrade(70, "B-101");
		s1.AddGrade(80, "B-102");
		
		System.out.println(s1.getGPA());
		Student s2 = new Student(1001, "Elif Ekinci", 2020);
		Student s3 = new Student(1001, "İlker Bayraktar", 2020);
		Student s4 = new Student(1001, "Can Perk", 2021);
		Student s5 = new Student(1001, "Elif Ekinci", 2020);
		Student s6 = new Student(1001, "İlker Bayraktar", 2020);
		Student s7 = new Student(1001, "Can Perk", 2021);
		Student s8 = new Student(1001, "Elif Ekinci", 2020);
		Student s9 = new Student(1001, "İlker Bayraktar", 2020);
		Student s10 = new Student(1001, "Can Perk", 2021);
		Student s11 = new Student(1001, "Elif Ekinci", 2020);
		Student s12 = new Student(1001, "İlker Bayraktar", 2020);
	}

}
