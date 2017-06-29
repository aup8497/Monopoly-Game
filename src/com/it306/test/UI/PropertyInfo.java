package com.it306.test.UI;

/**
 * This class shows the property information when the user clicks one of the
 * labels on the board. It should show properties of all the cells.
 * 
 * @author Amith Kini
 */

import com.it306.test.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PropertyInfo {

	private JFrame frame;

	/**
	 * Create the application.
	 * @param Property class 
	 * Name, Value, Owner, Colour, Rent
	 */
	public PropertyInfo(Cell cell) {
		initialize(cell);
		frame.setVisible(true);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(Cell cell) {
		frame = new JFrame();
		frame.setBounds(100, 100, 469, 419);
		frame.setTitle("Information");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPropertyInformation = new JLabel("Property information");
		lblPropertyInformation.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblPropertyInformation.setBounds(110, 48, 228, 44);
		frame.getContentPane().add(lblPropertyInformation);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblName.setBounds(34, 116, 56, 20);
		frame.getContentPane().add(lblName);
		
		JLabel label = new JLabel(cell.getName());
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setLabelFor(lblName);
		label.setBounds(110, 115, 228, 20);
		frame.getContentPane().add(label);
		
		JLabel lblValue = new JLabel("Value:");
		lblValue.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblValue.setBounds(34, 159, 56, 20);
		frame.getContentPane().add(lblValue);
		
		JLabel label_1 = new JLabel(String.valueOf((cell.getValue())));
		label_1.setLabelFor(lblValue);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(110, 159, 228, 20);
		frame.getContentPane().add(label_1);
		
		JLabel lblOwner = new JLabel("Owner:");
		lblOwner.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblOwner.setBounds(34, 199, 56, 20);
		frame.getContentPane().add(lblOwner);
		
		JLabel label_2 = new JLabel(cell.getOwner());
		label_2.setLabelFor(lblOwner);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(110, 199, 228, 20);
		frame.getContentPane().add(label_2);
		
		JLabel lblColour = new JLabel("Colour:");
		lblColour.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblColour.setBounds(34, 240, 56, 20);
		frame.getContentPane().add(lblColour);
		
		JLabel label_3 = new JLabel(cell.getColourGroup());
		label_3.setLabelFor(lblColour);
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_3.setBounds(110, 243, 228, 20);
		frame.getContentPane().add(label_3);
		
		JLabel lblRent = new JLabel("Rent:");
		lblRent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRent.setBounds(34, 276, 56, 20);
		frame.getContentPane().add(lblRent);
		
		JLabel label_4 = new JLabel(String.valueOf(cell.getRent()));
		label_4.setLabelFor(lblRent);
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_4.setBounds(110, 276, 228, 20);
		frame.getContentPane().add(label_4);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnOk.setBounds(175, 323, 97, 25);
		frame.getContentPane().add(btnOk);
	}
}
