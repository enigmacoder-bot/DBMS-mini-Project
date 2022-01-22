
import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.sql.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class studentregister extends JFrame {

	private JPanel contentPane;
	private JTextField fn;
	private JLabel lblMiddleName;
	private JTextField mn;
	private JLabel lblFirstName_2;
	private JTextField ln;
	private JLabel lblSid;
	private JTextField sid;
	private JLabel lblDob;
	private JTextField dob;
	private JLabel lblFirstName_3;
	private JTextField cl;
	private JLabel lblAddress;
	private JTextField ad;
	private JLabel lblStaffId;
	private JTextField stid;
	private JLabel lblFirstName_5;
	private JTextField scid;
	private JLabel lblPhoneno;
	private JTextField ph1;
	private JLabel lblOptionalPhno;
	private JTextField ph2;
	private JLabel lblNewLabel;
	private JTextField textField_11;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					studentregister frame = new studentregister();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	Connection con;
	PreparedStatement pst;
	
	public void connect()
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/dbms","root","");
			
		}
		catch(ClassNotFoundException ex)
		{}
		catch(SQLException ex)
		{}
	}

	/**
	 * Create the frame.
	 */
	public studentregister() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 980, 488);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Student Registration", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 59, 516, 300);
		contentPane.add(panel);
		panel.setLayout(null);
		
		fn = new JTextField();
		fn.setColumns(10);
		fn.setBounds(77, 37, 86, 20);
		panel.add(fn);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.BLACK);
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName.setBounds(10, 30, 65, 31);
		panel.add(lblFirstName);
		
		lblMiddleName = new JLabel("Middle Name");
		lblMiddleName.setForeground(Color.BLACK);
		lblMiddleName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblMiddleName.setBounds(178, 30, 76, 31);
		panel.add(lblMiddleName);
		
		mn = new JTextField();
		mn.setColumns(10);
		mn.setBounds(257, 37, 84, 20);
		panel.add(mn);
		
		lblFirstName_2 = new JLabel("Last Name");
		lblFirstName_2.setForeground(Color.BLACK);
		lblFirstName_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName_2.setBounds(351, 30, 65, 31);
		panel.add(lblFirstName_2);
		
		ln = new JTextField();
		ln.setColumns(10);
		ln.setBounds(417, 37, 92, 20);
		panel.add(ln);
		
		lblSid = new JLabel("SID");
		lblSid.setForeground(Color.BLACK);
		lblSid.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblSid.setBounds(10, 88, 38, 31);
		panel.add(lblSid);
		
		sid = new JTextField();
		sid.setColumns(10);
		sid.setBounds(38, 95, 99, 20);
		panel.add(sid);
		
		lblDob = new JLabel("DOB");
		lblDob.setForeground(Color.BLACK);
		lblDob.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblDob.setBounds(147, 88, 84, 31);
		panel.add(lblDob);
		
		dob = new JTextField();
		dob.setColumns(10);
		dob.setBounds(178, 95, 99, 20);
		panel.add(dob);
		
		lblFirstName_3 = new JLabel("Class");
		lblFirstName_3.setForeground(Color.BLACK);
		lblFirstName_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName_3.setBounds(290, 88, 65, 31);
		panel.add(lblFirstName_3);
		
		cl = new JTextField();
		cl.setColumns(10);
		cl.setBounds(326, 95, 183, 20);
		panel.add(cl);
		
		lblAddress = new JLabel("Address");
		lblAddress.setForeground(Color.BLACK);
		lblAddress.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAddress.setBounds(10, 149, 65, 31);
		panel.add(lblAddress);
		
		ad = new JTextField();
		ad.setColumns(10);
		ad.setBounds(63, 156, 99, 20);
		panel.add(ad);
		
		lblStaffId = new JLabel("Staff ID");
		lblStaffId.setForeground(Color.BLACK);
		lblStaffId.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblStaffId.setBounds(178, 149, 84, 31);
		panel.add(lblStaffId);
		
		stid = new JTextField();
		stid.setColumns(10);
		stid.setBounds(228, 156, 99, 20);
		panel.add(stid);
		
		lblFirstName_5 = new JLabel("School ID");
		lblFirstName_5.setForeground(Color.BLACK);
		lblFirstName_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblFirstName_5.setBounds(337, 149, 65, 31);
		panel.add(lblFirstName_5);
		
		scid = new JTextField();
		scid.setColumns(10);
		scid.setBounds(399, 156, 110, 20);
		panel.add(scid);
		
		lblPhoneno = new JLabel("PhoneNo");
		lblPhoneno.setForeground(Color.BLACK);
		lblPhoneno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPhoneno.setBounds(10, 198, 65, 31);
		panel.add(lblPhoneno);
		
		ph1 = new JTextField();
		ph1.setColumns(10);
		ph1.setBounds(85, 205, 131, 20);
		panel.add(ph1);
		
		lblOptionalPhno = new JLabel("Alernative PhoneNo");
		lblOptionalPhno.setForeground(Color.BLACK);
		lblOptionalPhno.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOptionalPhno.setBounds(230, 198, 125, 31);
		panel.add(lblOptionalPhno);
		
		ph2 = new JTextField();
		ph2.setColumns(10);
		ph2.setBounds(351, 205, 158, 20);
		panel.add(ph2);
		
		JButton btnNewButton_1 = new JButton("Register");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String fname,mname,lname,SID,DOB,Class,address,staffid,schoolid,phone1,phone2;
				fname=fn.getText();
				mname=mn.getText();
				lname=ln.getText();
				SID=sid.getText();
				DOB=dob.getText();
				Class=cl.getText();
				address=ad.getText();
				staffid=stid.getText();
				schoolid=scid.getText();
				phone1=ph1.getText();
				phone2=ph2.getText();
				
				
				try {
					pst = con.prepareStatement("insert into student(SID,Fname,Mname,Lname,DOB,Class,Address,StaffID,SchoolID)values(?,?,?,?,?,?,?,?,?)");
					pst.setString(1, SID);
					pst.setString(2, fname);
					pst.setString(3, mname);
					pst.setString(4, lname);
					pst.setString(5, DOB);
					pst.setString(6, Class);
					pst.setString(7, address);
					pst.setString(8, staffid);
					pst.setString(9, schoolid);
					pst.executeUpdate();
					JOptionPane.showMessageDialog(null, "Record Added");
					fn.setText("");
					mn.setText("");
					ln.setText("");
					sid.setText("");
					dob.setText("");
					cl.setText("");
					ad.setText("");
					stid.setText("");
					scid.setText("");
					fn.requestFocus();
					
					pst=con.prepareStatement("insert into s_phno(SID,PhNo)values(?,?)");
					pst.setString(1, SID);
					pst.setString(2, phone1);
					pst.executeUpdate();
					
					if(phone2.length()!=0) {
						pst.setString(1, SID);
						pst.setString(2, phone2);
						pst.executeUpdate();
					}
				}catch(SQLException el) {
					el.printStackTrace();
				}
				
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(195, 236, 107, 37);
		panel.add(btnNewButton_1);
		
		lblNewLabel = new JLabel("Mid-Day Meal Management");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 27));
		lblNewLabel.setBounds(10, 11, 403, 50);
		contentPane.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Search", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(10, 370, 516, 68);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblStudentId = new JLabel("Student ID");
		lblStudentId.setForeground(Color.BLACK);
		lblStudentId.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblStudentId.setBounds(10, 26, 107, 31);
		panel_1.add(lblStudentId);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(110, 26, 201, 31);
		panel_1.add(textField_11);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(536, 66, 409, 293);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		JButton btnNewButton_1_1 = new JButton("Update");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_1.setBounds(589, 370, 107, 37);
		contentPane.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_2 = new JButton("Delete");
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1_2.setBounds(728, 370, 107, 37);
		contentPane.add(btnNewButton_1_2);
		
		connect();
	}
	
	
}
