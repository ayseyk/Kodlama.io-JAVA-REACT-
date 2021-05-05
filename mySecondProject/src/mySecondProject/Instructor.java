package mySecondProject;

public class Instructor extends User{
	
		private int numberOfStudents;
	
		
		public Instructor(int id, String name, String eMail, int numberOfCourses, int numberOfStudents) {
			super(id, name, eMail, numberOfCourses);
			this.numberOfStudents= numberOfStudents;
		}


		public int getNumberOfStudents() {
			return numberOfStudents;
		}


		public void setNumberOfStudents(int numberOfStudents) {
			this.numberOfStudents = numberOfStudents;
		}
	

}
