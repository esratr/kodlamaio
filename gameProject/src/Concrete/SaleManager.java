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
		System.out.println(campaign.getCampaignName()  + " kampanyasý " + game.getGameName() + " oyununa uygulanmýþ " +
		newSale + " yeni fiyatýyla " + player.getFirstName() + " oyuncusuna " + sale.getCount() + " adet satýþý gerçekleþtirilmiþtir.");

	}

	@Override
	public void saleGame(Sale sale, Game game, Player player) {
		System.out.println(player.getFirstName() + " oyuncusuna " + game.getGameName() + "  oyunu " + game.getGamePrice()+ " fiyatýndan "+
	sale.getCount() + "  adet satýþý gerçekleþtirildi.");
	}
}