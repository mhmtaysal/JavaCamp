package homeWork3Interfaces;

public class SemesterHolidayCampaign implements Campaign{

	
	 @Override
	    public void addCampaign(Game game) {
	        System.out.println("Somester �ndirim Y�zdesi: %20");
	        System.out.println("Oyun �creti: " + game.price);
	        System.err.println("Karne Hediyesi indirimi uygulan�yor");
	        game.price = game.price - (0.2 * game.price);
	        System.out.println("indirim uyguland� F�yat:" + game.price);
	    }

	    @Override
	    public void updateCampaign(Game game) {
	        System.out.println("Somester �ndirim Y�zdesi: %70");
	    }

	    @Override
	    public void deleteCampaign(Game game) {
	        System.out.println("Somester Kampanyas� Sonland�...");
}
}