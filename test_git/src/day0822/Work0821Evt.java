package day0822;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JList;

import kr.co.sist.dao.DbConn;

public class Work0821Evt extends MouseAdapter {
	
	private Work0821DAO wDAO;
	private JList<String>jlist;
	
	public Work0821Evt(Work0821DAO wDAO) {
		this.wDAO=wDAO;
		this.jlist=wDAO.getJlist();
	}

	@Override
	public void mouseClicked(MouseEvent me) {
		if(me.getSource()==jlist&& me.getClickCount()==1) {
			String selectEmpno=jlist.getSelectedValue();
			if(selectEmpno!=null && !selectEmpno.equals("EMPNO")) {
				int empno=Integer.parseInt(selectEmpno);
				DbConn dc=DbConn.getInstance();
				Connection con=null;
				PreparedStatement pstmt=null;
				ResultSet rs=null;
				
				try{
					con=dc.getConnection("localhost", "scott", "tiger");
					String select="select empno,ename,hiredate,job,sal from emp where empno=?";
					pstmt=con.prepareStatement(select);
					pstmt.setInt(1, empno);
					rs=pstmt.executeQuery();
					
					if(rs.next()) {
						String empName=rs.getString("ename");
						String hireDate=rs.getString("hiredate");
						String job=rs.getString("job");
						String sal=rs.getString("sal");
						
						Work0821info info=new Work0821info();
						info.setEmpnoField(selectEmpno);
						info.setEmpnameField(empName);
						info.setHiredateField(hireDate);
						info.setJobField(job);
						info.setSalField(sal);
						
					}
				}catch(SQLException e) {
					e.printStackTrace();
				}finally {
					try {
						dc.dbClose(rs, pstmt, con);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
				
				
			}else {
				wDAO.clearField();
			}
		}
	}
	
	
	
	
}
