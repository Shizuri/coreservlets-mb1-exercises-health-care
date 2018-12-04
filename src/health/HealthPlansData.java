package health;

import java.util.ArrayList;
import java.util.List;

public class HealthPlansData implements HealthPlanFinder{
	
	private List<HealthPlan> plans;
	
	public HealthPlansData() {
		plans = new ArrayList<>();
		plans.add(new HealthPlan("First Plan", "123-123-123", 500));
		plans.add(new HealthPlan("Second Plan", "456-456-456", 1500));
		plans.add(new HealthPlan("Third Plan", "qwer-asdf-zxcv", 90000.231543));
	}

	@Override
	public HealthPlan findHealthPlan(String healthPlanName) {
		for(HealthPlan p : plans) {
			if(p.getHealthPlanName().equals(healthPlanName)) {
				return p;
			}
		}
		return null;
	}

}
