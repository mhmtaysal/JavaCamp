package homeWork3Interfaces;

public class GamerManager {
	
	BaseDatabaseProccess baseDatabaseProccess;
	
	EdevletValidation edevletValidation = new EdevletValidation();
	
	


 

	
	public void addGamer(Gamer gamer) {
		
		
		if(edevletValidation.isValid(gamer)) {
			
			baseDatabaseProccess.add(gamer);
			
		}else {
			
			System.out.println("T.C.no hatal�, nick name bo�, ya��n�z 18 den k���k olamaz!");
		}
		
	}
	public void updateGamer(Gamer gamer) {
		baseDatabaseProccess.update(gamer);
		
	}
	public void deleteGamer(Gamer gamer) {
		baseDatabaseProccess.delete(gamer);		
	}
	

}
