package ict.sp.test.ch1;

import org.springframework.stereotype.Service;

@Service("kf")
public class KOF extends Game {

		@Override
		public void attack() {
			System.out.println("캐릭터가 공격!!");
			
		}

		@Override
		public void jump() {
			System.out.println("캐릭터가 점프!!");
			
		}
}
