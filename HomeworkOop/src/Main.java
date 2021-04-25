
public class Main {

	public static void main(String[] args) {
		
		
		
		Programs program1 = new Programs(2,"Java + REACT","Engin Demirog","Yazýlým Geliþtirici Yetiþtirme Kampý","36% TAMAMLANDI");
		
		
		
		Programs program2 = new Programs();
		
		program2.id = 1;
		program2.name ="C# + ANGULAR";
		program2.teacher ="Engin Demirog";
		program2.details ="Yazýlým Geliþtirici Yetiþtirme Kampý";
		program2.percent ="0 TAMAMLANDI"; // hesap yapýlmadý string olarak yazýlýyor
		
		
		
		
		
		
		Programs program3 = new Programs();
		program3.id = 1;
		program3.teacher="Engin Demirog";
	
		program3.name =""
				+ ""
				+ "Programlamaya Giriþ için Temel Kurs";
		program3.details ="PYTHON, JAVA, C# gibi tüm programlama dilleri için temel programlama mantýðýný anlaþýlýr örneklerle öðrenin.";
		program3.percent ="UCRETSÝZ"; // hesap yapýlmadý string olarak yazýlýyor
		
		
      

		
		
		Programs[] programs = {program1,program2,program3};
		
		for(Programs program : programs) {
		
			System.out.println();
			System.out.println(program.name);
			System.out.println(program.details);
			System.out.println(program.percent);
			System.out.println(program.teacher);
		}
			
			
			Category category1 = new Category();
			category1.all = "Tümü";
			category1.TypeOfPgoram ="Programlama("+programs.length+")";
			
			
			
			Category[] categories = {category1};
			
			for(Category category :categories) {
				
				System.out.println();
				System.out.println(category.all);
				System.out.println(category.TypeOfPgoram);
			}
				
				
				Teacher teacher1 = new Teacher();
				teacher1.all = "Tümü";
				teacher1.name ="Engin Demirog";
				
				
				Teacher[] teachers = {teacher1};
				
				for(Teacher teacher :teachers) {
					
					System.out.println();
					System.out.println(teacher.all);
					System.out.println(teacher.name);
				}
				
				ProgramsManager programsManager = new ProgramsManager();
				System.out.println();
				programsManager.addCourse(program1);
				programsManager.addCourse(program2);
				programsManager.addCourse(program3);
				
					
				
				
				
			

		
		
	}

}
