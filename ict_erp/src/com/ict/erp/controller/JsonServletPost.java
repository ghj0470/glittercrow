package com.ict.erp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.ict.erp.service.MusicService;
import com.ict.erp.service.impl.MusicServiceImpl;
import com.ict.erp.vo.MusicChart;


@WebServlet(
		urlPatterns = "/json/*"
		)
public class JsonServletPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  Gson gs = new Gson();

//	public static Type getMapType(Class keyType,Class valueType) {
//		return TypeToken<T>.getParameterized(HashMap.class, keyType,valueType).
//	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	
//		List<String> strList = new ArrayList<String>();
//		for(int i=1;i<=10;i++) {
//			strList.add("번호 : "+i);
//		}
//		String resStr = gs.toJson(strList);
//		pw.println(resStr);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String,String> pMap = gs.fromJson(request.getParameter("param"), Map.class);
		System.out.println(pMap);
		response.setContentType("text/html;charset=utf-8"); //회사용 프로그램보면 엑셀을 만들수있는버튼잉 있는데 생성할수있는 라이브러리를 넣고 워크디렉토리에 넣고 ...
		PrintWriter pw = response.getWriter();
		MusicService ds =new MusicServiceImpl();
		try {
			List<MusicChart> MusicChart = ds.selectMusicList(null);
			String resStr = gs.toJson(MusicChart);
			pw.println(resStr);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		doGet(request, response);
	}

	public static void main(String[] args) { //[리스트] {map} 괄호로 구분
               String jsonStr = "{\"a\":\"1\"}";
               String jsonStr2 = "[{\"a\":\"1\"},{\"a\":\"1\"}]";
               Gson gs = new Gson();
               Map<String,String> map = gs.fromJson(jsonStr, Map.class);
               List<Map<String,String>> list = gs.fromJson(jsonStr2, List.class);
               System.out.println(map.get("a"));
               System.out.println(list);
	}
}
