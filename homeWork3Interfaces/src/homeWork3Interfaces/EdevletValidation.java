package homeWork3Interfaces;

public  class EdevletValidation {
	
	

	public   boolean isValid(Gamer gamer) {
		
		if(gamer.Tc.length()==11 && gamer.birtdate <2003 && gamer.birtdate>0 && !gamer.nickname.isEmpty()) {
			
			return true;
		}

		
		return false;
	
	
}
}
