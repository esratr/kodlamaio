import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.PlayerCheckManager;
import Concrete.PlayerManager;
import Concrete.SaleManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Player;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {

		Player player1 = new Player();

		player1.setPlayerId(1);
		player1.setFirstName("Esra");
		player1.setLastName("Týrpancý");
		player1.setEmail("sdhjsgfhsdf");
		player1.setNationaltyIdNumber(12345678912L);
		player1.setDateOfBirth(1996);

		Player player2 = new Player();

		player2.setPlayerId(2);
		player2.setFirstName("Engin");
		player2.setLastName("Demiroð");
		player2.setEmail("sdmsjhfefksdlsl");
		player2.setNationaltyIdNumber(12345678912L);
		player2.setDateOfBirth(1985);

		Game game1 = new Game();

		game1.setGameId(1);
		game1.setGameName("NFS");
		game1.setGamePrice(500);
		game1.setDiscount(0);

		Game game2 = new Game();

		game2.setGameId(1);
		game2.setGameName("NFS");
		game2.setGamePrice(500);
		game2.setDiscount(0);

		Campaign campaign1 = new Campaign();
		campaign1.setCampaignId(1);
		campaign1.setCampaignName("Yeni yýl ");
		campaign1.setDiscountPercent(30);
		campaign1.setDuration("20 Gün");

		Sale sale1 = new Sale();
		sale1.setSaleId(1);
		sale1.setSaLePrice(100);
		sale1.setDetail("NFS oyunu satýþý");
		sale1.setCount(1);

		PlayerManager playerManager = new PlayerManager();
		CampaignManager campainManager = new CampaignManager();
		GameManager gameManager = new GameManager();
		SaleManager saleManager = new SaleManager();

		playerManager.addPlayer(player2);
		playerManager.addPlayer(player1);

		gameManager.addGame(game1, player1);
		gameManager.addGame(game1, player2);
		gameManager.updateGame(game2, player2);

		campainManager.addCampaign(campaign1, player2);
		saleManager.saleGame(sale1, game2, player2);

		saleManager.saleGame(sale1, game2, player2, campaign1);

		PlayerCheckManager check = new PlayerCheckManager();

		check.checkIfRealPlayer(player1);
		
	}

}
