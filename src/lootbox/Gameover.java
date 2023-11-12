package lootbox;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Gameover {
	
	private ImageIcon background;
	JFrame gameoverframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gameover window = new Gameover();
					window.gameoverframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Gameover() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		background = new ImageIcon("gameoverBackground.gif");
		gameoverframe = new JFrame();
		gameoverframe.setTitle("Sharpshooter 2");
		gameoverframe.setBounds(100, 100, 621, 399);
		gameoverframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gameoverframe.getContentPane().setLayout(null);
		
		JLabel playAgainLabel = new JLabel("Play again?");
		playAgainLabel.setForeground(Color.RED);
		playAgainLabel.setFont(new Font("Monospaced", Font.BOLD, 21));
		playAgainLabel.setBounds(231, 236, 143, 51);
		gameoverframe.getContentPane().add(playAgainLabel);
		
		JButton botaoYes = new JButton("Yes");
		botaoYes.setContentAreaFilled(false);
		botaoYes.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botaoYes.setFont(new Font("Monospaced", Font.BOLD, 23));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botaoYes.setFont(new Font("Monospaced", Font.BOLD, 16));
			}
		});
		botaoYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MenuFrame mf = new MenuFrame();
				mf.menuframe.setVisible(true);
				gameoverframe.dispose();
			}
		});
		botaoYes.setBorderPainted(false);
		botaoYes.setOpaque(false);
		botaoYes.setBackground(new Color(0, 0, 0));
		botaoYes.setForeground(Color.RED);
		botaoYes.setFocusPainted(false);
		botaoYes.setFont(new Font("Monospaced", Font.BOLD, 16));
		botaoYes.setBounds(191, 298, 102, 31);
		gameoverframe.getContentPane().add(botaoYes);
		
		JButton botaoNo = new JButton("No");
		botaoNo.setContentAreaFilled(false);
		botaoNo.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botaoNo.setFont(new Font("Monospaced", Font.BOLD, 23));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botaoNo.setFont(new Font("Monospaced", Font.BOLD, 16));
			}
		});
		botaoNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				gameoverframe.dispose();
			}
		});
		botaoNo.setBackground(new Color(0, 0, 0));
		botaoNo.setOpaque(false);
		botaoNo.setForeground(Color.RED);
		botaoNo.setBorderPainted(false);
		botaoNo.setFocusPainted(false);
		botaoNo.setFont(new Font("Monospaced", Font.BOLD, 16));
		botaoNo.setBounds(303, 298, 102, 31);
		gameoverframe.getContentPane().add(botaoNo);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setBounds(0, 0, 613, 360);
		backgroundLabel.setIcon(background);
		gameoverframe.getContentPane().add(backgroundLabel);
	}

}
