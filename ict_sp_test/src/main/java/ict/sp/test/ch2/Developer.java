package ict.sp.test.ch2;

import org.springframework.stereotype.Service;

@Service
public class Developer implements Emp {

	@Override
	public void goForWork() {
		System.out.println("개발자가 출근합니다");

	}

	@Override
	public void doWorking() {
		System.out.println("개발자가 일중입니다");
	}

	@Override
	public void goHome() {
		System.out.println("개발자가 퇴근!! 하지만 밤 11시");
	}

}
