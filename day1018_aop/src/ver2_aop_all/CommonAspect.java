package ver2_aop_all;

//공통 관심사핳 구현 클래스ㅜ
public class CommonAspect {
	public void bbbefore() {
		System.out.println("배가 고프죠");
	}
	public void aaafter() {
		System.out.println("설거지를 해");
	}
	public void aaafterReturning() {
		System.out.println("음식을 먹자");
	}
	public void aaafterThrowing() {
		System.out.println("엄ㅁ~ㅏ~ㅏ~~~!");
	}
}
