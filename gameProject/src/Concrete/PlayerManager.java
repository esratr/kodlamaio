package Concrete;

import Abstract.PlayerService;
import Entities.Player;

public class PlayerManager implements PlayerService {

	@Override
	public void addPlayer(Player player) {
		System.out.println(player.getFirstName() + " oyuncusu eklendi. ");
		
	}

	@Override
	public void deletePlayer(Player player) {
		System.out.println(player.getFirstName() + " oyuncusu silindi. ");
		
	}

	@Override
	public void updatePlayer(Player player) {
		System.out.println(player.getFirstName() + " oyuncusunda güncelleme yapýldý. ");
		
	}


	

}
