package kodlamaio2;

public class InstructorManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " adl� e�itmen eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adl� e�itmen silindi.");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " adl� e�itmen g�ncellendi.");
	}
	

}
