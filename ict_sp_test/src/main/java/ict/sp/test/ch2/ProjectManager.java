package ict.sp.test.ch2;

import org.springframework.stereotype.Service;

@Service
public class ProjectManager implements Emp {

	@Override
	public void goForWork() {
		System.out.println("플젝관리자가 출근 합니다");

	}

	@Override
	public void doWorking() {
		System.out.println("플젝 관리자님이 일하는척을 시연하는중입니다");

	}

	@Override
	public void goHome() {
		System.out.println("외근은 곧 퇴근");

	}

}
