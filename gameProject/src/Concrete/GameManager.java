package Concrete;

import Abstract.GameService;
import Entities.Game;
import Entities.Player;

public class GameManager implements GameService {

	@Override
	public void addGame(Game game,Player player) {
		System.out.println(player.getFirstName() + " oyuncusuna " + game.getGameName() +" oyunu eklendi. ");
		
	}

	@Override
	public void deleteGame(Game game, Player player) {
		System.out.println(player.getFirstName() + " oyuncusundan " + game.getGameName() +" oyunu silindi. ");
	}

	@Override
	public void updateGame(Game game , Player player) {
		System.out.println(player.getFirstName() + " oyuncusunun " + game.getGameName() +" oyunu güncellendi. ");
	}

}
