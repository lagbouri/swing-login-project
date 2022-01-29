package Login;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JLayeredPane;
import java.awt.CardLayout;
import java.awt.Toolkit;
import java.awt.List;
import java.awt.Panel;
import javax.swing.JScrollBar;
import javax.swing.JEditorPane;
import javax.swing.DropMode;
import javax.swing.JSlider;

public class dash extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dash frame = new dash();
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
	public dash() {
		setIconImage(Toolkit.getDefaultToolkit().getImage(dash.class.getResource("/img/icons8-staff-24.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 727, 427);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(153, 0, 255));
		panel.setBounds(0, 0, 147, 388);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(dash.class.getResource("/img/icons8-school-64.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(35, 11, 75, 64);
		panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENSA safi");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(36, 78, 73, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Home");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(0, 116, 147, 22);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Student");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1.setForeground(Color.WHITE);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1.setBounds(0, 150, 147, 22);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Staff");
		lblNewLabel_2_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2_1_1.setForeground(Color.WHITE);
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(0, 183, 147, 22);
		panel.add(lblNewLabel_2_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(240, 248, 255));
		panel_1.setBounds(147, 0, 564, 388);
		contentPane.add(panel_1);
		panel_1.setLayout(new CardLayout(0, 0));
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(245, 245, 245));
		panel_1.add(panel_2, "name_164654146463700");
		panel_2.setLayout(null);
		
		JPanel panel_5 = new JPanel();
		panel_5.setBackground(new Color(211, 211, 211));
		panel_5.setBorder(null);
		panel_5.setBounds(18, 24, 103, 64);
		panel_2.add(panel_5);
		panel_5.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Students");
		lblNewLabel_3.setBounds(0, 13, 123, 43);
		panel_5.add(lblNewLabel_3);
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setForeground(new Color(153, 0, 153));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel lblNewLabel_5_1 = new JLabel("900");
		lblNewLabel_5_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1.setForeground(new Color(153, 0, 255));
		lblNewLabel_5_1.setFont(new Font("MS UI Gothic", Font.BOLD, 11));
		lblNewLabel_5_1.setBounds(0, 41, 46, 14);
		panel_5.add(lblNewLabel_5_1);
		
		JLabel lblNewLabel_4_1 = new JLabel("");
		lblNewLabel_4_1.setIcon(new ImageIcon(dash.class.getResource("/img/icons8-students-24 (1).png")));
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setBounds(0, 4, 36, 33);
		panel_5.add(lblNewLabel_4_1);
		
		JPanel panel_5_1 = new JPanel();
		panel_5_1.setBackground(new Color(211, 211, 211));
		panel_5_1.setLayout(null);
		panel_5_1.setBorder(null);
		panel_5_1.setBounds(139, 24, 103, 64);
		panel_2.add(panel_5_1);
		
		JLabel lblNewLabel_3_1 = new JLabel("Staff");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setForeground(new Color(153, 0, 153));
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3_1.setBackground(Color.WHITE);
		lblNewLabel_3_1.setBounds(0, 13, 123, 43);
		panel_5_1.add(lblNewLabel_3_1);
		
		JLabel lblNewLabel_5_1_1 = new JLabel("900");
		lblNewLabel_5_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_1.setForeground(new Color(153, 0, 255));
		lblNewLabel_5_1_1.setFont(new Font("MS UI Gothic", Font.BOLD, 11));
		lblNewLabel_5_1_1.setBounds(0, 41, 46, 14);
		panel_5_1.add(lblNewLabel_5_1_1);
		
		JLabel lblNewLabel_4_1_1 = new JLabel("");
		lblNewLabel_4_1_1.setIcon(new ImageIcon(dash.class.getResource("/img/icons8-staff-24.png")));
		lblNewLabel_4_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_1.setBounds(0, 4, 36, 33);
		panel_5_1.add(lblNewLabel_4_1_1);
		
		JPanel panel_5_3 = new JPanel();
		panel_5_3.setBackground(new Color(211, 211, 211));
		panel_5_3.setLayout(null);
		panel_5_3.setBorder(null);
		panel_5_3.setBounds(263, 24, 103, 64);
		panel_2.add(panel_5_3);
		
		JLabel lblNewLabel_3_3 = new JLabel("Departement");
		lblNewLabel_3_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_3.setForeground(new Color(153, 0, 153));
		lblNewLabel_3_3.setFont(new Font("Tahoma", Font.BOLD, 10));
		lblNewLabel_3_3.setBackground(new Color(211, 211, 211));
		lblNewLabel_3_3.setBounds(4, 13, 123, 43);
		panel_5_3.add(lblNewLabel_3_3);
		
		JLabel lblNewLabel_5_1_3 = new JLabel("900");
		lblNewLabel_5_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5_1_3.setForeground(new Color(153, 0, 255));
		lblNewLabel_5_1_3.setFont(new Font("MS UI Gothic", Font.BOLD, 11));
		lblNewLabel_5_1_3.setBounds(0, 41, 46, 14);
		panel_5_3.add(lblNewLabel_5_1_3);
		
		JLabel lblNewLabel_4_1_3 = new JLabel("");
		lblNewLabel_4_1_3.setIcon(new ImageIcon(dash.class.getResource("/img/icons8-department-24.png")));
		lblNewLabel_4_1_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1_3.setBounds(0, 4, 36, 33);
		panel_5_3.add(lblNewLabel_4_1_3);
		
		JPanel panel_6 = new JPanel();
		panel_6.setBackground(Color.WHITE);
		panel_6.setBounds(386, 0, 178, 388);
		panel_2.add(panel_6);
		panel_6.setLayout(null);
		
		JLabel lblNewLabel_4 = new JLabel("Courses");
		lblNewLabel_4.setFont(new Font("Sitka Display", Font.BOLD, 13));
		lblNewLabel_4.setForeground(new Color(153, 0, 255));
		lblNewLabel_4.setBounds(38, 32, 94, 23);
		panel_6.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(dash.class.getResource("/img/icons8-bookmark-24.png")));
		lblNewLabel_5.setBounds(10, 22, 64, 39);
		panel_6.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Java Full Course");
		lblNewLabel_6.setForeground(new Color(153, 0, 255));
		lblNewLabel_6.setBounds(38, 66, 118, 14);
		panel_6.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("");
		lblNewLabel_7.setIcon(new ImageIcon(dash.class.getResource("/img/icons8-java-24.png")));
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBounds(0, 61, 46, 23);
		panel_6.add(lblNewLabel_7);
		
		JLabel lblNewLabel_6_1 = new JLabel("React JS Full course");
		lblNewLabel_6_1.setForeground(new Color(153, 0, 255));
		lblNewLabel_6_1.setBounds(38, 94, 118, 14);
		panel_6.add(lblNewLabel_6_1);
		
		JLabel lblNewLabel_7_1 = new JLabel("");
		lblNewLabel_7_1.setIcon(new ImageIcon(dash.class.getResource("/img/icons8-react-a-javascript-library-for-building-user-interfaces-24.png")));
		lblNewLabel_7_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7_1.setBounds(0, 89, 46, 23);
		panel_6.add(lblNewLabel_7_1);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.WHITE);
		panel_1.add(panel_3, "name_164709646414500");
		
		JPanel panel_4 = new JPanel();
		panel_4.setBackground(Color.WHITE);
		panel_1.add(panel_4, "name_164740364162800");
	}
}
