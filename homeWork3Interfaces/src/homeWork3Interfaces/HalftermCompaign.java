package homeWork3Interfaces;

public class HalftermCompaign implements Campaign {


    @Override
    public void addCampaign(Game game) {
        System.out.println("Half Term Ýndirim Yüzdesi: %30");
        System.out.println("Oyun Ücreti: " + game.price);
        System.err.println("Karne Hediyesi indirimi uygulanýyor");
        game.price = game.price - (0.3 * game.price);
        System.out.println("indirim uygulandý FÝyat:" + game.price);
    }

    @Override
    public void updateCampaign(Game game) {
        System.out.println("Güncellenen Half Term Ýndirim Yüzdesi: %45");
    }

    @Override
    public void deleteCampaign(Game game) {
        System.out.println("Half Term Kampanyasý Sonlandý...");
	
    }
}
