package kodlamaio2;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("Demiroğ");
		instructor1.setEmail("shdsgjadhajdh");
		instructor1.setPassword("dfsfsfsf");
		instructor1.setStudentCount("20000");
		instructor1.setGivenCourse("Java&React");
		
		Student student1 = new Student();
		student1.setId(1);
		student1.setFirstName("Esra");
		student1.setLastName("Tırpancı");
		student1.setEmail("skldfjlasf");
		student1.setPassword("sçmfkshdfk");
		student1.setTakenCourse("Java&React");
		
		Student student2 = new Student();
		student2.setId(1);
		student2.setFirstName("XYZ");
		student2.setLastName("ABC");
		student2.setEmail("lkorıeuseroer");
		student2.setPassword("şawğeğweeğ");
		student2.setTakenCourse("C# & Angular");
		
	    Student[] students = {student1,student2};
	    Instructor[] instructors = {instructor1};
	    
	    
	    StudentManager studentManager = new StudentManager();
	     studentManager.addMultiple(students);
	    InstructorManager instructor = new InstructorManager();
	    instructor.add(instructor1);
	   UserManager userManager1 = new UserManager();
	   userManager1.add(student1);
	   UserManager userManager2 = new UserManager();
	   userManager2.add(instructor1);
	   UserManager userManager3 = new UserManager();
	   userManager3.add(student2);	    
	    
		
		User[] user = {instructor1,student1,student2};
		for (User user2 : user) {
			System.out.println(user2);
			
		}		
	}

}
