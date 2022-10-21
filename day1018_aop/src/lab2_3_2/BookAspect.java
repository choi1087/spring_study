package lab2_3_2;

import org.aspectj.lang.ProceedingJoinPoint;

public class BookAspect {
	public void aaround(ProceedingJoinPoint joinpoint) throws RestroomException {
		System.out.println("도서관에 갑니다");
		try {
			joinpoint.proceed();
			System.out.println("책을 정리합니다.");
		}catch (Throwable e) {
			
		}finally {
			System.out.println("집으로 돌아갑니다.");
		}
	}
}
