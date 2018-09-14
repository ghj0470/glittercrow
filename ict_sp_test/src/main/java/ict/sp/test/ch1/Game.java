package ict.sp.test.ch1;

public abstract class Game implements Action {

	public Game() {
		System.out.println("게임생성자");
	}
	@Override
	public abstract void attack();

	@Override
	public abstract void jump();
	@Override
	public void start() {
		System.out.println("게임을 시작합니다.");

	}

	@Override
	public void end() {
		System.out.println("게임을 종료합니다.");
	}

}
