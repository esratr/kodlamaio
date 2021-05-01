package kodlamaio2;

public class StudentManager {
	
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli öðrenci kaydedildi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli öðrenci silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli öðrenci güncellendi.");

	}
	
	public void addMultiple (User[] users) {
		for(User user: users) {
			this.add(user);
		}
		
	}
	

}

