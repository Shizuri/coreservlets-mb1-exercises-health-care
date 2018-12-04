package health;

public class HealthPlan {

	private String healthPlanName, phoneNumber;
	private double premium;
	
	public HealthPlan() {
		
	}
	public HealthPlan(String healthPlanName, String phoneNumber, double premium) {
		super();
		this.healthPlanName = healthPlanName;
		this.phoneNumber = phoneNumber;
		this.premium = premium;
	}
	
	public String getHealthPlanName() {
		return healthPlanName;
	}
	public void setHealthPlanName(String healthPlanName) {
		this.healthPlanName = healthPlanName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	
}
