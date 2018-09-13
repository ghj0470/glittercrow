package json;

import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;

public class ParseTest {
	public static void main(String[] args) {
		Gson gson = new Gson();
		String param = "{\"name\":\"홍길동\"}";
         // Map<String,String> map = new HashMap<String,String>();	
         Map<String,String>  paramMap = gson.fromJson(param,Map.class);
	     System.out.println(paramMap);
	}

}
