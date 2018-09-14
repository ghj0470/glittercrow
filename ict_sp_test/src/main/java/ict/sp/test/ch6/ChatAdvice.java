package ict.sp.test.ch6;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class ChatAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		System.out.println("채팅 시작전!!");
		Object obj = mi.proceed();
		System.out.println("채팅 실행후!!");
		return obj;
	}

}
