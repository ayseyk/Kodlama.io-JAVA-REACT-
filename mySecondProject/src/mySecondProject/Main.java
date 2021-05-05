package mySecondProject;

public class Main {

	public static void main(String[] args) {
		
		StudentManager studentManager= new StudentManager();
		Student student= new Student(1,"AYŞE YALÇINKAYA","ayse_ykaya@hotmail.com",1,43);
		studentManager.completionRate(student);
		
		
		InstructorManager instructorManager= new InstructorManager();
		Instructor instructor= new Instructor(2,"Engin DEMİROG", "engin@demirog.com",3,15000);
		instructorManager.numberOfStudent(instructor);
		
		
		
		instructorManager.numberOfCourses(instructor);
		studentManager.numberOfCourses(student);
		
		studentManager.addUser(student);
		instructorManager.addUser(instructor);
		
		studentManager.getEmail(student);
		instructorManager.getEmail(instructor);
	}

}
