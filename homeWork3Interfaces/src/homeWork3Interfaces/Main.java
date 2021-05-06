package homeWork3Interfaces;

public class Main {

	public static void main(String[] args) throws InterruptedException {
Gamer oyuncu = new Gamer(1,"12345678910","Mehmet",1997,"123asd","Mehmet@hotmail.com");
        
        GamerManager gamerManager = new GamerManager ();
        gamerManager.baseDatabaseProccess = new OracleDatabases();
        gamerManager.addGamer(oyuncu);
        
        Game game = new Game(1,"Call Of Duty",50.0,"Bu bir savaþ oyunudur");
        
        CampaignManager campaignManager = new CampaignManager();
        campaignManager.createCampaign(new SemesterHolidayCampaign(), game);
        campaignManager.deleteCampaign(new SemesterHolidayCampaign(), game);
        campaignManager.updateCampaign(new HalftermCompaign(), game);
        
        GameSellerManager gameSaller = new GameSellerManager();
        gameSaller.buyGame(game, oyuncu);
		

	
	}

}
