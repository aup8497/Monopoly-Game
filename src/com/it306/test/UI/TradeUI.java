package com.it306.test.UI;

/**
 * This is the Trade UI. The Player can buy or sell properties
 * to the bank or to another player.
 * 
 * @author Amith Kini
 */

import com.it306.test.*;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;

public class TradeUI {

	public JFrame frame;
	private JTextField textField;
	private JTable table;
	private JTable table_1;
	public ArrayList<Integer> output = new ArrayList<Integer>();
	private String choice = "Bank";
	private GameMaster gameMaster;
	private Player plr;
	private Player oppnt;
	private String[] plrList;
	ArrayList<Property> propList;
	ArrayList<Property> oppoList;

	/**
	 * Create the application.
	 */
	public TradeUI() {
		gameMaster = GameMaster.instance();
		plr = gameMaster.getCurrentPlayer();
		int num = gameMaster.noOfPlayers;
		plrList = new String[num];
		plrList[0] = "Bank";
		int index = 1;
		for (int i = 0; i < gameMaster.noOfPlayers; i++) {
			if (gameMaster.playerList.get(i).getName() != plr.getName()) {
				plrList[index] = gameMaster.playerList.get(i).getName();
				index = index + 1;
			}
		}
		try {         
          	UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());     
     	}catch (ClassNotFoundException e) {
     	        e.printStackTrace();     
        }catch (InstantiationException e) {   
                e.printStackTrace();     
        }catch (IllegalAccessException e) {         
        		e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
        }
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setTitle("Trade");
		frame.setBounds(100, 100, 666, 637);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblPlayer = new JLabel("Player:");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblPlayer.setBounds(12, 53, 66, 26);
		frame.getContentPane().add(lblPlayer);
		
		JLabel label = new JLabel(gameMaster.getCurrentPlayer().getName());
		label.setFont(new Font("Tahoma", Font.PLAIN, 19));
		label.setBounds(100, 53, 196, 26);
		frame.getContentPane().add(label);
		
		JLabel lblSelectPlayer = new JLabel("Select Player:");
		lblSelectPlayer.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblSelectPlayer.setBounds(319, 53, 123, 26);
		frame.getContentPane().add(lblSelectPlayer);
		
		JComboBox<String> comboBox = new JComboBox<String>(plrList);
		comboBox.setBounds(454, 58, 149, 22);
		comboBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent arg0) {
				choice = (String) arg0.getItem();
				developTable();
				table.repaint();
			}
		});
		frame.getContentPane().add(comboBox);
		
		JLabel lblCashOffered = new JLabel("Cash offered:");
		lblCashOffered.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblCashOffered.setBounds(12, 119, 123, 26);
		frame.getContentPane().add(lblCashOffered);
		
		textField = new JTextField("0");
		textField.setBounds(147, 122, 149, 26);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		table = new JTable();
		table.setBounds(33, 208, 274, 301);
		table.setRowSelectionAllowed(true);
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setDefaultEditor(Object.class, null);
		frame.getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(342, 208, 274, 301);
		table.setRowSelectionAllowed(true);
		table_1.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table_1.setDefaultEditor(Object.class, null);
		frame.getContentPane().add(table_1);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int[] sel1 = table.getSelectedRows();
				int[] sel2 = table_1.getSelectedRows();
				
				int price = Integer.valueOf(textField.getText());
				
				ArrayList<Property> plrProp = new ArrayList<Property>();
				int total = 0;
				for (int x : sel1) {
					plrProp.add(propList.get(x));
					total = total + propList.get(x).getValue();
				}
				
				if (price > plr.getMoney()) {
					JOptionPane.showMessageDialog(null, "You have insufficient funds!",
							"Message", JOptionPane.INFORMATION_MESSAGE);
					frame.dispose();
				}
				
				if (choice != "Bank") {
					ArrayList<Property> oppProp = new ArrayList<Property>();
					for (int x : sel2) {
						oppProp.add(oppoList.get(x));
					}
					
					int dialogButton = JOptionPane.YES_NO_OPTION;
					int dialogResult = JOptionPane.showConfirmDialog(null, choice + ", would you like to "
							+ "complete this trade?","Trade",dialogButton);
					if (dialogResult == JOptionPane.YES_OPTION) {
						//Complete the transaction
						
						if (oppnt.getMoney() < -price) {
							JOptionPane.showMessageDialog(null, "You have insufficient funds!",
									"Message", JOptionPane.INFORMATION_MESSAGE);
							frame.dispose();
						}
						
						else {
							// Transfer of assets
							for (Property x : plrProp) {
								x.setOwner(oppnt.getName());
								x.setPowner(oppnt);
								oppnt.addProperty(x);
								plr.removeProperty(x);
							}
							for (Property y : oppProp) {
								y.setOwner(plr.getName());
								y.setPowner(plr);
								plr.addProperty(y);
								oppnt.removeProperty(y);
							}
							
							oppnt.addMoney(price);
							plr.subMoney(price);
							JOptionPane.showMessageDialog(null, "Transaction complete!",
									"Message", JOptionPane.INFORMATION_MESSAGE);
							frame.dispose();
						}
						
					}
					else if (dialogResult == JOptionPane.NO_OPTION) {
						frame.dispose();
					}
					
				}
				else {
					
					int dialogButton = JOptionPane.YES_NO_OPTION;
					int dialogResult = JOptionPane.showConfirmDialog(null, "Are you sure you want to sell it back"
							+ "to the bank at 50% of original price?","Trade",dialogButton);
					
					if (dialogResult == JOptionPane.YES_OPTION) {
						for (Property x : plrProp) {
							x.setPowner(null);
							x.setOwner("Bank");
							plr.removeProperty(x);
						}
						plr.addMoney(total/2);
						JOptionPane.showMessageDialog(null, "Transaction complete!",
								"Message", JOptionPane.INFORMATION_MESSAGE);
						frame.dispose();
					}
					else {
						frame.dispose();
					}
					
				}
			}
		});
		btnOk.setBounds(131, 540, 97, 25);
		frame.getContentPane().add(btnOk);
		
		JButton btnCancel = new JButton("Cancel");
		btnCancel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				frame.dispose();
			}
		});
		btnCancel.setBounds(435, 540, 97, 25);
		frame.getContentPane().add(btnCancel);
		
		JLabel lblYou = new JLabel("You");
		lblYou.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYou.setHorizontalAlignment(SwingConstants.CENTER);
		lblYou.setBounds(131, 161, 56, 16);
		frame.getContentPane().add(lblYou);
		
		JLabel lblOther = new JLabel("");
		lblOther.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblOther.setHorizontalAlignment(SwingConstants.CENTER);
		lblOther.setBounds(406, 179, 149, 16);
		frame.getContentPane().add(lblOther);
		
		JLabel lblProperty = new JLabel("Property");
		lblProperty.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblProperty.setBounds(46, 183, 76, 22);
		frame.getContentPane().add(lblProperty);
		
		JLabel label_1 = new JLabel("Property");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(359, 187, 76, 22);
		frame.getContentPane().add(label_1);
		
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPrice.setBounds(204, 187, 76, 22);
		frame.getContentPane().add(lblPrice);
		
		JLabel label_2 = new JLabel("Price");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_2.setBounds(527, 187, 76, 22);
		frame.getContentPane().add(label_2);
		
		developTable();
		
	}

	void developTable(){
		
		String[] columnName = new String[2];
		Player plr = gameMaster.getCurrentPlayer();
		propList = plr.getPropertyList();

		columnName[0] = "Properties";
		columnName[1] = "Price";
		
		String[][] pList1 = new String[propList.size()][2];
		
		for (int i = 0; i < propList.size(); i++) {
			pList1[i][0] = propList.get(i).getName();
			pList1[i][1] = String.valueOf(propList.get(i).getValue());
		}		
		
		DefaultTableModel tableModel1 = new DefaultTableModel(pList1, columnName);
		table.setModel(tableModel1);
		
		tableModel1.fireTableDataChanged();
		table.repaint();
		
		if (choice != "Bank") {
			oppnt = null;
			for (Player x : gameMaster.playerList) {
				if (choice == x.getName()) {
					oppnt = x;
					break;
				}
			}
			oppoList = oppnt.getPropertyList();
			String[][] pList2 = new String[oppoList.size()][2];
			
			for (int i = 0; i < oppoList.size(); i++) {
				pList2[i][0] = oppoList.get(i).getName();
				pList2[i][1] = String.valueOf(oppoList.get(i).getValue());
			}
			
			DefaultTableModel tableModel2 = new DefaultTableModel(pList2, columnName);
			table_1.setModel(tableModel2);
			tableModel2.fireTableDataChanged();
			table_1.repaint();
			
		}
	}
}


