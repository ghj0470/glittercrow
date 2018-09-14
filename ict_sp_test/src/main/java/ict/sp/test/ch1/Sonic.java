package ict.sp.test.ch1;

import org.springframework.stereotype.Service;

@Service("so")
public class Sonic extends Game{

	@Override
	public void attack() {
		System.out.println("돌면서 공격!!");
	}

	@Override
	public void jump() {
		System.out.println("소닉이 점프!!");
	}

}
