package mySecondProject;

public class UserManager {

	 public void addUser(User user) {
		 System.out.println("Kullanıcı siteme eklendi: "+ user.getName());
	 }
	 
	 public void getEmail(User user) {
		 System.out.println(user.getName()+ " isimli kullanıcının eMaili: "+ user.geteMail());
	 }
	 
	 public void numberOfCourses(User user) {
		 System.out.println("Kullanıcının kurs sayısı: "+ user.getNumberOfCourses());
	}
}
