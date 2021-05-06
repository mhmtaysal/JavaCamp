package homeWork3Interfaces;

public class GamerManager {
	
	BaseDatabaseProccess baseDatabaseProccess;
	
	EdevletValidation edevletValidation = new EdevletValidation();
	
	


 

	
	public void addGamer(Gamer gamer) {
		
		
		if(edevletValidation.isValid(gamer)) {
			
			baseDatabaseProccess.add(gamer);
			
		}else {
			
			System.out.println("T.C.no hatalý, nick name boþ, yaþýnýz 18 den küçük olamaz!");
		}
		
	}
	public void updateGamer(Gamer gamer) {
		baseDatabaseProccess.update(gamer);
		
	}
	public void deleteGamer(Gamer gamer) {
		baseDatabaseProccess.delete(gamer);		
	}
	

}
