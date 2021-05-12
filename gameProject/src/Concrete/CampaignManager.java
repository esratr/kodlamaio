package Concrete;

import Abstract.CampaignService;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;


public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign, Player player) {
		System.out.println(campaign.getCampaignName() + " kampanyasý " + player.getFirstName() + " adlý oyuncuya eklendi.");
	}

	@Override
	public void deleteCampaign(Campaign campaign, Player player) {
		System.out.println(campaign.getCampaignName() + " kampanyasý " + player.getFirstName() + " adlý oyuncudan kaldýrýldý.");
		
	}

	@Override
	public void updateCampaign(Campaign campaign, Player player) {
		System.out.println(campaign.getCampaignName() + " kampanyasý " + player.getFirstName() + " oyuncusunun kampanyasý güncellendi.");
		
	}

	@Override
	public void show(Campaign campaign, Game game) {
		System.out.println(game.getGameName() + " oyununa" + campaign.getCampaignName() + " kampanyasý " + " % "+
	campaign.getDiscountPercent() + campaign.getDuration() + "süresi boyunca uygulanmýþtýr."  );
		
	}




	

}
