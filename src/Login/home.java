package Login;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Button;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class home extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					home frame = new home();
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
					frame.setVisible(true);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public home() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 545, 396);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(0, 102, 255));
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(153, 0, 255));
		panel_1.setBounds(0, 0, 213, 357);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		
		JLabel lblNewLabel_6_1 = new JLabel("");
		lblNewLabel_6_1.setBounds(-51, 0, 692, 335);
		panel_1.add(lblNewLabel_6_1);
		lblNewLabel_6_1.setIcon(new ImageIcon(home.class.getResource("/img/Artboard_1_900x-removebg-preview.png")));
		
		Button button = new Button("Login");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					Connection cn=DriverManager.getConnection("jdbc:mysql://localhost:3307/school");
					String name = textField.getText();
					String pass= textField_1.getText();
					Statement stm = cn.createStatement();
					String sql = "select * from users where nom ='"+name+"' and password='"+pass+"' ";
					ResultSet res = stm.executeQuery(sql);
					if(res.next()) {
						dispose();
						Dashbord frame = new Dashbord();
						frame.setLocationRelativeTo(null);
						frame.setVisible(true);
					}
					else {
						JOptionPane.showMessageDialog(getParent(), "username or password wrong");
					}
					cn.close();
				}
				catch(Exception exc){
					exc.printStackTrace();
				}
			}
		});
		button.setBackground(new Color(153, 0, 255));
		button.setForeground(Color.WHITE);
		button.setBounds(243, 258, 245, 36);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setForeground(new Color(0, 0, 0));
		textField.setBounds(243, 98, 245, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JPasswordField();
		textField_1.setBounds(243, 167, 245, 28);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Email");
		lblNewLabel.setBounds(243, 70, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(243, 142, 98, 14);
		contentPane.add(lblNewLabel_1);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Remember me");
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(239, 218, 152, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_2 = new JLabel("Forgot password ?");
		lblNewLabel_2.setBounds(397, 222, 122, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Not registered ?");
		lblNewLabel_3.setBounds(243, 314, 104, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Create an Account");
		lblNewLabel_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getSource()== lblNewLabel_4) {
					run();
				}
			}
		});
		lblNewLabel_4.setForeground(new Color(153, 0, 255));
		lblNewLabel_4.setBounds(345, 314, 162, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Login");
		lblNewLabel_5.setForeground(new Color(153, 0, 255));
		lblNewLabel_5.setFont(new Font("Arial", Font.BOLD, 13));
		lblNewLabel_5.setBounds(345, 26, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		
	}
	public void run() {
		registration frame = new registration();
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
}
