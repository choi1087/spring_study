package lab2_3_1;

import java.util.Random;

public class Reader implements Person{

	@Override
	public void doSomething() throws RestroomException {
		System.out.println("열심히 책을 읽습니다."); // 핵심 관심사항임
		if (new Random().nextBoolean()) {
			throw new RestroomException();
		}
	}

}
