package homeWorkInterihance;

public class StudentManager {
	
	public void getCourse(Student student) {
		System.out.println(student.getLesson() + " kurs kayd� ba�ar� ile yap�lm��t�r.");
	}
	

	public void getCourseList(Student student) {
		System.out.println("Al�nan Kurs: "+student.getLesson());
	}

}
