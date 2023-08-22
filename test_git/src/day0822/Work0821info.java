package day0822;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Work0821info extends JFrame{
	private JLabel jlblempno;
	private JLabel jlblempname;
	private JLabel jlblhiredate;
	private JLabel jlbljob;
	private JLabel jlblsal;
	
	private JTextField jtfempno;
	private JTextField jtfempname;
	private JTextField jtfhiredate;
	private JTextField jtfjob;
	private JTextField jtfsal;
	
	
	public Work0821info() {
		super("emp테이블");
		jlblempno=new JLabel("사원번호");
		jlblempname=new JLabel("사원명");
		jlblhiredate=new JLabel("입사일");
		jlbljob=new JLabel("직무");
		jlblsal=new JLabel("연봉");
		
		jtfempno=new JTextField(10);
		jtfempname=new JTextField(30);
		jtfhiredate=new JTextField(30);
		jtfjob=new JTextField(20);
		jtfsal=new JTextField(20);
		
		add(jlblempno);
		add(jlblempname);
		add(jlblhiredate);
		add(jlbljob);
		add(jlblsal);
		
		add(jtfempno);
		add(jtfempname);
		add(jtfhiredate);
		add(jtfjob);
		add(jtfsal);
		

		setLayout(null);
		
		jlblempno.setBounds(30,10,50,50);
		jlblempname.setBounds(30, 50, 50, 50);
		jlblhiredate.setBounds(30, 90, 50, 50);
		jlbljob.setBounds(30, 130, 50, 50);
		jlblsal.setBounds(30, 170, 50, 50);
		
		jtfempno.setBounds(100, 20, 130, 30);
		jtfempname.setBounds(100, 60, 130, 30);
		jtfhiredate.setBounds(100, 100, 130, 30);
		jtfjob.setBounds(100, 140, 130, 30);
		jtfsal.setBounds(100, 180, 130, 30);
		
		
		setBounds(400,400,300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	public void setEmpnoField(String value) {
        jtfempno.setText(value);
    }

    public void setEmpnameField(String value) {
        jtfempname.setText(value);
    }

    public void setHiredateField(String value) {
        jtfhiredate.setText(value);
    }

    public void setJobField(String value) {
        jtfjob.setText(value);
    }

    public void setSalField(String value) {
        jtfsal.setText(value);
    }
    
	public void setJlblempno(JLabel jlblempno) {
		this.jlblempno = jlblempno;
	}

	public void setJlblempname(JLabel jlblempname) {
		this.jlblempname = jlblempname;
	}

	public void setJlblhiredate(JLabel jlblhiredate) {
		this.jlblhiredate = jlblhiredate;
	}

	public void setJlbljob(JLabel jlbljob) {
		this.jlbljob = jlbljob;
	}

	public void setJlblsal(JLabel jlblsal) {
		this.jlblsal = jlblsal;
	}

	public void setJtfempno(JTextField jtfempno) {
		this.jtfempno = jtfempno;
	}

	public void setJtfempname(JTextField jtfempname) {
		this.jtfempname = jtfempname;
	}

	public void setJtfhiredate(JTextField jtfhiredate) {
		this.jtfhiredate = jtfhiredate;
	}

	public void setJtfjob(JTextField jtfjob) {
		this.jtfjob = jtfjob;
	}

	public void setJtfsal(JTextField jtfsal) {
		this.jtfsal = jtfsal;
	}

	public static void main(String[]args) {
		new Work0821info();
	}

	public void setJtfempno(String selectEmpno) {
		// TODO Auto-generated method stub
		
	}

	public void setJtfempname(String empName) {
		// TODO Auto-generated method stub
		
	}

	public void setJtfhiredate(String hireDate) {
		// TODO Auto-generated method stub
		
	}

	public void setJtfsal(String sal) {
		// TODO Auto-generated method stub
		
	}
}
