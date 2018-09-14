package ict.sp.test.ch3;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Service
@Order(1)
public class Pizza implements Food {

	@Override
	public void sell() {
		System.out.println("피자를 팝니다");
	}

	@Override
	public void buy() {
		System.out.println("피자재료를 삽니다");
	}

}
