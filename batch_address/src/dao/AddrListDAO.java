package dao;

import java.sql.SQLException;
import java.util.List;

public interface AddrListDAO {
	public int insertAddrListBatch(List<List<String>>list) throws SQLException;

}
