package myFirstProject;

public class Main {

	public static void main(String[] args) {
		Course course1= new Course(1,"Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)","Kampýmýz ücretsizidir ve 2 ay sürecektir.","Engin Demirog");
		Course course2= new Course(2,"Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)","Kampýmýz ücretsizidir ve 2 ay sürecektir.","Engin Demirog");
		

		Course[] courses = {course1, course2};
		
		for(Course course : courses ) {
			
			System.out.println(course.name);
		}
		
		System.out.println(courses.length);
		
		
		CourseManager courseManager= new CourseManager();
		
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		
		
	}

}
