package homeWorkInterihance;

public class Main {

	public static void main(String[] args) {
		
		Instructor instructor = new Instructor();
		instructor.setId(1);
		instructor.setName("Engin");
		instructor.setSurname("DEMIROG");
		instructor.setDescriber("MCT,PMP,ITIL sertikilı Eğitimci");
		
	
		
		Student student = new Student();
		student.setId(1);
		student.setName("Mehmet");
		student.setSurname("AYSAL");
		student.setLesson("Java + React ");
		student.setLessonLevel(10);
		student.setLessonCount(20);
		
		
		
		

		
		


		UserManager userManager = new UserManager();
		User[] users = {student,instructor};
		userManager.addMultiple(users);

		InstructorManager instructorManager = new InstructorManager();
		instructorManager.getDescription(instructor);
		
		StudentManager studentManager = new StudentManager();
		studentManager.getCourse(student);
		studentManager.getCourseList(student);
	
		

	}

}
