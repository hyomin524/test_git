package kr.co.sist.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DbConn {

	private static DbConn dbConn;
	
	private DbConn() {
		
	}//DbConn
	
	public static DbConn getInstance() {
		if(dbConn==null) {
			dbConn=new DbConn();
		}//end if
		return dbConn;
	}//getInstance
	
	public Connection getConnection(String ip,String id, String pass) throws SQLException {
		Connection con=null;
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}//end catch
		
		String url="jdbc:oracle:thin:@"+ip+":1521:orcl";
		con=DriverManager.getConnection(url,id,pass);//여기서도 예외는 날려줌
		return con;
	}//getInstance
	
	public void dbClose(ResultSet rs, Statement stmt,Connection con)throws SQLException{
		if(rs!=null) {
			rs.close();//end if
		}
		if(stmt!=null) {
			stmt.close();//end if
		}
		if(con!=null) {
			con.close();//end if
		}
	}
	
}//class
