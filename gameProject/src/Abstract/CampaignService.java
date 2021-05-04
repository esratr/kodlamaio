package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;

public interface CampaignService {
	void addCampaign(Campaign campaign,Player player);
	void deleteCampaign(Campaign campaign,Player player);
	void updateCampaign(Campaign campaign,Player player);
	void show(Campaign campaign,Game game);
	
}
