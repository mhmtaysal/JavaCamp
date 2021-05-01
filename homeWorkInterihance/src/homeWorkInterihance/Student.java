package homeWorkInterihance;

public class Student extends User {
	
	
	private int lessonLevel;
	private double lessonCount;
	private String lesson;
	double tPercentOfLesson;
	
	
	
	
	
	public int getLessonLevel() {
		return lessonLevel;
	}
	public void setLessonLevel(int lessonLevel) {
		this.lessonLevel = lessonLevel;
	}
	public double getLessonCount() {
		return lessonCount;
	}
	public void setLessonCount(int lessonCount) {
		this.lessonCount = lessonCount;
	}
	public String getLesson() {
		return  lesson;
	}
	public void setLesson(String lesson) {
		this.lesson = lesson;
	}
	public double getPercentOfLesson() {
		return  (this.lessonLevel / this.lessonCount* 100);
	} 
	
	
	

	
	

}
