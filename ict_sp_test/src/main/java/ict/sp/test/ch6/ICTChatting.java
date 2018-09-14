package ict.sp.test.ch6;

public class ICTChatting implements Chatting {
	
	
	public void chat() {
		System.out.println("챗~");
	}

	@Override
	public String getFile() {
		System.out.println("실행은 했당");
		return "파일 아무개";
	}

}
