package kodlamaio;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student(1, "Esra", "TIRPANCI", "emailadresi");
		Student student2 = new Student(2, "Ay�e", "XYZ", "emailadresi");

		Student[] student = { student1, student2 };

		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + Angular)", "Engin DEM�RO�",
				"2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, dok�man ve duyurular�n�"
						+ "buradan yapaca��z.",
				0);
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Engin DEM�RO�",
				"2 ay s�recek Yaz�l�m Geli�tirici Yeti�tirme Kamp�m�z�n takip, dok�man ve duyurular�n�"
						+ "buradan yapaca��z.",
				0);
		Course course3 = new Course(3, "Programlamaya Giri� Temel Kurs ", "Engin DEM�RO�",
				"PYTHON,JAVA,C# gibi b�t�n programlama dilleri i�in temel programlama mant��� anla��l�r �rneklerle"
						+ "��renin.",
				0);
		Course[] course = { course1, course2, course3 };

		System.out.println("��renciler ");
		

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
