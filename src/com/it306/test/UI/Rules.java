package com.it306.test.UI;

/**
 * This is the rules page of the game.
 * Formatted using HTML.
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

public class Rules {

	public JFrame frame;

	/**
	 * Create the application.
	 */
	public Rules() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Rules");
		frame.setBounds(100, 100, 796, 744);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblRukes = new JLabel("Rules");
		lblRukes.setForeground(Color.RED);
		lblRukes.setFont(new Font("Tahoma", Font.PLAIN, 51));
		lblRukes.setBounds(335, 35, 139, 83);
		frame.getContentPane().add(lblRukes);
		
		JLabel lblhello = new JLabel("<html>\r\n\t<body>\r\n\t\t<ul>\r\n\t\t\t<li>On a player's turn, he or she must roll the dice and move his or her token forward the number of spaces as rolled on the dice.</li>\r\n\t\t\t<li>If the player lands on an unowned property, he or she may buy it for the price listed on that property's space. If he or she agrees to buy it, he or she pays the Bank the amount shown on the property space and receives the deed for that property. Railroads and utilities are also considered properties.</li>\r\n\t\t\t<li>If the player lands on an unmortgaged property owned by another player, he or she pays rent to that person, as specified on the property's deed.</li>\r\n<li>If the player lands on his or her own property, nothing happens.</li>\r\n<li>If the player lands on Luxury Tax, he or she must pay the Bank $100.</li>\r\n<li>If the player lands on Income Tax he or she must pay the Bank either $200.</li>\r\n<li>If the player lands on a Chance or Community Chest, the player gets to pick a card and performs the instruction given on the card.</li>\r\n<li>If the player lands on the Jail space, he or she is jailed.</li>\r\n</li>If the player lands on or passes Go in the course of his or her turn, he or she receives $200 from the Bank.</li>\r\n<li>If a player does not have sufficient funds to pay off a rent or fee, he or she may sell houses back to the Bank for half the purchase price or sell property deeds to other players in the game.</li>\r\n</body></html>");
		lblhello.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblhello.setBounds(12, 113, 754, 530);
		frame.getContentPane().add(lblhello);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnOk.setBounds(328, 656, 97, 25);
		frame.getContentPane().add(btnOk);
	}
}
