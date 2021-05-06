package homeWork3Interfaces;

public class CampaignManager extends Game{
	
	


	
	public void createCampaign(Campaign campaign, Game game){
        campaign.addCampaign(game);
    }
    
    public void deleteCampaign(Campaign campaign, Game game) {
        campaign.deleteCampaign(game);
    }
    
    public void updateCampaign(Campaign campaign, Game game) {
        campaign.updateCampaign(game);
    }
		
	}

