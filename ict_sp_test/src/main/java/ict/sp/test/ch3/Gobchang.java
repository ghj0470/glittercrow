package ict.sp.test.ch3;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(3)
public class Gobchang implements Food{

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("곱창을 삽니다");
		
	}

	@Override
	public void buy() {
		// TODO Auto-generated method stub
		System.out.println("곱창을 삽니다");
		
	}

}
