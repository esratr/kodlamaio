package kodlamaio;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Esra", "TIRPANCI", "emailadresi");
		Student student2 = new Student(2, "Ayþe", "XYZ", "emailadresi");

		Student[] student = { student1, student2 };

		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + Angular)", "Engin DEMÝROÐ",
				"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, doküman ve duyurularýný"
						+ "buradan yapacaðýz.",
				0);
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Engin DEMÝROÐ",
				"2 ay sürecek Yazýlým Geliþtirici Yetiþtirme Kampýmýzýn takip, doküman ve duyurularýný"
						+ "buradan yapacaðýz.",
				0);
		Course course3 = new Course(3, "Programlamaya Giriþ Temel Kurs ", "Engin DEMÝROÐ",
				"PYTHON,JAVA,C# gibi bütün programlama dilleri için temel programlama mantýðý anlaþýlýr örneklerle"
						+ "öðrenin.",
				0);
		Course[] course = { course1, course2, course3 };

		System.out.println("Öðrenciler ");
		

		for (Student students : student) {

			System.out.println(students.name);
		}

		System.out.println("Kurslar");

		for (Course courses : course) {

			System.out.println(courses.courseName);
		}

		CourseManager courseManager = new CourseManager();

		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.deleteFromCourse(course1);

		StudentManager studentManager = new StudentManager();
		studentManager.addToStudent(student1);
		studentManager.addToStudent(student2);
		studentManager.deleteFromStudent(student1);

	}

}
