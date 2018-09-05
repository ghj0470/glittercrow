package dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import batch_address.DBCon;
import dao.AddrListDAO;

public class AddrListDAOImpl implements AddrListDAO {
	ResultSet rs = null;
	Connection con = DBCon.getCon();
	PreparedStatement ps = null;

	@Override
	public int insertAddrListBatch(List<List<String>> list) throws SQLException {
		long s = System.currentTimeMillis();
		con = DBCon.getCon();
		String sql = "insert into addr_list values(seq_alNum.nextval,?,?,?,?,?,?,?,?,?,?,?,?)";
		int result = 0;
        int cnt = 0;
		
		try {
			ps = con.prepareStatement(sql);
			for(List<String> li:list) {
				for(int i=0 ; i<li.size(); i++) {
						ps.setString(i+1, li.get(i));
				}
				cnt++;
				ps.addBatch();
				ps.clearParameters();
				if(cnt+1%100==0 || cnt+1==list.size()) {
					result += ps.executeBatch().length;
				}
			}
			DBCon.commit();
		} catch (SQLException e) {
			DBCon.rollback();
			throw e;
		} finally {
			DBCon.close();
		}
		System.out.println("걸린시간 :" + (System.currentTimeMillis() - s));
		return result;

	}

}
