package ver3_configuration;

import org.springframework.stereotype.Repository;

//class BoardDaoMysql
@Repository
public class KoreaTire implements Tire {
	@Override
	public String getModel() {
		return "국산"; // 실제 sql 실행 구현부
	}
}
