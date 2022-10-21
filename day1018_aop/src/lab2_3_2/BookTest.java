package lab2_3_2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BookTest {
	public static void main(String[] args) throws RestroomException {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("lab2_3_2/beans.xml");
		
		Person reader = ctx.getBean(Person.class);
		reader.doSomething();
	}
}
