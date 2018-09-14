package ict.sp.test.ch4;

public class Dog implements Animal {

	@Override
	public void attack() {
		System.out.println("할퀴는정도");

	}

	@Override
	public void howl() {
		System.out.println("멍멍~");

	}

	@Override
	public void sleep() {
		System.out.println("쿨");
	}

}
