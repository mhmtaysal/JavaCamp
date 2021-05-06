package homeWork3Interfaces;

public class HalftermCompaign implements Campaign {


    @Override
    public void addCampaign(Game game) {
        System.out.println("Half Term �ndirim Y�zdesi: %30");
        System.out.println("Oyun �creti: " + game.price);
        System.err.println("Karne Hediyesi indirimi uygulan�yor");
        game.price = game.price - (0.3 * game.price);
        System.out.println("indirim uyguland� F�yat:" + game.price);
    }

    @Override
    public void updateCampaign(Game game) {
        System.out.println("G�ncellenen Half Term �ndirim Y�zdesi: %45");
    }

    @Override
    public void deleteCampaign(Game game) {
        System.out.println("Half Term Kampanyas� Sonland�...");
	
    }
}
