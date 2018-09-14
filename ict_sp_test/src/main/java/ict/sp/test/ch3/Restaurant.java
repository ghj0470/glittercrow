package ict.sp.test.ch3;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

@Service("rest")
public class Restaurant {
	@Autowired
	private List<Food> foods;
	@Autowired
	@Qualifier("pasta")
	private Food food1;
	@Autowired
	@Qualifier("pizza")
	private Food food2;
	
	@Autowired
	@Qualifier("gobchang")
	private Food food3;
	
	
	public List<Food> getFood(){
		return foods;
	}
	public Food getPasta() {
		return food1;
	}
	public Food getPizza() {
		return food2;
	}
	public Food getGobchang() {
		return food3;
	}
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("ch3/ioc.xml");
		Restaurant r = (Restaurant)ac.getBean("rest");
		List<Food> a = r.getFood();
		for(Food b: a) {
			b.buy();
			b.sell();
		}
		r.getPasta().buy();
		r.getPizza().sell();
		
	}
}
