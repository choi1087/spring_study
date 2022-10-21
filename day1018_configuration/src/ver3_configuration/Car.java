package ver3_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

//BoardService -> Dao 의존하는 클래스.
@Service
public class Car {
	@Autowired
	private Tire tire;
	@Value("red")
	private String color;
//	public Car(Tire tire) {
//		this.tire = tire;
//	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void run() {
		System.out.println("차량 주행중(서비스 객체 일하는 중 with Tire)");
		System.out.println("장착 타이어 정보 : "+tire.getModel()+"/"+this.color);
	}
}
