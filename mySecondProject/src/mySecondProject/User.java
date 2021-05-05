package mySecondProject;

public class User {
	    private int id;	
	    private String name;
		private String eMail;
		private int numberOfCourses;

		
		public User(int id, String name, String eMail, int numberOfCourses) {
			this.id=id;
			this.name=name;
			this.eMail=eMail;
			this.numberOfCourses= numberOfCourses;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String geteMail() {
			return eMail;
		}


		public void seteMail(String eMail) {
			this.eMail = eMail;
		}


		public int getNumberOfCourses() {
			return numberOfCourses;
		}


		public void setNumberOfCourses(int numberOfCourses) {
			this.numberOfCourses = numberOfCourses;
		}
}
	