package Abstract;

import Entities.Game;
import Entities.Player;

public interface GameService  {
	
	void addGame(Game game, Player player);
	void deleteGame(Game game,Player player);
	void updateGame(Game game,Player player);
	

}
