package mySecondProject;

public class Student extends User {
	
		private int completionRate;

		
		public Student(int id, String name, String eMail, int numberOfCourses, int completionRate) {
			super(id, name, eMail, numberOfCourses);
			this.completionRate= completionRate;
		}
		
		
		public int getCompletionRate() {
			return completionRate;
		}

		public void setCompletionRate(int completionRate) {
			this.completionRate = completionRate;
		}
		
		

	

}
