import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class Midday {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Midday window = new Midday();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Midday() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 718, 494);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(0, 0, 702, 455);
		frame.getContentPane().add(tabbedPane);
		
		JPanel panel_3 = new JPanel();
		tabbedPane.addTab("Menu", null, panel_3, null);
		panel_3.setLayout(null);
		
		JButton btnNewButton_2 = new JButton("Food Organization");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				FoodOrganization foodorg=new FoodOrganization();
				foodorg.setVisible(true);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2.setBounds(177, 125, 208, 23);
		panel_3.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("School Staff");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				SchoolStaff schstaff=new SchoolStaff();
				schstaff.setVisible(true);
			}
		});
		btnNewButton_2_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1.setBounds(177, 188, 208, 23);
		panel_3.add(btnNewButton_2_1);
		
		JButton btnNewButton_2_1_1 = new JButton("Food Distributor");
		btnNewButton_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.setVisible(false);
				FoodDistributor fooddist=new FoodDistributor();
				fooddist.setVisible(true);
			}
		});
		btnNewButton_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnNewButton_2_1_1.setBounds(177, 257, 208, 23);
		panel_3.add(btnNewButton_2_1_1);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Funds", null, panel_1, null);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Funds ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_2.setBounds(274, 81, 72, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Donar Name");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3.setBounds(123, 145, 114, 14);
		panel_1.add(lblNewLabel_3);
		
		textField = new JTextField();
		textField.setBounds(307, 144, 86, 20);
		panel_1.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_3_1 = new JLabel("Organization Id");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1.setBounds(123, 223, 137, 14);
		panel_1.add(lblNewLabel_3_1);
		
		textField_1 = new JTextField();
		textField_1.setBounds(317, 222, 86, 20);
		panel_1.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Organization Name");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1_1.setBounds(123, 274, 157, 14);
		panel_1.add(lblNewLabel_3_1_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(317, 273, 86, 20);
		panel_1.add(textField_2);
		
		JLabel lblNewLabel_3_1_1_1 = new JLabel("Amount");
		lblNewLabel_3_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1_1_1.setBounds(123, 319, 157, 14);
		panel_1.add(lblNewLabel_3_1_1_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(317, 318, 86, 20);
		panel_1.add(textField_3);
		
		JLabel lblNewLabel_3_1_1_1_1 = new JLabel("Date");
		lblNewLabel_3_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_3_1_1_1_1.setBounds(123, 356, 157, 14);
		panel_1.add(lblNewLabel_3_1_1_1_1);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(317, 355, 86, 20);
		panel_1.add(textField_4);
		
		JButton btnNewButton = new JButton("Donate");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(250, 396, 143, 31);
		panel_1.add(btnNewButton);
		
		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("School", null, panel_2, null);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("School Login");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel_4.setBounds(253, 89, 129, 32);
		panel_2.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("User Name");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5.setBounds(146, 159, 95, 19);
		panel_2.add(lblNewLabel_5);
		
		textField_5 = new JTextField();
		textField_5.setBounds(282, 158, 86, 20);
		panel_2.add(textField_5);
		textField_5.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(282, 215, 86, 20);
		panel_2.add(passwordField);
		
		JLabel lblNewLabel_5_1 = new JLabel("Password");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_5_1.setBounds(146, 215, 95, 19);
		panel_2.add(lblNewLabel_5_1);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_1.setBounds(341, 273, 89, 23);
		panel_2.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("Log In");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton_3.setBounds(198, 273, 89, 23);
		panel_2.add(btnNewButton_3);
	}
}
