package ver3_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("ver3_configuration")
public class Beans {
//	@Bean // <bean> 태그랑 동일 
//	public Car sonata() {
//		Car c = new Car();
//		c.setTire(koreaTire()); // <property> 태그랑 동일
//		return c;
//	}
//	@Bean
//	public Tire koreaTire() {
//		return new KoreaTire();
//	}
//	@Bean
//	public Tire chinaTire() {
//		return new ChinaTire();
//	}
}
