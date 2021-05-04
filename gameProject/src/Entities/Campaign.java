package Entities;

public class Campaign implements BaseEntity {
	
	private int campaignId;
	private String campaignName;
	private double discountPercent;
	private String duration;
	
	public Campaign() {
		
	}

	public Campaign(int campaignId, String campaignName, double discountPercent, String duration) {
		super();
		this.campaignId = campaignId;
		this.campaignName = campaignName;
		this.discountPercent = discountPercent;
		this.duration = duration;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public String getCampaignName() {
		return campaignName;
	}

	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}

	public double getDiscountPercent() {
		return discountPercent;
	}

	public void setDiscountPercent(double discountPercent) {
		this.discountPercent = discountPercent;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	

}
