package ict.sp.test.ch1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import ict.sp.test.ch2.Emp;

@Service("cg")
public class ConsoleGame {
	
	@Autowired
	List<Game> gameList;
	
	public void doWorking() {
		for(Game e: gameList) {
			e.attack();
		}
	}
	private Game game;
	
	public ConsoleGame() {
		System.out.println("난 파싱후 겟빈할때 호출");
	}
	public void setGame(Game g) {
		this.game= g;
	}
	public void on() throws Exception {
		if(game==null) {
			throw new Exception("게임팩이 없네요~");
		}
		System.out.println("로딩 완료");
	}
	public void startGame() {
		game.start();
		game.attack();
		game.jump();
	}
	public void off() {
		game.end();
	}
}
