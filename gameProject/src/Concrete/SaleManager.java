package Concrete;

import Abstract.SaleService;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class SaleManager implements SaleService {

	@Override
	public void saleGame(Sale sale, Game game, Player player, Campaign campaign) {
		double newSale= sale.getSaLePrice()-((sale.getSaLePrice()*campaign.getDiscountPercent())/100);
		System.out.println(campaign.getCampaignName()  + " kampanyası " + game.getGameName() + " oyununa uygulanmış " +
		newSale + " yeni fiyatıyla " + player.getFirstName() + " oyuncusuna " + sale.getCount() + " adet satışı gerçekleştirilmiştir.");

	}

	@Override
	public void saleGame(Sale sale, Game game, Player player) {
		System.out.println(player.getFirstName() + " oyuncusuna " + game.getGameName() + "  oyunu " + game.getGamePrice()+ " fiyatından "+
	sale.getCount() + "  adet satışı gerçekleştirildi.");
	}
}