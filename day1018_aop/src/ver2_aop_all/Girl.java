package ver2_aop_all;

import java.util.Random;

public class Girl implements Person{
	public void makeFood() throws Exception {

		if (new Random().nextBoolean()) {
			throw new Exception("불났다!~!");
		}
		System.out.println("라면을 만든다."); // 핵심 관심사항임
		
	}
}
