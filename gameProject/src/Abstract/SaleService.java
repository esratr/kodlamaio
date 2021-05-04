package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public interface SaleService {
	
	void saleGame(Sale sale,Game game,Player player,Campaign campaign);

	void saleGame(Sale sale, Game game, Player player);
	
	

}
