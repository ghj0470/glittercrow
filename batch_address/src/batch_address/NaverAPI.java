package batch_address;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

import com.google.gson.Gson;

public class NaverAPI {
//  도로명 주소 id, secret키값(건물 안됨)
//	public static final String CLIENT_ID = "H_CqBDCcPRa6mOR3AqVW";
//	public static final String SLICENT_SECRET = "5m9uWVMtWH";
//  네이버 주소 검색(도로명, 건물 포함)
	public static final String CLIENT_ID = "yoTOqZYuU88m5G9I3WbQ";
	public static final String SLICENT_SECRET = "49rxTfcjD6";
	
	public static void main(String[] args) {
		try {
			String addr= URLEncoder.encode("등촌1동 라인아파트","UTF-8");
			String apiURL = "https://openapi.naver.com/v1/search/local.json?query=" + addr; 
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("GET");
            con.setRequestProperty("X-Naver-Client-Id", CLIENT_ID);
            con.setRequestProperty("X-Naver-Client-Secret", SLICENT_SECRET);
            int responseCode = con.getResponseCode();
            BufferedReader br;
            if(responseCode==200) {
                br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            } else {
                br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
            }
            String inputLine;
            StringBuffer response = new StringBuffer();
            while ((inputLine = br.readLine()) != null) {
                response.append(inputLine);
            }
            br.close();
            Gson gson = new Gson();
            Map<String,Object> map = gson.fromJson(response.toString(), Map.class);
            System.out.println("result : " + map);
            List<Object> list = (List<Object>) map.get("items");
            for(Object obj : list) {
            	System.out.println(obj);
            }
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
