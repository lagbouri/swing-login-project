package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JSeparator;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JSpinner;
import java.awt.Font;
import java.awt.Frame;
import java.awt.SystemColor;
import javax.swing.JInternalFrame;

public class Dashbord extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dashbord frame = new Dashbord();
					frame.setLocationRelativeTo(null);
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
	public Dashbord() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 577, 401);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(UIManager.getColor("CheckBox.focus"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 102, 255));
		panel.setBounds(0, 0, 561, 137);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Dashbord.class.getResource("/img/icons8-school-64.png")));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(22, 11, 147, 95);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("School Managment");
		lblNewLabel_4.setFont(new Font("Cambria", Font.BOLD | Font.ITALIC, 16));
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBounds(109, 50, 189, 30);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("ENSA safi");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_5.setForeground(UIManager.getColor("Button.light"));
		lblNewLabel_5.setBounds(135, 79, 69, 14);
		panel.add(lblNewLabel_5);
		
		JLabel lblNewLabel_11 = new JLabel("LAGBOURI YOUSSEF");
		lblNewLabel_11.setFont(new Font("Franklin Gothic Demi", Font.ITALIC, 11));
		lblNewLabel_11.setForeground(Color.WHITE);
		lblNewLabel_11.setBounds(452, 24, 99, 14);
		panel.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("");
		lblNewLabel_12.setIcon(new ImageIcon(Dashbord.class.getResource("/img/icons8-user-tag-32.png")));
		lblNewLabel_12.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_12.setBounds(401, 11, 61, 30);
		panel.add(lblNewLabel_12);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setForeground(new Color(0, 0, 0));
		panel_1.setBounds(106, 166, 98, 83);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(Dashbord.class.getResource("/img/icons8-home-page-30.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 78, 61);
		panel_1.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Home");
		lblNewLabel_1.setForeground(new Color(0, 102, 255));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(26, 58, 46, 14);
		panel_1.add(lblNewLabel_1);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBounds(241, 166, 98, 83);
		contentPane.add(panel_1_1);
		panel_1_1.setLayout(null);
		panel_1_1.setForeground(Color.BLACK);
		
		JLabel lblNewLabel_1_1 = new JLabel("Students");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setForeground(new Color(0, 102, 255));
		lblNewLabel_1_1.setBounds(10, 58, 78, 14);
		panel_1_1.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(Dashbord.class.getResource("/img/icons8-community-schooling-for-unprivileged-students-in-society-48.png")));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(10, 4, 78, 61);
		panel_1_1.add(lblNewLabel_2);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setForeground(Color.BLACK);
		panel_1_2.setBounds(374, 166, 98, 83);
		contentPane.add(panel_1_2);
		
		JLabel lblNewLabel_1_2 = new JLabel("");
		lblNewLabel_1_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_2.setForeground(new Color(0, 102, 255));
		lblNewLabel_1_2.setBounds(26, 58, 46, 14);
		panel_1_2.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Dashbord.class.getResource("/img/icons8-view-schedule-48.png")));
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setForeground(Color.WHITE);
		lblNewLabel_6.setBounds(10, 6, 78, 61);
		panel_1_2.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Emploi");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setForeground(new Color(0, 102, 255));
		lblNewLabel_7.setBounds(26, 58, 46, 14);
		panel_1_2.add(lblNewLabel_7);
		
		JPanel panel_1_3 = new JPanel();
		panel_1_3.setLayout(null);
		panel_1_3.setForeground(Color.BLACK);
		panel_1_3.setBounds(106, 260, 98, 83);
		contentPane.add(panel_1_3);
		
		JLabel lblNewLabel_1_3 = new JLabel("Exams");
		lblNewLabel_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3.setForeground(new Color(0, 102, 255));
		lblNewLabel_1_3.setBounds(26, 58, 46, 14);
		panel_1_3.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(Dashbord.class.getResource("/img/icons8-quiz-30.png")));
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBounds(19, 11, 60, 41);
		panel_1_3.add(lblNewLabel_8);
		
		JPanel panel_1_3_1 = new JPanel();
		panel_1_3_1.setLayout(null);
		panel_1_3_1.setForeground(Color.BLACK);
		panel_1_3_1.setBounds(241, 260, 98, 83);
		contentPane.add(panel_1_3_1);
		
		JLabel lblNewLabel_1_3_1 = new JLabel("Documents");
		lblNewLabel_1_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_1.setForeground(new Color(0, 102, 255));
		lblNewLabel_1_3_1.setBounds(0, 58, 98, 14);
		panel_1_3_1.add(lblNewLabel_1_3_1);
		
		JLabel lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(Dashbord.class.getResource("/img/icons8-documents-48 (1).png")));
		lblNewLabel_9.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_9.setBounds(26, 19, 46, 36);
		panel_1_3_1.add(lblNewLabel_9);
		
		JPanel panel_1_3_2 = new JPanel();
		panel_1_3_2.setLayout(null);
		panel_1_3_2.setForeground(Color.BLACK);
		panel_1_3_2.setBounds(374, 260, 98, 83);
		contentPane.add(panel_1_3_2);
		
		JLabel lblNewLabel_1_3_2 = new JLabel("Settings");
		lblNewLabel_1_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_3_2.setForeground(new Color(0, 102, 255));
		lblNewLabel_1_3_2.setBounds(0, 58, 98, 14);
		panel_1_3_2.add(lblNewLabel_1_3_2);
		
		JLabel lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(Dashbord.class.getResource("/img/icons8-settings-48.png")));
		lblNewLabel_10.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_10.setBounds(26, 11, 46, 46);
		panel_1_3_2.add(lblNewLabel_10);
		
		ImageIcon myimg = new ImageIcon("C:\\\\Users\\\\user\\\\Desktop\\\\ensa-safi-.png");
		Image img1 = myimg.getImage();
		Image img2 = img1.getScaledInstance(317, 228, Image.SCALE_SMOOTH);
		ImageIcon img3 = new ImageIcon("img2");
		
		/*ImageIcon myimg = new ImageIcon(Toolkit.getDefaultToolkit().getImage(getClass().getResource("C:\\\Users\\user\\Downloads\\icon-removebg-preview.png")));
		Image img1 = myimg.getImage();
		Image img2 = img1.getScaledInstance(173, 104, Image.SCALE_SMOOTH);
		ImageIcon img3 = new ImageIcon("img2");*/
	
	}
}
