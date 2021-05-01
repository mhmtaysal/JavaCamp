package homeWorkInterihance;

public class StudentManager {
	
	public void getCourse(Student student) {
		System.out.println(student.getLesson() + " kurs kaydı başarı ile yapılmıştır.");
	}
	

	public void getCourseList(Student student) {
		System.out.println("Alınan Kurs: "+student.getLesson());
	}

}
