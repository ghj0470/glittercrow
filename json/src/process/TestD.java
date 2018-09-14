package process;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import common.DBCon;
import json.Test;

public class TestD {
	
	public List<Test> getTest(){
		
		Connection con = DBCon.getCon();
		
		String sql = "select * from depart_info";
		
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			List<Test> tList = new ArrayList<Test>();
			
			while(rs.next()) {
				Test t = new Test();
				t.setDinum(rs.getString("dinum"));
				t.setDiname(rs.getString("diname"));
				t.setDicode(rs.getString("dicode"));
				t.setDidesc(rs.getString("didesc"));
				tList.add(t);
				
			}
			return tList;
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
	}

}
