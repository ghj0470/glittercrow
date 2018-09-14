package ict.sp.test.ch5;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class Zealot implements MethodReplacer{



	@Override
	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("손톱으로 공격합니다");
		return null;
	}

}
