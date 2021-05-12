package Entities;

public class Game implements BaseEntity{
	
	private int gameId;
	private String gameName;
	private double gamePrice;
	private double discount;
	
	
	public Game() {
		
	}

	public Game(int gameId, String gameName, double gamePrice) {
		super();
		this.gameId = gameId;
		this.gameName = gameName;
		this.gamePrice = gamePrice;
		
	}

	
	public int getGameId() {
		return gameId;
	}

	public void setGameId(int gameId) {
		this.gameId = gameId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public double getGamePrice() {
		return gamePrice;
	}

	public void setGamePrice(double gamePrice) {
		this.gamePrice = gamePrice;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getAfterDiscountGamePrice() {
		return this.gamePrice-(this.gamePrice*this.discount);
	}

	
	
	
	

}
