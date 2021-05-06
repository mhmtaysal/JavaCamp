package homeWork3Interfaces;

public class SemesterHolidayCampaign implements Campaign{

	
	 @Override
	    public void addCampaign(Game game) {
	        System.out.println("Somester Ýndirim Yüzdesi: %20");
	        System.out.println("Oyun Ücreti: " + game.price);
	        System.err.println("Karne Hediyesi indirimi uygulanýyor");
	        game.price = game.price - (0.2 * game.price);
	        System.out.println("indirim uygulandý FÝyat:" + game.price);
	    }

	    @Override
	    public void updateCampaign(Game game) {
	        System.out.println("Somester Ýndirim Yüzdesi: %70");
	    }

	    @Override
	    public void deleteCampaign(Game game) {
	        System.out.println("Somester Kampanyasý Sonlandý...");
}
}