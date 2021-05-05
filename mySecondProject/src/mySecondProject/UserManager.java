package mySecondProject;

public class UserManager {

	 public void addUser(User user) {
		 System.out.println("Kullanýcý siteme eklendi: "+ user.getName());
	 }
	 
	 public void getEmail(User user) {
		 System.out.println(user.getName()+ " isimli kullanýcýnýn eMaili: "+ user.geteMail());
	 }
	 
	 public void numberOfCourses(User user) {
		 System.out.println("Kullanýcýnýn kurs sayýsý: "+ user.getNumberOfCourses());
	}
}
