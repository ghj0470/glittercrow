package ict.sp.test.ch4;

import ict.sp.test.ch1.Action;

public class Cat implements Animal {

	@Override
	public void attack() {
		System.out.println("겁나아파");
	}

	@Override
	public void howl() {
		System.out.println("야옹~");

	}

	@Override
	public void sleep() {
		System.out.println("포르르르르르~");

	}

	
}
