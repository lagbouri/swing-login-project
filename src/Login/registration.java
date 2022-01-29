package Login;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JButton;
import java.awt.Button;
import java.awt.Choice;
import javax.swing.JCheckBox;

public class registration extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registration frame = new registration();
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
	public registration() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 611, 413);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 255));
		panel.setBounds(0, 0, 212, 374);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(registration.class.getResource("/img/icons8-school-128.png")));
		lblNewLabel.setBounds(43, 94, 125, 115);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("School Managment System");
		lblNewLabel_1.setFont(new Font("Segoe UI Emoji", Font.BOLD | Font.ITALIC, 14));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setBounds(27, 220, 212, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("ENSA safi");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.ITALIC, 12));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(82, 242, 69, 14);
		panel.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(249, 87, 130, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(425, 87, 130, 28);
		contentPane.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(249, 152, 306, 28);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(249, 213, 130, 28);
		contentPane.add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(425, 213, 130, 28);
		contentPane.add(textField_4);
		
		Button button = new Button("Submit");
		button.setForeground(Color.WHITE);
		button.setBackground(new Color(153, 0, 255));
		button.setBounds(249, 319, 130, 28);
		contentPane.add(button);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("I agree to the University of Caddi Ayyad ");
		chckbxNewCheckBox.setForeground(new Color(153, 0, 255));
		chckbxNewCheckBox.setBackground(Color.WHITE);
		chckbxNewCheckBox.setBounds(249, 262, 223, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel_3 = new JLabel("Terms and Conditions");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setForeground(new Color(204, 0, 255));
		lblNewLabel_3.setBackground(new Color(0, 102, 255));
		lblNewLabel_3.setBounds(270, 281, 122, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("FULL NAME");
		lblNewLabel_4.setForeground(new Color(153, 0, 255));
		lblNewLabel_4.setBounds(249, 62, 69, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("CIN");
		lblNewLabel_5.setForeground(new Color(153, 0, 255));
		lblNewLabel_5.setBounds(425, 62, 46, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Email");
		lblNewLabel_6.setForeground(new Color(153, 0, 255));
		lblNewLabel_6.setBounds(249, 127, 46, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("CNE");
		lblNewLabel_7.setForeground(new Color(153, 0, 255));
		lblNewLabel_7.setBounds(249, 191, 46, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("CODE APOGE");
		lblNewLabel_8.setForeground(new Color(153, 0, 255));
		lblNewLabel_8.setBounds(425, 188, 147, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Registration Forme");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 17));
		lblNewLabel_9.setForeground(new Color(153, 0, 255));
		lblNewLabel_9.setBounds(321, 11, 165, 23);
		contentPane.add(lblNewLabel_9);
	}
}
