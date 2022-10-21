package ver3_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

// Service를 의존하는 Controller같은 클래스 (지금은 웹이 없어서 main으로 대체)
public class Main {
	public static void main(String[] args) {
		ApplicationContext ctx = // ApplicationContext 에서 객체를 가져다 쓴다~!
				new AnnotationConfigApplicationContext(Beans.class);
		Car sonata = ctx.getBean(Car.class);
		sonata.run();
	}
}
