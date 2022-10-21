package lab2_3_3;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookAspect {
	@Pointcut("execution(void doSomething())")
	public void dodo() {}
	
	@Before("dodo()")
	public void Before() {
		System.out.println("도서관에 갑니다");
	}
	
	@AfterReturning("dodo()")
	public void After_Return() {
		System.out.println("읽은 것을 정리합니다.");
	}
	
	@After("dodo()")
	public void After() {
		System.out.println("집으로 돌아갑니다.");
	}
	
	@AfterThrowing("dodo()")
	public void After_Throw() {
		System.out.println("화장실다녀왔다.");
	}
}
