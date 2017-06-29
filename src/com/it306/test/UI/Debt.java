package com.it306.test.UI;

import com.it306.test.*;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Debt {
	private JTable table;
	private GameMaster gameMaster;
	private Player plr;
	public ArrayList<Property> propList;
	
	public Debt() {
		gameMaster = GameMaster.instance();
		plr = gameMaster.getCurrentPlayer();
		initialize();
	}
	
	public void initialize() {
		
		JDialog d = new JDialog();
		d.setAlwaysOnTop(true);
		d.setBounds(100, 100, 444, 560);
		d.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		d.setTitle("Sell to Bank");
		d.setModal(true);
		d.getContentPane().setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayer.setBounds(23, 13, 67, 20);
		d.getContentPane().add(lblPlayer);
		
		
		JLabel label = new JLabel(plr.getName());
		label.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label.setBounds(108, 13, 143, 20);
		d.getContentPane().add(label);
		
		table = new JTable();
		table.setBounds(34, 112, 360, 336);
		table.setRowSelectionAllowed(true);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setDefaultEditor(Object.class, null);
		d.getContentPane().add(table);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[] sel1 = table.getSelectedRows();
				ArrayList<Property> plrProp = new ArrayList<Property>();
				int total = 0;
				
				for (int x : sel1) {
					plrProp.add(propList.get(x));
					total = total + propList.get(x).getValue();
				}
				
				for (Property x : plrProp) {
					x.setPowner(null);
					x.setOwner("Bank");
					plr.removeProperty(x);
				}
				
				plr.addMoney(total/2);
				JOptionPane.showMessageDialog(null, "Transaction complete!",
						"Message", JOptionPane.INFORMATION_MESSAGE);
				d.dispose();
				
			}
		});
		btnOk.setBounds(154, 472, 97, 25);
		d.getContentPane().add(btnOk);
		
		JLabel lblSelectTheProperty = new JLabel("<html><body>Select the property to sell it back to the bank for 50% of the actual cost.</body></html>");
		lblSelectTheProperty.setBounds(33, 46, 360, 52);
		d.getContentPane().add(lblSelectTheProperty);		
		
		developTable();
		d.setVisible(true);
	}
	
	void developTable() {
		
		String[] columnName = new String[2];
		propList = plr.getPropertyList();
		
		columnName[0] = "Properties";
		columnName[1] = "Price";
		
		String[][] pList = new String[propList.size()][2];
		
		for (int i = 0; i < propList.size(); i++) {
			pList[i][0] = propList.get(i).getName();
			pList[i][1] = String.valueOf(propList.get(i).getValue());
		}	
		
		DefaultTableModel tableModel = new DefaultTableModel(pList, columnName);
		table.setModel(tableModel);
		tableModel.fireTableDataChanged();
		table.repaint();
	}
}
