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
		System.out.println(campaign.getCampaignName()  + " kampanyas� " + game.getGameName() + " oyununa uygulanm�� " +
		newSale + " yeni fiyat�yla " + player.getFirstName() + " oyuncusuna " + sale.getCount() + " adet sat��� ger�ekle�tirilmi�tir.");

	}

	@Override
	public void saleGame(Sale sale, Game game, Player player) {
		System.out.println(player.getFirstName() + " oyuncusuna " + game.getGameName() + "  oyunu " + game.getGamePrice()+ " fiyat�ndan "+
	sale.getCount() + "  adet sat��� ger�ekle�tirildi.");
	}
}