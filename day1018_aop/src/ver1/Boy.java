package ver1;

import java.util.Random;

public class Boy {
	public void makeFood() {
		System.out.println("배고프다");
		try {
			if(new Random().nextBoolean()) {
				throw new Exception("불났다!~!");
			}
			System.out.println("치킨을 만든다."); // 핵심 관심사항임
			System.out.println("음식을 먹겠지!!!"); //핵심 이후에 실행
		} catch (Exception e) {
			System.out.println("도와주세영");
		} finally {
			System.out.println("설거지하자");
		}
	}
}
