package ict.sp.test.ch5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StartGame {
   public static void main(String[] args) {
	   ApplicationContext ac;
	   ac = new ClassPathXmlApplicationContext("ch/ioc.xml");
	   AttackReplace ar = (AttackReplace) ac.getBean("ac");
	   ar.getGc().attack();
	   
   }
}
