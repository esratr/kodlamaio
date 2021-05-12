package Concrete;

import Abstract.CampaignService;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;


public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign, Player player) {
		System.out.println(campaign.getCampaignName() + " kampanyas� " + player.getFirstName() + " adl� oyuncuya eklendi.");
	}

	@Override
	public void deleteCampaign(Campaign campaign, Player player) {
		System.out.println(campaign.getCampaignName() + " kampanyas� " + player.getFirstName() + " adl� oyuncudan kald�r�ld�.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign, Player player) {
		System.out.println(campaign.getCampaignName() + " kampanyas� " + player.getFirstName() + " oyuncusunun kampanyas� g�ncellendi.");
		
	}

	@Override
	public void show(Campaign campaign, Game game) {
		System.out.println(game.getGameName() + " oyununa" + campaign.getCampaignName() + " kampanyas� " + " % "+
	campaign.getDiscountPercent() + campaign.getDuration() + "s�resi boyunca uygulanm��t�r."  );
		
	}




	

}
