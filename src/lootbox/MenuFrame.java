package lootbox;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

public class MenuFrame {

	JFrame menuframe;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuFrame window = new MenuFrame();
					window.menuframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		menuframe = new JFrame();
		menuframe.setTitle("Sharpshooter 2");
		menuframe.setBounds(100, 100, 622, 398);
		menuframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		menuframe.getContentPane().setLayout(null);
		
		JButton botaoStart = new JButton("Start");
		botaoStart.setContentAreaFilled(false);
		botaoStart.setOpaque(false);
		botaoStart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botaoStart.setFont(new Font("OCR A Extended", Font.BOLD, 30));
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botaoStart.setFont(new Font("OCR A Extended", Font.BOLD, 25));
			}
		});
		botaoStart.setFont(new Font("OCR A Extended", Font.BOLD, 25));
		botaoStart.setBorderPainted(false);
		botaoStart.setFocusPainted(false);
		botaoStart.setBackground(new Color(0,0,0,150));
		botaoStart.setForeground(Color.GREEN);
		botaoStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				MainFrame mf = new MainFrame();
				mf.mainframe.setVisible(true);
				menuframe.dispose();
			}
		});
		
		JLabel titleLabel = new JLabel("Sharpshooter 2");
		titleLabel.setOpaque(true);
		titleLabel.setBackground(new Color(0,0,0,140));
		titleLabel.setForeground(Color.GREEN);
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setFont(new Font("OCR A Extended", Font.BOLD, 52));
		titleLabel.setBounds(10, 11, 586, 82);
		menuframe.getContentPane().add(titleLabel);
		botaoStart.setBounds(430, 288, 142, 60);
		menuframe.getContentPane().add(botaoStart);
		
		JLabel backgroundLabel = new JLabel("");
		backgroundLabel.setBounds(0, 0, 613, 360);
		menuframe.getContentPane().add(backgroundLabel);
		
		ImageIcon background = new ImageIcon("menubackground.gif");
		backgroundLabel.setIcon(background);
		
	}
}
