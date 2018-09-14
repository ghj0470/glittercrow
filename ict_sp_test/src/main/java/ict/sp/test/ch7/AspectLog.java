package ict.sp.test.ch7;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.aop.aspectj.MethodInvocationProceedingJoinPoint;

@Aspect
public class AspectLog {
	
	//ch7 대상을 유동적으로 받는법 ch6은 타겟팅을 하드코딩해서 지정
//	@Around("execution(* ict.sp.test.ch7.Chatting.getFile())") // * 는 public같은 접근제어자를 적어주는곳 이여서 띄어써야한다
//	@Around("execution(* ict.sp.test.ch7.*.*())")        //해당 패키지 전체
//	@Around("execution(* ict.sp.test.ch7.Chatting.*())") //해당클래스 전체
	@Around("execution(* ict.sp.test.ch7.*Chatting.**())")//클래스이름이 채팅으로끝나고 어떤한타입도 상관없다
	
	//public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
	public Object aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {	
	    System.out.println("실행전");
		//pjp.proceed();
	    System.out.println(pjp instanceof MethodInvocationProceedingJoinPoint);
        Object obj = pjp.proceed();
		System.out.println("실행후!");  //DI :의존성주입
		return obj;                   //IOC : 역전제어 AOP:관점지향 프로그램 
	}                                //스프링쓰는 관점
	
}
