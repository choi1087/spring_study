package ver3_configuration;

import org.springframework.stereotype.Repository;

//class BoardDaoOracle
//@Repository
public class ChinaTire implements Tire {
	@Override
	public String getModel() {
		return "대륙";
	}
}
