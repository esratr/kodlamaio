package Entities;

public class Sale implements BaseEntity {
	
	private int saleId;
	private String detail;
	private double saLePrice;
	private int count;
	
	
	
	public Sale(int saleId, String detail, double saLePrice, int count) {
		super();
		this.saleId = saleId;
		this.detail = detail;
		this.saLePrice = saLePrice;
		this.count = count;
	}



	public Sale() {

	}



	public int getSaleId() {
		return saleId;
	}


	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}


	public String getDetail() {
		return detail;
	}


	public void setDetail(String detail) {
		this.detail = detail;
	}


	public double getSaLePrice() {
		return saLePrice;
	}


	public void setSaLePrice(double saLePrice) {
		this.saLePrice = saLePrice;
	}


	public int getCount() {
		return count;
	}


	public void setCount(int count) {
		this.count = count;
	}



	

}
