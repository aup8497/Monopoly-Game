package com.it306.test.UI;

/**
 * This shows the about page of the game.
 * Formatted with HTML.
 * 
 * @author Amith Kini
 */

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public About() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("About");
		frame.setBounds(100, 100, 542, 406);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblAbout = new JLabel("About");
		lblAbout.setForeground(Color.RED);
		lblAbout.setFont(new Font("Tahoma", Font.PLAIN, 28));
		lblAbout.setBounds(234, 13, 82, 51);
		frame.getContentPane().add(lblAbout);
		
		JLabel lblmadeByswastik = new JLabel("<html>\r\n\t<body>\r\n\t\t<h3>Made by:</h3>\r\n\t\t<ul>\r\n\t\t\t<li>Swastik Udupa\t\t15IT148</li>\r\n\t\t\t<li>M Amith Kini\t\t\t15IT216</li>\r\n\t\t\t<li>Akshay U Prabhu\t\t15IT203</li>\r\n\t\t\t<li>Sanjay P\t\t\t\t15IT139</li>\r\n\t\t</ul>\r\n\t\t<h4>As a part of mini-project on Object Oriented Analysis and Design (IT306)</h4>\r\n\t</body>\r\n</html>");
		lblmadeByswastik.setBounds(12, 67, 500, 231);
		frame.getContentPane().add(lblmadeByswastik);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnOk.setBounds(219, 310, 97, 25);
		frame.getContentPane().add(btnOk);
	}

}
