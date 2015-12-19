import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.web.SSH.DaoImpl.DaoImpl;
import com.web.SSH.dao.Dao;

public class connectTest {
	private static Dao dao = new DaoImpl(); 
	
	public static void main(String[] args) throws Exception {
		String querysql = "select * from users";
		Connection conn = dao.getConn();
		PreparedStatement pstmt = conn.prepareStatement(querysql);
		ResultSet rst = pstmt.executeQuery();
		
		while (rst.next()) {
			System.out.println(rst);
		}
	}
}
