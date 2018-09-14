package ict.sp.test.ch7;

public class ICTChatting implements Chatting {
	
	
	public void chat() {
		System.out.println("챗~");
	}

	@Override
	public String getFile() {
		System.out.println("파일아무개 출력");
		return "파일 아무개";
	}

}
