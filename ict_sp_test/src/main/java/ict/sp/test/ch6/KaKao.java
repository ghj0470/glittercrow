package ict.sp.test.ch6;

import org.springframework.aop.framework.ProxyFactory;

public class KaKao {
	public static void main(String[] args) {
		Chatting c = new ICTChatting();
		ProxyFactory pf = new ProxyFactory();
		ChatAdvice ac =new ChatAdvice();
		pf.addAdvice(ac);
		pf.setTarget(c);
		
		Chatting pc = (Chatting)pf.getProxy();
		pc.chat();
		System.out.println(pc.getFile());

	}

}
