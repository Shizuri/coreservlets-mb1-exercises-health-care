package health;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class ClientHandler {

	private String id, name, healthPlanName = "First Plan";
	
	private HealthPlanFinder planFider = new HealthPlansData();
	
	private HealthPlan chosenPlan;
	
	public ClientHandler() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Client Handler instantiated at: " + dtf.format(now));
	}

	public HealthPlan getChosenPlan() {
		return chosenPlan;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getHealthPlanName() {
		return healthPlanName;
	}

	public void setHealthPlanName(String healthPlanName) {
		this.healthPlanName = healthPlanName;
	}

	public String response() {
		if(hasData(id) && hasData(name) && hasData(healthPlanName)) {
			chosenPlan = planFider.findHealthPlan(healthPlanName);
			return "success";
		}
		return "error";
	}
	
	private boolean hasData(String value) {
		if(value == null || value.trim().isEmpty()) {
			return false;
		}
		return true;
	}
}
