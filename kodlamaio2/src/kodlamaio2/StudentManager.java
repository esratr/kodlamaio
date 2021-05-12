package kodlamaio2;

public class StudentManager {
	
	
	public void add(User user) {
		System.out.println(user.getFirstName() + " isimli ��renci kaydedildi.");
	}
	
	public void delete(User user) {
		System.out.println(user.getFirstName() + " isimli ��renci silindi.");
	}
	
	public void update(User user) {
		System.out.println(user.getFirstName() + " isimli ��renci g�ncellendi.");

	}
	
	public void addMultiple (User[] users) {
		for(User user: users) {
			this.add(user);
		}
		
	}
	

}

