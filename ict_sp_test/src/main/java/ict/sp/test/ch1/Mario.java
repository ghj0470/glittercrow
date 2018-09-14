package ict.sp.test.ch1;

import org.springframework.stereotype.Service;

@Service("ma")
public class Mario extends Game{

	@Override
	public void attack() {
		System.out.println("마리오가 공격!!");
		
	}

	@Override
	public void jump() {
		System.out.println("마리오가 점프!!");
		
	}

}
