package day0822;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import kr.co.sist.dao.DbConn;

public class Work0821DAO extends JFrame{
	
	 private Work0821info info;
	 private JList<String> jlist;
	 private JTextField jtfempno;
	 private JTextField jtfempname;
	 private JTextField jtfhiredate;
	 private JTextField jtfjob;
	 private JTextField jtfsal;
	
	
	public Work0821DAO() throws SQLException{
		super("emp테이블");
		
		 jtfempno = new JTextField(10);
	        jtfempname = new JTextField(30);
	        jtfhiredate = new JTextField(30);
	        jtfjob = new JTextField(20);
	        jtfsal = new JTextField(20);
	        
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		
		DbConn dc=DbConn.getInstance();
		
		try {
			con=dc.getConnection("localhost", "scott", "tiger");
			String select="select empno from emp";
			pstmt=con.prepareStatement(select);
			
			rs=pstmt.executeQuery();
			
			DefaultListModel<String> dlmlist=new DefaultListModel<>();
			jlist=new JList<>(dlmlist);
			
			dlmlist.addElement("EMPNO");
			while(rs.next()) {
				int empno=rs.getInt("empno");
				
				dlmlist.addElement(String.valueOf(empno));
			}
			JScrollPane jspCenter=new JScrollPane(jlist);
			jspCenter.setBorder(new TitledBorder("사원번호들"));
			
			add("Center",jspCenter);
			
			
			
			Work0821Evt wevt=new Work0821Evt(this);
			jlist.addMouseListener(wevt);
			
			addMouseListener(wevt);
			
			setVisible(true);
			setSize(300,300);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
		}finally {
			dc.dbClose(rs, pstmt, con);
		}
	}
	
	public void clearField() {
		jtfempno.setText("");
		jtfempname.setText("");
		jtfhiredate.setText("");
		jtfjob.setText("");
		jtfsal.setText("");
	}
	
	public JList<String> getJlist() {
		return jlist;
	}

	public JTextField getJtfempno() {
		return jtfempno;
	}

	public JTextField getJtfempname() {
		return jtfempname;
	}

	public JTextField getJtfhiredate() {
		return jtfhiredate;
	}

	public JTextField getJtfjob() {
		return jtfjob;
	}

	public JTextField getJtfsal() {
		return jtfsal;
	}

	public static void main(String []agrs) {
		try {
			new Work0821DAO();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
	
	
}
