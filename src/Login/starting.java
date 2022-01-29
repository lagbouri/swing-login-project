package Login;

import java.awt.BorderLayout;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JProgressBar;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.swing.Timer;

public class starting extends JFrame {

	private JPanel contentPane;
	JProgressBar progressBar = new JProgressBar();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					starting frame = new starting();
					frame.setUndecorated(true);
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public starting() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 628, 365);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(153, 0, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(starting.class.getResource("/img/icons8-school-128.png")));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(118, 94, 190, 146);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("WELCOME");
		lblNewLabel_1.setFont(new Font("Impact", Font.PLAIN, 32));
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(269, 143, 208, 59);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("School Managment System");
		lblNewLabel_2.setFont(new Font("Tw Cen MT Condensed Extra Bold", Font.ITALIC, 17));
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setBounds(274, 193, 202, 27);
		contentPane.add(lblNewLabel_2);
		
		
		progressBar.setBounds(-14, 346, 651, 27);
		contentPane.add(progressBar);
		
		JLabel lblNewLabel_3 = new JLabel("Loading.....");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setBounds(10, 320, 109, 14);
		contentPane.add(lblNewLabel_3);
		tm.start();
		
		
		
	}
	int i =0;
	Timer tm = new Timer(10,new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			progressBar.setValue(i++);
			if(i>101) {
				tm.stop();
				m();
				
			}
		}
	});
	public void m() {
		this.dispose();
		home f = new home();

		f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setVisible(true);
	}
}
