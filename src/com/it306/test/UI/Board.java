package com.it306.test.UI;

/**
 * The main board layout of the game. The box is not resizable to
 * avoid distortion.
 * 
 * @author Amith Kini
 */

import com.it306.test.*;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Board {

	public JFrame frame;
	private ArrayList<JLabel> cells = new ArrayList<JLabel>();
	public ArrayList<Object> cellList = new ArrayList<Object>();
	public JLabel p0;
	public JLabel p1;
	public JLabel p2;
	public JLabel p3;
	public JPanel panel_1;
	public boolean turnStarted = false;
	public GameMaster gameMaster;
	public JLabel lblPlayer;
	public JLabel label_1;
	public JButton btnPlay;
	public JButton btnBuyProperty;
	public JButton btnTrade;
	public JButton btnPickCard;
	public JButton btnPayBail;
	public JButton btnEndTurn;
	public int i = 1;
	public JPanel pnlPlr1;
	public JPanel pnlPlr2;
	public JPanel pnlPlr3;
	public JPanel pnlPlr4;
	public JLabel plr1;
	public JLabel plr2;
	public JLabel plr3;
	public JLabel plr4;
	public JLabel lblmp1;
	public JLabel lblmp2;
	public JLabel lblmp3;
	public JLabel lblmp4;
	public JLabel lblRent;
	
	/**
	 * Create the application.
	 */
	public Board(int choice) {
		gameMaster = GameMaster.instance();
		initialize(choice);
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(int choice) {
		
		cellList = GameMaster.instance().cellList;
		frame = new JFrame();
		frame.setTitle("Business!");
		frame.setResizable(false);
		frame.setBounds(100, 100, 910, 930);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel panel = (JPanel)frame.getContentPane();
		frame.getContentPane().setLayout(null);
		
		// The "GO" label
		JLabel label = new JLabel("");
		label.setBounds(785, 779, 119, 116);
		frame.getContentPane().add(label);
		cells.add(label);
		label.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				GOCell x = (GOCell) cellList.get(0);
				@SuppressWarnings("unused")
				PropertyInfo disp = new PropertyInfo(x);
			}
		});
		
		// The labels between 1 and 9
		int arg0 = 709;
		for (int i = 1; i < 10; i++) {
			JLabel x = new JLabel();
			x.setBounds(arg0, 779, 74, 116);
			frame.getContentPane().add(x);
			
			x.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					Cell y = (Cell) cellList.get(cells.indexOf(x));
					@SuppressWarnings("unused")
					PropertyInfo disp = new PropertyInfo(y);
				}
			});
			
			cells.add(x);
			arg0 = arg0 - 74;
		}
		
		// The "Just visiting" label
		JLabel label_10 = new JLabel("");
		label_10.setBounds(0, 779, 119, 116);
		frame.getContentPane().add(label_10);
		label_10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Cell x = (Cell) cellList.get(cells.indexOf(label_10));
				@SuppressWarnings("unused")
				PropertyInfo disp = new PropertyInfo(x);
			}
		});
		cells.add(label_10);
		
		int arg1 = 707;
		
		// Labels between 11 and 19
		for (i = 11; i < 20; i++) {
			JLabel x = new JLabel();
			x.setBounds(0, arg1, 119, 71);
			frame.getContentPane().add(x);
			x.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					Cell y = (Cell) cellList.get(cells.indexOf(x));
					@SuppressWarnings("unused")
					PropertyInfo disp = new PropertyInfo(y);
				}
			});
			cells.add(x);
			arg1 = arg1 - 74;
		}
		
		
		// The "Free parking" label
		JLabel label_20 = new JLabel("");
		label_20.setBounds(0, 0, 119, 116);
		frame.getContentPane().add(label_20);
		label_20.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Cell x = (Cell) cellList.get(cells.indexOf(label_20));
				@SuppressWarnings("unused")
				PropertyInfo disp = new PropertyInfo(x);
			}
		});
		cells.add(label_20);
		
		int arg2 = 118;
		
		// Labels between 21 and 29
		for (i = 21; i < 30; i++) {
			JLabel x = new JLabel();
			x.setBounds(arg2, 0, 74, 116);
			frame.getContentPane().add(x);
			x.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					Cell y = (Cell) cellList.get(cells.indexOf(x));
					@SuppressWarnings("unused")
					PropertyInfo disp = new PropertyInfo(y);
				}
			});
			cells.add(x);
			arg2 = arg2 + 74;
		}
		
		// The "Jail" label
		JLabel label_30 = new JLabel("");
		label_30.setBounds(785, 0, 119, 116);
		frame.getContentPane().add(label_30);
		label_30.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				Cell x = (Cell) cellList.get(cells.indexOf(label_30));
				@SuppressWarnings("unused")
				PropertyInfo disp = new PropertyInfo(x);
			}
		});
		cells.add(label_30);

		int arg3 = 117;
		
		// Labels between 31 and 39
		for (i = 31; i < 40; i++) {
			JLabel x = new JLabel();
			x.setBounds(785, arg3, 119, 71);
			frame.getContentPane().add(x);
			x.addMouseListener(new MouseAdapter() {
				public void mouseClicked(MouseEvent e) {
					Cell y = (Cell) cellList.get(cells.indexOf(x));
					@SuppressWarnings("unused")
					PropertyInfo disp = new PropertyInfo(y);
				}
			});
			cells.add(x);
			arg3 = arg3 + 74;
		}
		
		
		pnlPlr1 = new JPanel();
		pnlPlr1.setOpaque(false);
		pnlPlr1.setBounds(127, 129, 196, 148);
		frame.getContentPane().add(pnlPlr1);
		pnlPlr1.setLayout(null);
		
		JLabel lblPlayer_1 = new JLabel("Player 1");
		lblPlayer_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayer_1.setBounds(65, 13, 70, 20);
		pnlPlr1.add(lblPlayer_1);
		
		plr1 = new JLabel("");
		plr1.setHorizontalAlignment(SwingConstants.CENTER);
		plr1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		plr1.setBounds(23, 46, 150, 25);
		pnlPlr1.add(plr1);
		
		JLabel label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setBackground(Color.RED);
		label_2.setBounds(147, 12, 37, 25);
		pnlPlr1.add(label_2);
		
		JLabel lblMoney = new JLabel("Money");
		lblMoney.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMoney.setBounds(12, 97, 56, 25);
		pnlPlr1.add(lblMoney);
		
		lblmp1 = new JLabel("");
		lblmp1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmp1.setBounds(79, 97, 94, 25);
		pnlPlr1.add(lblmp1);
		
		pnlPlr2 = new JPanel();
		pnlPlr2.setOpaque(false);
		pnlPlr2.setBounds(577, 129, 196, 148);
		frame.getContentPane().add(pnlPlr2);
		pnlPlr2.setLayout(null);
		
		JLabel lblPlayer_2 = new JLabel("Player 2");
		lblPlayer_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayer_2.setBounds(69, 13, 70, 20);
		pnlPlr2.add(lblPlayer_2);
		
		plr2 = new JLabel("");
		plr2.setHorizontalAlignment(SwingConstants.CENTER);
		plr2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		plr2.setBounds(22, 46, 150, 25);
		pnlPlr2.add(plr2);
		
		JLabel label_3 = new JLabel("");
		label_3.setBackground(Color.BLUE);
		label_3.setOpaque(true);
		label_3.setBounds(147, 8, 37, 25);
		pnlPlr2.add(label_3);
		
		JLabel label_7 = new JLabel("Money");
		label_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_7.setBounds(22, 94, 56, 25);
		pnlPlr2.add(label_7);
		
		lblmp2 = new JLabel("");
		lblmp2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmp2.setBounds(89, 94, 94, 25);
		pnlPlr2.add(lblmp2);
		
		pnlPlr3 = new JPanel();
		pnlPlr3.setOpaque(false);
		pnlPlr3.setBounds(127, 620, 196, 148);
		frame.getContentPane().add(pnlPlr3);
		pnlPlr3.setLayout(null);
		
		JLabel lblPlayer_3 = new JLabel("Player 3");
		lblPlayer_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayer_3.setBounds(65, 13, 70, 20);
		pnlPlr3.add(lblPlayer_3);
		
		plr3 = new JLabel("");
		plr3.setHorizontalAlignment(SwingConstants.CENTER);
		plr3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		plr3.setBounds(22, 46, 150, 25);
		pnlPlr3.add(plr3);
		
		JLabel label_4 = new JLabel("");
		label_4.setOpaque(true);
		label_4.setBackground(Color.GREEN);
		label_4.setBounds(147, 8, 37, 25);
		pnlPlr3.add(label_4);
		
		JLabel label_9 = new JLabel("Money");
		label_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_9.setBounds(11, 98, 56, 25);
		pnlPlr3.add(label_9);
		
		lblmp3 = new JLabel("");
		lblmp3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmp3.setBounds(78, 98, 94, 25);
		pnlPlr3.add(lblmp3);
		
		pnlPlr4 = new JPanel();
		pnlPlr4.setOpaque(false);
		pnlPlr4.setBounds(577, 620, 196, 148);
		frame.getContentPane().add(pnlPlr4);
		pnlPlr4.setLayout(null);
		
		JLabel lblPlayer_4 = new JLabel("Player 4");
		lblPlayer_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayer_4.setBounds(69, 13, 70, 20);
		pnlPlr4.add(lblPlayer_4);
		
		plr4 = new JLabel("");
		plr4.setHorizontalAlignment(SwingConstants.CENTER);
		plr4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		plr4.setBounds(23, 46, 150, 25);
		pnlPlr4.add(plr4);
		
		JLabel label_5 = new JLabel("");
		label_5.setOpaque(true);
		label_5.setBackground(Color.YELLOW);
		label_5.setBounds(151, 8, 37, 25);
		pnlPlr4.add(label_5);
		
		JLabel label_12 = new JLabel("Money");
		label_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_12.setBounds(12, 99, 56, 25);
		pnlPlr4.add(label_12);
		
		lblmp4 = new JLabel("");
		lblmp4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblmp4.setBounds(79, 99, 94, 25);
		pnlPlr4.add(lblmp4);
		
		// Player 1
		p0 = new JLabel("1");
		p0.setOpaque(true);
		p0.setBackground(Color.RED);
		p0.setBounds(817, 829, 20, 20);
		frame.getContentPane().add(p0);
		
		// Player 2
		p1 = new JLabel("2");
		p1.setBackground(Color.BLUE);
		p1.setOpaque(true);
		p1.setBounds(817, 862, 20, 20);
		frame.getContentPane().add(p1);
		
		// Player 3
		p2 = new JLabel("3");
		p2.setOpaque(true);
		p2.setBackground(Color.GREEN);
		p2.setBounds(849, 829, 20, 20);
		frame.getContentPane().add(p2);
		if (choice < 3) {
			p2.setVisible(false);
			pnlPlr3.setVisible(false);
		}
		
		// Player 4
		p3 = new JLabel("4");
		p3.setBackground(Color.YELLOW);
		p3.setOpaque(true);
		p3.setBounds(849, 862, 20, 20);
		frame.getContentPane().add(p3);
		if (choice < 4) {
			p3.setVisible(false);
			pnlPlr4.setVisible(false);
		}
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(354, 305, 196, 270);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		lblPlayer = new JLabel("Player:");
		lblPlayer.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblPlayer.setBounds(12, 13, 56, 16);
		panel_1.add(lblPlayer);
		
		label_1 = new JLabel();
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		label_1.setBounds(80, 14, 104, 16);
		panel_1.add(label_1);
		
		btnPlay = new JButton("Roll the dice!");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				gameMaster.btnPlayClicked();
			}
		});
		btnPlay.setEnabled(false);
		btnPlay.setBounds(12, 42, 172, 25);
		panel_1.add(btnPlay);
		
		btnBuyProperty = new JButton("Buy Property");
		btnBuyProperty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMaster.btnBuyPropertyClicked();
			}
		});
		btnBuyProperty.setEnabled(false);
		btnBuyProperty.setBounds(12, 80, 172, 25);
		panel_1.add(btnBuyProperty);
		
		btnTrade = new JButton("Trade");
		btnTrade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMaster.btnTradeClicked();
			}
		});
		btnTrade.setEnabled(true);								// The trade is the evergreen button
		btnTrade.setBounds(12, 118, 172, 25);
		panel_1.add(btnTrade);
		
		btnPickCard = new JButton("Pick a card");
		btnPickCard.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMaster.btnPickCardClicked();
			}
		});
		btnPickCard.setEnabled(false);
		btnPickCard.setBounds(12, 156, 172, 25);
		panel_1.add(btnPickCard);
		
		btnPayBail = new JButton("Pay Bail");
		btnPayBail.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMaster.btnPayBailClicked();
			}
		});
		btnPayBail.setEnabled(false);
		btnPayBail.setBounds(12, 194, 172, 25);
		panel_1.add(btnPayBail);
		
		btnEndTurn = new JButton("End Turn");
		btnEndTurn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameMaster.btnEndTurnClicked();
			}
		});
		btnEndTurn.setEnabled(false);
		btnEndTurn.setBounds(12, 232, 172, 25);
		panel_1.add(btnEndTurn);
		
		lblRent = new JLabel("");
		lblRent.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblRent.setBounds(562, 373, 191, 54);
		frame.getContentPane().add(lblRent);
		
		
		JLabel bgLbl = new JLabel();
		bgLbl.setBounds(0, 0, 904, 895);
		bgLbl.setIcon(new ImageIcon(Toolkit.getDefaultToolkit().getImage(Board.class.getResource("/media/background.jpg"))));
		panel.add(bgLbl);
		frame.setLocationRelativeTo(null);
	}
	
	public void setPlayerPos(int pos, Player plr) {
		JLabel pLabel = plr.lbl;
		JLabel cell = cells.get(pos);
		int index = plr.getIndex();
		int mpy = cell.getHeight() / 2;
		int mpx = cell.getWidth() / 2;
		int x = cell.getX();
		int y = cell.getY();
		
		int x_new = x + mpx;
		int y_new = y + mpy;
		
		if (index == 0) {
			pLabel.setBounds(x_new-20, y_new-20, 20, 20);
		}
		else if (index == 1) {
			pLabel.setBounds(x_new-20, y_new, 20, 20);
		}
		else if (index == 2) {
			pLabel.setBounds(x_new, y_new-20, 20, 20);
		}
		else {
			pLabel.setBounds(x_new, y_new, 20, 20);
		}
	}
}
