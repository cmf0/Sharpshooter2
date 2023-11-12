package lootbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.EtchedBorder;

public class SecondFrame {
	
	private Player player1;
//private ImageIcon pistol;
	private ImageIcon commonpistol;
	private ImageIcon elitepistol;
	private ImageIcon legendarypistol;
	private ImageIcon assaultrifle;
	private ImageIcon commonassaultrifle;
	private ImageIcon eliteassaultrifle;
	private ImageIcon legendaryassaultrifle;
	private ImageIcon sniperrifle;
	private ImageIcon commonsniperrifle;
	private ImageIcon elitesniperrifle;
	private ImageIcon legendarysniperrifle;
	private JLabel weaponsSlot1Label;
	private JLabel weaponsSlot2Label;
	private JLabel weaponsSlot3Label;
	
	
	JFrame secondframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Player player1 = new Player();
					SecondFrame window = new SecondFrame(player1);
					window.secondframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SecondFrame(Player player) {
		this.player1=player;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
//pistol = new ImageIcon("pistol.png");
		commonpistol = new ImageIcon("commonPistol.png");
		elitepistol = new ImageIcon("elitePistol.png");
		legendarypistol = new ImageIcon("legendaryPistol.png");
		assaultrifle = new ImageIcon("assault-rifle.png");
		commonassaultrifle = new ImageIcon("commonAssault-rifle.png");
		eliteassaultrifle = new ImageIcon("eliteAssault-rifle.png");
		legendaryassaultrifle = new ImageIcon("legendaryAssault-rifle.png");
		sniperrifle = new ImageIcon("sniperRifle.png");
		commonsniperrifle = new ImageIcon("commonSniperRifle.png");
		elitesniperrifle = new ImageIcon("eliteSniperRifle.png");
		legendarysniperrifle = new ImageIcon("legendarySniperRifle.png");
		secondframe = new JFrame();
		secondframe.setBounds(100, 100, 628, 406);
		secondframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		secondframe.getContentPane().setLayout(null);
		
		JButton botao = new JButton("Return");
		botao.setFocusPainted(false);
		botao.setBackground(Color.GRAY);
		botao.setForeground(Color.WHITE);
		botao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				secondframe.dispose();
			
			}
		});
		
		weaponsSlot2Label = new JLabel("");
		weaponsSlot2Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(player1.hasAssaultRifle) {
					player1.setEquippedWeapon(2);
					secondframe.dispose();
				}				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(player1.hasAssaultRifle) {
					weaponsSlot2Label.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(player1.hasAssaultRifle) {
					weaponsSlot2Label.setBorder(null);
				}
			}
		});
		
		weaponsSlot3Label = new JLabel("");
		weaponsSlot3Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(player1.hasSniperRifle) {
					player1.setEquippedWeapon(3);
					secondframe.dispose();
				}
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				if(player1.hasSniperRifle) {
					weaponsSlot3Label.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
				}
			}
			@Override
			public void mouseExited(MouseEvent e) {
				if(player1.hasSniperRifle) {
					weaponsSlot3Label.setBorder(null);
				}
			}
		});
		weaponsSlot3Label.setEnabled(false);
		weaponsSlot3Label.setBounds(444, 70, 158, 117);
		weaponsSlot3Label.setIcon(sniperrifle);
		secondframe.getContentPane().add(weaponsSlot3Label);
		weaponsSlot2Label.setEnabled(false);
		weaponsSlot2Label.setBounds(229, 70, 158, 117);
		weaponsSlot2Label.setIcon(assaultrifle);
		secondframe.getContentPane().add(weaponsSlot2Label);
		
		weaponsSlot1Label = new JLabel("");
		weaponsSlot1Label.setBorder(null);
		weaponsSlot1Label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				player1.setEquippedWeapon(1);
				secondframe.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				weaponsSlot1Label.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				weaponsSlot1Label.setBorder(null);
			}
		});
		weaponsSlot1Label.setBounds(10, 70, 158, 117);
		weaponsSlot1Label.setIcon(commonpistol);
		secondframe.getContentPane().add(weaponsSlot1Label);
		botao.setBounds(483, 320, 119, 36);
		secondframe.getContentPane().add(botao);
		
		JLabel inventoryLabel = new JLabel("Inventory");
		inventoryLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		inventoryLabel.setOpaque(true);
		inventoryLabel.setBackground(Color.GRAY);
		inventoryLabel.setForeground(Color.WHITE);
		inventoryLabel.setHorizontalAlignment(SwingConstants.CENTER);
		inventoryLabel.setBounds(10, 11, 592, 32);
		secondframe.getContentPane().add(inventoryLabel);
		
		JLabel weaponsLabel = new JLabel("Weapons");
		weaponsLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		weaponsLabel.setOpaque(true);
		weaponsLabel.setHorizontalAlignment(SwingConstants.CENTER);
		weaponsLabel.setForeground(Color.WHITE);
		weaponsLabel.setBackground(Color.GRAY);
		weaponsLabel.setBounds(10, 54, 592, 13);
		secondframe.getContentPane().add(weaponsLabel);
		
		JLabel consumablesLabel = new JLabel("Consumables");
		consumablesLabel.setOpaque(true);
		consumablesLabel.setHorizontalAlignment(SwingConstants.CENTER);
		consumablesLabel.setForeground(Color.WHITE);
		consumablesLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		consumablesLabel.setBackground(Color.GRAY);
		consumablesLabel.setBounds(10, 192, 592, 13);
		secondframe.getContentPane().add(consumablesLabel);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setBackground(Color.BLACK);
		backgroundLabel.setOpaque(true);
		backgroundLabel.setBounds(0, 0, 612, 367);
		secondframe.getContentPane().add(backgroundLabel);
		
		checkOwnedWeapons();
	}
	
	public void checkWeaponRarity() {
		
	}
	
	public void checkOwnedWeapons() {
		
		if(player1.hasPistol) {
			weaponsSlot1Label.setEnabled(true);
			
			switch(player1.gun1.rarity) {			
				case 1: weaponsSlot1Label.setIcon(commonpistol);
				break;
				case 2: weaponsSlot1Label.setIcon(elitepistol);
				break;
				case 3: weaponsSlot1Label.setIcon(legendarypistol);
				break;
				default: System.out.println("erro");
			}
		}
		if(player1.hasAssaultRifle) {
			weaponsSlot2Label.setEnabled(true);
			
			switch(player1.gun2.rarity) {			
				case 1: weaponsSlot2Label.setIcon(commonassaultrifle);
				break;
				case 2: weaponsSlot2Label.setIcon(eliteassaultrifle);
				break;
				case 3: weaponsSlot2Label.setIcon(legendaryassaultrifle);
				break;
				default: System.out.println("erro");
			}
		}
		if(player1.hasSniperRifle) {
			weaponsSlot3Label.setEnabled(true);
			
			switch(player1.gun3.rarity) {			
				case 1: weaponsSlot3Label.setIcon(commonsniperrifle);
				break;
				case 2: weaponsSlot3Label.setIcon(elitesniperrifle);
				break;
				case 3: weaponsSlot3Label.setIcon(legendarysniperrifle);
				break;
				default: System.out.println("erro");
			}
		}
	}
}
