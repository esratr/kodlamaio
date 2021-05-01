package kodlamaio2;

public class InstructorManager {
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " adlý eðitmen eklendi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " adlý eðitmen silindi.");
	}
	public void update(User user) {
		System.out.println(user.getFirstName() + " adlý eðitmen güncellendi.");
	}
	

}
