package lootbox;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.Timer;

public class MainFrame {
	
	public JFrame mainframe;
	private JTextField insertNameBox;
	private Random random;
	private JProgressBar playerHpBar;
	private JProgressBar enemyHpBar;
	private JProgressBar specialBar;
	private JLabel backgroundLabel;
	private JLabel dollarsLabel;
	private JLabel luckyItemLabel;
	private JLabel defendLabel;
	private JLabel attackLabel;
	private JLabel waveLabel;
	private JLabel uiLabel;
	private JLabel player1DamageLabel;
	private JLabel player2DamageLabel;
	private JLabel rollGlowLabel;
	private JLabel dolarsDeductedLabel;
	private JLabel specialLabel;
	private JLabel victoryLabel;
	private JLabel dimBackgroundLabel;
	private JButton botaoEnemy;
	private JButton botaoPlayer;
	private JButton botaoShop;
	private JButton botaoNextRound;
	private JButton botaoInventario;
	private JButton botaoSpecialAttack;
	private ImageIcon background;
	private ImageIcon attacksign;
	private ImageIcon defendsign;
	private ImageIcon enemyshooting;
	private ImageIcon enemyshooting2;
	private ImageIcon enemyshooting3;
	private ImageIcon enemygothit;
	private ImageIcon player;
	private ImageIcon enemy;
	private ImageIcon playershooting;
	private ImageIcon playershooting2;
	private ImageIcon playershooting3;
	private ImageIcon playershootingassaultrifle;
	private ImageIcon playershootingassaultrifle2;
	private ImageIcon playershootingsniperrifle;
	private ImageIcon playershootingsniperrifle2;
	private ImageIcon playershootingsniperrifle3;
	private ImageIcon enemyshootingassaultrifle;
	private ImageIcon enemyshootingassaultrifle2;
	private ImageIcon enemyshootingsniperrifle;
	private ImageIcon enemyshootingsniperrifle2;
	private ImageIcon enemyshootingsniperrifle3;
	private ImageIcon playergothit;
	private ImageIcon playerdefend;
	private ImageIcon botaonextround;
	private ImageIcon botaonextroundbigger;
	private ImageIcon commonpistol;
	private ImageIcon elitepistol;
	private ImageIcon legendarypistol;
	private ImageIcon commonassaultrifle;
	private ImageIcon eliteassaultrifle;
	private ImageIcon legendaryassaultrifle;
	private ImageIcon commonsniperrifle;
	private ImageIcon elitesniperrifle;
	private ImageIcon legendarysniperrifle;
	private ImageIcon bag;
	private ImageIcon bag2;
	private ImageIcon shadow;
	private ImageIcon shadowelite;
	private ImageIcon shadowlegendary;	
	private ImageIcon roll;	
	private ImageIcon rollon;	
	private ImageIcon rollgif;	
	private ImageIcon specialattack;
	private ImageIcon botaospecialattack;
	private ImageIcon botaospecialattackon;
	private ImageIcon enemydefend;
	private Color transparentBlack;
	private DecimalFormat decimalFormat = new DecimalFormat("0.00");
	private boolean choiceIsAllowed;
	private boolean player2IsAlive = true;
	private boolean usedSpecial = false;
	private int wave=1;
	private int enemyInitialHp=100;
	private int player1SpecialCharge=0;
	private int player2SpecialCharge=0;
	private int n;
	Player player1;
	Player player2;	
	private JLabel shadowLabel;
	private JLabel shadowLabel2;
	private JLabel specialLabel2;
	private JProgressBar specialBar2;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.mainframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public void initialize() {
		
		mainframe = new JFrame();
		mainframe.setTitle("LootBox");
		mainframe.setBounds(100, 100, 622, 397);
		mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainframe.getContentPane().setLayout(null);
		
		player1 = new Player();
		player1.setHp(200);
		player2 = new Player();
		choiceIsAllowed=true;
		
		background = new ImageIcon("background.gif");
		attacksign = new ImageIcon("attackSign.png");
		defendsign = new ImageIcon("defendSign.png");
		enemy = new ImageIcon("enemy.png");
		enemyshooting = new ImageIcon("enemyShooting.png");
		enemyshooting2 = new ImageIcon("enemyShooting2.png");
		enemyshooting3 = new ImageIcon("enemyShooting3.png");
		enemyshootingassaultrifle = new ImageIcon("enemyShootingAssaultRifle.png");
		enemyshootingassaultrifle2 = new ImageIcon("enemyShootingAssaultRifle2.png");
		enemyshootingsniperrifle = new ImageIcon("enemyShootingSniperRifle.png");
		enemyshootingsniperrifle2 = new ImageIcon("enemyShootingSniperRifle2.png");
		enemyshootingsniperrifle3 = new ImageIcon("enemyShootingSniperRifle3.png");
		enemydefend = new ImageIcon("enemyDefend.png");
		enemygothit = new ImageIcon("enemyGotHit.png");
		playerdefend = new ImageIcon("playerDefend.png");
		playershooting = new ImageIcon("playerShooting.png");
		playershooting2 = new ImageIcon("playerShooting2.png");
		playershooting3 = new ImageIcon("playerShooting3.png");
		playershootingassaultrifle = new ImageIcon("playerShootingAssaultRifle.png");
		playershootingassaultrifle2 = new ImageIcon("playerShootingAssaultRifle2.png");
		playershootingsniperrifle = new ImageIcon("playerShootingSniperRifle.png");
		playershootingsniperrifle2 = new ImageIcon("playerShootingSniperRifle2.png");
		playershootingsniperrifle3 = new ImageIcon("playerShootingSniperRifle3.png");
		playergothit = new ImageIcon("playerGotHit.png");
		botaonextround = new ImageIcon("botaoNextRound.png");
		botaonextroundbigger = new ImageIcon("botaoNextRoundBigger.png");
		commonpistol = new ImageIcon("commonPistol.png");
		elitepistol = new ImageIcon("elitePistol.png");
		legendarypistol = new ImageIcon("legendaryPistol.png");
		commonassaultrifle = new ImageIcon("commonAssault-rifle.png");
		eliteassaultrifle = new ImageIcon("eliteAssault-rifle.png");
		legendaryassaultrifle = new ImageIcon("legendaryAssault-rifle.png");
		commonsniperrifle = new ImageIcon("commonSniperRifle.png");
		elitesniperrifle = new ImageIcon("eliteSniperRifle.png");
		legendarysniperrifle = new ImageIcon("legendarySniperRifle.png");
		bag = new ImageIcon("botaoInventory.png");
		bag2 = new ImageIcon("botaoInventoryOn.png");
		roll = new ImageIcon("roll.png");
		rollon = new ImageIcon("rollOn.png");
		rollgif = new ImageIcon("roll.gif");
		shadow = new ImageIcon("shadow.png");
		shadowelite = new ImageIcon("shadowElite.png");
		shadowlegendary = new ImageIcon("shadowLegendary.png");
		specialattack = new ImageIcon("specialAttack.gif");
		botaospecialattack = new ImageIcon("botaoSpecialAttack.png");
		botaospecialattackon = new ImageIcon("botaoSpecialAttackOn.png");
		transparentBlack = new Color(0,0,0,175);
		
		botaoInventario = new JButton("");
		botaoInventario.setVisible(false);
		botaoInventario.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botaoInventario.setIcon(bag2);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botaoInventario.setIcon(bag);
			}
		});
		botaoInventario.setBorderPainted(false);
		botaoInventario.setContentAreaFilled(false);
		botaoInventario.setOpaque(false);
		botaoInventario.setIcon(bag);
		botaoInventario.setFocusPainted(false);
		botaoInventario.setBackground(Color.BLACK);
		botaoInventario.setForeground(Color.white);
		botaoInventario.addActionListener(new ActionListener() {			
																							//Abrir o Inventário
			public void actionPerformed(ActionEvent e) {
				SecondFrame sf = new SecondFrame(player1);
				sf.secondframe.setVisible(true);
			}
			
		});		
		botaoNextRound = new JButton("");
		botaoNextRound.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botaoNextRound.setIcon(botaonextroundbigger);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botaoNextRound.setIcon(botaonextround);
			}
		});
		botaoNextRound.setBorderPainted(false);
		botaoNextRound.setContentAreaFilled(false);
		botaoNextRound.setFocusPainted(false);
		botaoNextRound.setIcon(botaonextround);
		botaoNextRound.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nextRound();
			}
		});
		botaoNextRound.setVisible(false);
		
		botaoShop = new JButton("");
		botaoShop.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				rollGlowLabel.setVisible(true);
				botaoShop.setIcon(rollgif);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				rollGlowLabel.setVisible(false);
				botaoShop.setIcon(roll);
			}
		});
		botaoShop.setIcon(roll);
		botaoShop.setBorderPainted(false);
		botaoShop.setContentAreaFilled(false);
		botaoShop.setForeground(new Color(255, 255, 255));
		botaoShop.setBackground(new Color(0, 0, 0));
		botaoShop.setFocusPainted(false);
		botaoShop.setVisible(false);
		botaoShop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				if(player1.getDollars()>=100) {
					dolarsDeductedBlink();
					player1.setDollars(-100);
					String formattedDollars = decimalFormat.format(player1.getDollars());
				    dollarsLabel.setText(formattedDollars + "$");
					
					int n1 = random.nextInt(100);
					int n2 = random.nextInt(100);
					
					Guns rolledGun = new Guns(1, 1);
					rolledGun.rollGun(n1, n2);
					associateImageToWeapon(rolledGun.type, rolledGun.rarity);
					luckyItemLabel.setVisible(true);
					dimBackgroundLabel.setVisible(true);
					dimBackgroundLabel.setOpaque(true);
					
					Timer timer1 = new Timer(500, new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							luckyItemLabel.setVisible(false);
							dimBackgroundLabel.setVisible(false);
							dimBackgroundLabel.setOpaque(false);
						}
					});						
					timer1.start();
					timer1.setRepeats(false);	
					
					if(rolledGun.type == 1 && rolledGun.rarity > player1.gun1.rarity) {
						player1.setGun1(rolledGun);
						System.out.println("guardado na slot1 "+ rolledGun.type + " " + rolledGun.rarity);
						
					}else if(player1.getGun2()==null && rolledGun.type == 2 || rolledGun.type == 2 && rolledGun.rarity > player1.gun2.rarity) {
						player1.setGun2(rolledGun);
						player1.hasAssaultRifle=true;
						System.out.println("guardado na slot2 "+ rolledGun.type + " " + rolledGun.rarity);
						
					}else if(player1.getGun3()==null && rolledGun.type == 3 || rolledGun.type == 3 && rolledGun.rarity > player1.gun3.rarity) {
						player1.setGun3(rolledGun);
						player1.hasSniperRifle=true;
						System.out.println("guardado na slot3 "+ rolledGun.type + " " + rolledGun.rarity);
					}else System.out.println("este item e pior");

				}else System.out.println("you don't have enough money");
			}
		});
		
		attackLabel = new JLabel("");
		attackLabel.setIcon(attacksign);
		attackLabel.setVisible(false);
		
		waveLabel = new JLabel("Wave 1");
		waveLabel.setVisible(false);
		
		player1DamageLabel = new JLabel("");
		player1DamageLabel.setForeground(new Color(255, 255, 255));
		player1DamageLabel.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 30));
		player1DamageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		player1DamageLabel.setVisible(false);
		
		dolarsDeductedLabel = new JLabel("-100$");
		dolarsDeductedLabel.setVisible(false);
		
		specialLabel2 = new JLabel("");
		specialLabel2.setVisible(false);
		
		specialBar = new JProgressBar();
		specialBar.setVisible(false);
		
		specialBar2 = new JProgressBar();
		specialBar2.setBorderPainted(false);
		specialBar2.setBackground(transparentBlack);
		specialBar2.setForeground(Color.YELLOW);
		specialBar2.setVisible(false);
		
		victoryLabel = new JLabel("");
		victoryLabel.setVisible(false);
		
		luckyItemLabel = new JLabel("");
		luckyItemLabel.setVisible(false);
		luckyItemLabel.setBounds(234, 114, 159, 117);
		mainframe.getContentPane().add(luckyItemLabel);
		victoryLabel.setBounds(204, 87, 216, 67);
		mainframe.getContentPane().add(victoryLabel);
		
		dimBackgroundLabel = new JLabel("");
		dimBackgroundLabel.setVisible(false);
		dimBackgroundLabel.setBounds(0, 0, 613, 360);
		dimBackgroundLabel.setBackground(transparentBlack);
		mainframe.getContentPane().add(dimBackgroundLabel);
		specialBar2.setMaximum(3);
		specialBar2.setBounds(419, 120, 146, 10);
		mainframe.getContentPane().add(specialBar2);
		specialBar.setMaximum(3);
		specialBar.setBorderPainted(false);
		specialBar.setBackground(transparentBlack);
		specialBar.setForeground(Color.YELLOW);
		specialBar.setBounds(25, 60, 174, 14);
		mainframe.getContentPane().add(specialBar);
		specialLabel2.setIcon(specialattack);
		specialLabel2.setBounds(23, 175, 174, 161);
		mainframe.getContentPane().add(specialLabel2);
		
		specialLabel = new JLabel("");
		specialLabel.setVisible(false);
		specialLabel.setBounds(399, 175, 174, 161);
		specialLabel.setIcon(specialattack);
		mainframe.getContentPane().add(specialLabel);
		
		JLabel helmetLabel = new JLabel("");
		helmetLabel.setBounds(84, 146, 47, 40);
		mainframe.getContentPane().add(helmetLabel);
		dolarsDeductedLabel.setFont(new Font("Monospaced", Font.BOLD, 17));
		dolarsDeductedLabel.setHorizontalAlignment(SwingConstants.CENTER);
		dolarsDeductedLabel.setForeground(Color.RED);
		dolarsDeductedLabel.setBounds(320, 265, 71, 21);
		mainframe.getContentPane().add(dolarsDeductedLabel);
		
		player2DamageLabel = new JLabel("");
		player2DamageLabel.setHorizontalAlignment(SwingConstants.CENTER);
		player2DamageLabel.setForeground(new Color(255, 255, 255));
		player2DamageLabel.setFont(new Font("Bauhaus 93", Font.BOLD | Font.ITALIC, 30));
		player2DamageLabel.setBounds(371, 131, 71, 55);
		mainframe.getContentPane().add(player2DamageLabel);
		player1DamageLabel.setBounds(141, 131, 71, 55);
		mainframe.getContentPane().add(player1DamageLabel);
		
		shadowLabel2 = new JLabel("");
		shadowLabel2.setVisible(false);
		shadowLabel2.setIcon(new ImageIcon("G:\\O meu disco\\IVO\\LootBox\\shadow.png"));
		shadowLabel2.setBounds(376, 125, 71, 55);
		mainframe.getContentPane().add(shadowLabel2);
		
		shadowLabel = new JLabel("");
		shadowLabel.setVisible(false);
		shadowLabel.setIcon(new ImageIcon("shadow.png"));
		shadowLabel.setBounds(145, 125, 71, 55);
		mainframe.getContentPane().add(shadowLabel);
		waveLabel.setForeground(Color.RED);
		waveLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		waveLabel.setHorizontalAlignment(SwingConstants.LEFT);
		waveLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		waveLabel.setBounds(470, 307, 103, 40);
		mainframe.getContentPane().add(waveLabel);
		attackLabel.setBounds(385, 187, 96, 67);
		mainframe.getContentPane().add(attackLabel);
		
		defendLabel = new JLabel("");
		defendLabel.setIcon(defendsign);
		defendLabel.setVisible(false);
		defendLabel.setBounds(117, 187, 96, 67);
		mainframe.getContentPane().add(defendLabel);		
		
		botaoShop.setBounds(324, 280, 89, 67);
		mainframe.getContentPane().add(botaoShop);
		
		rollGlowLabel = new JLabel("");
		rollGlowLabel.setIcon(rollon);
		rollGlowLabel.setVisible(false);
		rollGlowLabel.setBounds(342, 279, 89, 67);
		mainframe.getContentPane().add(rollGlowLabel);
		
		botaoNextRound.setBounds(486, 164, 96, 67);
		mainframe.getContentPane().add(botaoNextRound);		
		
		JLabel playerNameLabel = new JLabel("");
		playerNameLabel.setFont(new Font("Tahoma", Font.BOLD, 17));
		playerNameLabel.setForeground(new Color(255, 255, 255));
		playerNameLabel.setBounds(25, 11, 198, 23);
		mainframe.getContentPane().add(playerNameLabel);
		
		botaoInventario.setBounds(260, 284, 89, 55);
		mainframe.getContentPane().add(botaoInventario);
		
		dollarsLabel = new JLabel("0$");
		dollarsLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		dollarsLabel.setVisible(false);
		
		botaoSpecialAttack = new JButton("");
		botaoSpecialAttack.setEnabled(false);
		botaoSpecialAttack.setVisible(false);
		botaoSpecialAttack.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				botaoSpecialAttack.setIcon(botaospecialattackon);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				botaoSpecialAttack.setIcon(botaospecialattack);
			}
		});
		botaoSpecialAttack.setIcon(botaospecialattack);
		botaoSpecialAttack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(choiceIsAllowed) {
					usedSpecial = true;
					specialLabel.setVisible(true);
					playerTurn();
					botaoSpecialAttack.setEnabled(false);	
					usedSpecial = false;
					player1SpecialCharge=0;
					specialBar.setValue(player1SpecialCharge);
					if(player2.getHp()<=0) {						
						Timer timer2 = new Timer(350, new ActionListener() {
							public void actionPerformed(ActionEvent evt) {								
								victory();
							}
						});
						Timer timer1 = new Timer(200, new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								player2Death();
								timer2.start();
								timer2.setRepeats(false);
							}
						});						
						timer1.start();
						timer1.setRepeats(false);						
					}else {
						Timer timer2 = new Timer(800, new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								choiceIsAllowed=true;
							}
						});
						Timer timer = new Timer(800, new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								enemyTurn();
								specialBar2.setValue(player2SpecialCharge);
								timer2.setRepeats(false);
								timer2.start();
							}
						});
						timer.setRepeats(false);
						timer.start();
					}	
				}			
			}
		});
		botaoSpecialAttack.setFocusPainted(false);
		botaoSpecialAttack.setBorderPainted(false);
		botaoSpecialAttack.setContentAreaFilled(false);
		botaoSpecialAttack.setBounds(196, 284, 89, 55);
		mainframe.getContentPane().add(botaoSpecialAttack);
		dollarsLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		dollarsLabel.setForeground(new Color(0, 255, 0));
		dollarsLabel.setBounds(477, 11, 96, 23);
		mainframe.getContentPane().add(dollarsLabel);
			
		playerHpBar = new JProgressBar();
		playerHpBar.setMaximum(200);
		playerHpBar.setBorderPainted(false);
		playerHpBar.setBackground(transparentBlack);
		playerHpBar.setVisible(false);
		playerHpBar.setForeground(Color.GREEN);
		playerHpBar.setValue(200);
		playerHpBar.setBounds(25, 35, 557, 23);
		mainframe.getContentPane().add(playerHpBar);
		
		botaoEnemy = new JButton("");
		botaoEnemy.setVisible(false);
		botaoEnemy.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				if(choiceIsAllowed) {
					tutorialSwitchOff();
					
					attackLabel.setVisible(true);
					defendLabel.setVisible(false);
				}
			}
		});
		botaoEnemy.setHorizontalTextPosition(SwingConstants.RIGHT);
		botaoEnemy.setBorderPainted(false);
		
		insertNameBox =  new JTextField();
		insertNameBox.setToolTipText("");
		insertNameBox.setBackground(Color.BLACK);
		insertNameBox.setForeground(new Color(255, 255, 255));
		insertNameBox.setBounds(218, 178, 173, 36);
		mainframe.getContentPane().add(insertNameBox);
		insertNameBox.setColumns(10);
		
		JLabel insertNameLabel = new JLabel("Insert your name");
		
		insertNameBox.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				
				if (e.getKeyCode() == KeyEvent.VK_ENTER && insertNameBox.getText().isEmpty() == false) {
					player1.name = insertNameBox.getText();
					tutorialSwitchOn();
					playerNameLabel.setText(player1.name);
					insertNameLabel.setVisible(false);
					dollarsLabel.setVisible(true);
					insertNameBox.setVisible(false);
					playerHpBar.setVisible(true);
					uiLabel.setVisible(true);
					botaoInventario.setVisible(true);					
					enemyHpBar.setVisible(true);
					botaoEnemy.setVisible(true);		
					botaoPlayer.setVisible(true);
					botaoSpecialAttack.setVisible(true);
					specialBar.setVisible(true);
					specialBar2.setVisible(true);
				}				
			}
		});	
		
		enemyHpBar = new JProgressBar();
		enemyHpBar.setVisible(false);
		enemyHpBar.setBackground(transparentBlack);
		enemyHpBar.setBorderPainted(false);
		enemyHpBar.setForeground(Color.GREEN);
		enemyHpBar.setValue(100);
		enemyHpBar.setBounds(419, 104, 146, 14);
		
		mainframe.getContentPane().add(enemyHpBar);
		botaoEnemy.setIcon(enemy);

		botaoEnemy.addActionListener(new ActionListener() {				//Botao onde aparece o Player2
			public void actionPerformed(ActionEvent e) {
				if(choiceIsAllowed) {		
					choiceIsAllowed=false;
					Random random = new Random();
					n = random.nextInt(100);
					if(n<35&&player1SpecialCharge>=3) {
						player2.defended=true;
					}
					if(player1SpecialCharge<3)player1SpecialCharge++;
					specialBar.setValue(player1SpecialCharge);
					playerTurn();
					if(player2.getHp()<=0) {
						player2IsAlive=false;
						if(player1SpecialCharge>=3)botaoSpecialAttack.setEnabled(true);
						Timer timer2 = new Timer(350, new ActionListener() {
							public void actionPerformed(ActionEvent evt) {								
								victory();
							}
						});
						Timer timer1 = new Timer(200, new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								player2Death();
								timer2.start();
								timer2.setRepeats(false);
							}
						});						
						timer1.start();
						timer1.setRepeats(false);	
					}else if(player2.defended==false){
						Timer timer2 = new Timer(500, new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								if(player2IsAlive)choiceIsAllowed=true;
							}
						});
						
						Timer timer = new Timer(500, new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								enemyTurn();
								timer2.setRepeats(false);
								timer2.start();
							}
						});
						timer.setRepeats(false);
						timer.start();
						if(player1SpecialCharge >= 3) {
							botaoSpecialAttack.setEnabled(true);
						}
					}else {
						Timer timer = new Timer(700, new ActionListener() {
							public void actionPerformed(ActionEvent evt) {
								choiceIsAllowed=true;
								player2.defended=false;		
							}
						});
						timer.setRepeats(false);
						timer.start();									
					}
				}						
			}
		});
		botaoEnemy.setContentAreaFilled(false);
		botaoEnemy.setFocusPainted(false);
		botaoEnemy.setBounds(423, 130, 107, 187);
		mainframe.getContentPane().add(botaoEnemy);
		
		botaoPlayer = new JButton("");
		botaoPlayer.addActionListener(new ActionListener() {			//Botao onde aparece o Player1
			public void actionPerformed(ActionEvent e) {
				player1.defended=true;
				if(player2IsAlive && choiceIsAllowed) {
					choiceIsAllowed=false;
					enemyTurn();
					Timer timer = new Timer(700, new ActionListener() {
						public void actionPerformed(ActionEvent evt) {
							if(player2.getHp()>0)choiceIsAllowed=true;
						}
					});
					timer.setRepeats(false);
					timer.start();
				}		
			}
		});
		botaoPlayer.addMouseListener(new MouseAdapter() {	
			@Override
			public void mouseEntered(MouseEvent e) {
				
				if(player2IsAlive && choiceIsAllowed) {	
					tutorialSwitchOff();
					defendLabel.setVisible(true);
					attackLabel.setVisible(false);
				}					
			}
		});		
		botaoPlayer.setContentAreaFilled(false);
		botaoPlayer.setBorderPainted(false);
		botaoPlayer.setFocusPainted(false);
		botaoPlayer.setVisible(false);
		botaoPlayer.setBounds(67, 130, 107, 187);
		botaoPlayer.setIcon(player);
		mainframe.getContentPane().add(botaoPlayer);
		insertNameLabel.setHorizontalAlignment(SwingConstants.CENTER);
		insertNameLabel.setForeground(Color.WHITE);
		insertNameLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		insertNameLabel.setBounds(222, 144, 169, 23);
		mainframe.getContentPane().add(insertNameLabel);
		
		uiLabel = new JLabel("");
		uiLabel.setVisible(false);
		uiLabel.setBackground(transparentBlack);
		uiLabel.setOpaque(true);
		uiLabel.setBounds(25, 309, 557, 38);
		mainframe.getContentPane().add(uiLabel);
		
		backgroundLabel = new JLabel("");
		backgroundLabel.setBounds(0, 0, 613, 360);
		mainframe.getContentPane().add(backgroundLabel);
		backgroundLabel.setIcon(background);
		player1WeaponCheck();		
		player2WeaponCheck();
	}
	
	public void playerTurn() {		
		choiceIsAllowed=false;
		attackLabel.setVisible(false);
		defendLabel.setVisible(false);
		player2.setHp(player2.getHp() - calculateDamage(player1, player2));
		System.out.println(calculateDamage(player1, player2));
		showPlayer1DamageOn(calculateDamage(player1, player2));
		enemyHpBar.setValue(player2.getHp());
		if(lowHp(player2.getHp())) enemyHpBar.setForeground(Color.red);					
		System.out.println(player2.getHp());	
		player1ShootingAnimation();
	}
	
	public void enemyTurn() {
		attackLabel.setVisible(false);
		defendLabel.setVisible(false);
		Random random = new Random();
		n = random.nextInt(100);
		if(player2SpecialCharge>=3 && n<55) {
			enemySpecialAttack();
			Timer timer = new Timer(400, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					specialLabel2.setVisible(false);
				}
			});
			timer.setRepeats(false);
			timer.start();	
		}else{
			player1.setHp(player1.getHp() - calculateDamage(player2, player1));
			playerHpBar.setValue(player1.getHp());
			if(lowHp(player1.getHp())) playerHpBar.setForeground(Color.red);					
			System.out.println(player1.getHp());	
			if(player2SpecialCharge<3&&player2.defended==false)player2SpecialCharge++;
			player2ShootingAnimation();
		}
		if(player1.getHp()<=0)player1Death();
		specialBar2.setValue(player2SpecialCharge);
	}
		
	
	public boolean lowHp(int playerHp) {
		return playerHp < 25;
	}
	
	public void player1ShootingAnimation() {
		
		showPlayer1DamageOn(calculateDamage(player1, player2));
		choiceIsAllowed=false;
		if(player2.defended) {
			botaoEnemy.setIcon(enemydefend);			
		}else botaoEnemy.setIcon(enemygothit);
		
		if(player1.equippedWeapon == 1) {			
			botaoPlayer.setIcon(playershooting);
			Timer timer3 = new Timer(200, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {	
					specialLabel.setVisible(false);
					showPlayer1DamageOff();
					player1WeaponCheck();
					if(player2IsAlive)player2WeaponCheck();					
				}
			});
			timer3.setRepeats(false);
			Timer timer2 = new Timer(50, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoPlayer.setIcon(playershooting3);
					timer3.start();
				}
			});
			timer2.setRepeats(false);
			
			Timer timer1 = new Timer(50, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoPlayer.setIcon(playershooting2);
					timer2.start();
				}
			});
			timer1.setRepeats(false);
			timer1.start();
		}
		
		if(player1.equippedWeapon == 2) {			
			botaoPlayer.setIcon(playershootingassaultrifle);
			Timer timer3 = new Timer(100, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {	
					specialLabel.setVisible(false);
					showPlayer1DamageOff();
					player1WeaponCheck();
					if(player2IsAlive)player2WeaponCheck();
				}
			});
			timer3.setRepeats(false);
			Timer timer2 = new Timer(100, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoPlayer.setIcon(playershootingassaultrifle2);
					timer3.start();
				}
			});
			timer2.setRepeats(false);
			
			Timer timer1 = new Timer(200, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoPlayer.setIcon(playershootingassaultrifle2);
					timer2.start();
				}
			});
			timer1.setRepeats(false);
			timer1.start();
		}
		
		if(player1.equippedWeapon == 3) {		
			
			botaoPlayer.setIcon(playershootingsniperrifle);
			Timer timer3 = new Timer(200, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {	
					specialLabel.setVisible(false);
					showPlayer1DamageOff();
					player1WeaponCheck();
					if(player2IsAlive)player2WeaponCheck();
				}
			});
			timer3.setRepeats(false);
			Timer timer2 = new Timer(50, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoPlayer.setIcon(playershootingsniperrifle3);
					timer3.start();
				}
			});
			timer2.setRepeats(false);
			
			Timer timer1 = new Timer(50, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoPlayer.setIcon(playershootingsniperrifle2);
					timer2.start();
				}
			});
			timer1.setRepeats(false);
			timer1.start();
		}
	}
	
	public void player2ShootingAnimation() {
		
		if(player1.defended) {
		botaoPlayer.setIcon(playerdefend);
		}else botaoPlayer.setIcon(playergothit);
		
		showPlayer2DamageOn(calculateDamage(player2, player1));
		
		if(player2.equippedWeapon == 1) {		
			
			botaoEnemy.setIcon(enemyshooting);
			Timer timer3 = new Timer(200, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					specialLabel2.setVisible(false);
					player1WeaponCheck();
					player2WeaponCheck();
					showPlayer2DamageOff();
					player1.defended=false;
				}
			});
			timer3.setRepeats(false);
			Timer timer2 = new Timer(50, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoEnemy.setIcon(enemyshooting3);
					timer3.start();
				}
			});
			timer2.setRepeats(false);
			
			Timer timer1 = new Timer(50, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoEnemy.setIcon(enemyshooting2);
					timer2.start();
				}
			});
			timer1.setRepeats(false);
			timer1.start();
		}
		
		if(player2.equippedWeapon == 2) {	
			
			botaoEnemy.setIcon(enemyshootingassaultrifle);
			Timer timer3 = new Timer(100, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {
					specialLabel2.setVisible(false);
					player1WeaponCheck();
					player2WeaponCheck();
					showPlayer2DamageOff();					
					player1.defended=false;
				}
			});
			timer3.setRepeats(false);
			Timer timer2 = new Timer(100, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoEnemy.setIcon(enemyshootingassaultrifle2);
					timer3.start();
				}
			});
			timer2.setRepeats(false);
			
			Timer timer1 = new Timer(200, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoEnemy.setIcon(enemyshootingassaultrifle2);
					timer2.start();
				}
			});
			timer1.setRepeats(false);
			timer1.start();
		}
		
		if(player2.equippedWeapon == 3) {		
			
			botaoEnemy.setIcon(enemyshootingsniperrifle);
			Timer timer3 = new Timer(200, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {	
					specialLabel2.setVisible(false);
					player1WeaponCheck();
					player2WeaponCheck();
					showPlayer2DamageOff();
					player1.defended=false;
				}
			});
			timer3.setRepeats(false);
			Timer timer2 = new Timer(50, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoEnemy.setIcon(enemyshootingsniperrifle3);
					timer3.start();
				}
			});
			timer2.setRepeats(false);
			
			Timer timer1 = new Timer(50, new ActionListener() {
				public void actionPerformed(ActionEvent evt) {					
					botaoEnemy.setIcon(enemyshootingsniperrifle2);
					timer2.start();
				}
			});
			timer1.setRepeats(false);
			timer1.start();
		}
	}
	
	public void player1Death() {
		
		playerHpBar.setValue(player1.getHp());
		Timer timer = new Timer(100, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {				
				Gameover gm = new Gameover();
				gm.gameoverframe.setVisible(true);
				mainframe.dispose();					
			}
		});	
		timer.setRepeats(false);
		timer.start();		
		
	}
	
	public void player2Death() {
		choiceIsAllowed=false;
		random = new Random();
		float drop = random.nextFloat() * 2000.0f;
		player1.setDollars(drop);
		String formattedDollars = decimalFormat.format(player1.getDollars());
	    dollarsLabel.setText(formattedDollars + "$");
		botaoEnemy.setVisible(false);
		enemyHpBar.setVisible(false);	
		specialBar2.setVisible(false);
		player2SpecialCharge = 0;
	}
	
	public void nextRound() {
		if(wave==3) {
			backgroundLabel.setIcon(new ImageIcon("background2.gif"));
			player2.gun2 = new Guns(2,1);
			player2.equippedWeapon = 2;
		}
		if(wave==6) {
			backgroundLabel.setIcon(new ImageIcon("background3.gif"));
			player2.gun2 = new Guns(2,2);
			player2.equippedWeapon = 2;
		}
		if(wave==9) {
			backgroundLabel.setIcon(new ImageIcon("background4.gif"));
			player2.gun2 = new Guns(2,3);
			player2.equippedWeapon = 2;
		}
		if(wave==12) {
			backgroundLabel.setIcon(new ImageIcon("background5.gif"));
			player2.gun3 = new Guns(3,2);
			player2.equippedWeapon = 3;
		}
		incrementWave();
		player1WeaponCheck();
		player2WeaponCheck();
		botaoPlayer.setIcon(player);
		botaoShop.setVisible(false);
		choiceIsAllowed=true;
		player1.setHp(200);
		playerHpBar.setValue(player1.getHp());
		playerHpBar.setForeground(Color.green);
		player2IsAlive = true;
		specialBar2.setVisible(true);
		player2.setHp(enemyInitialHp);
		enemyInitialHp+=20;  //Increasing enemy Hp as waves progress
		enemyHpBar.setMaximum(enemyInitialHp);
		enemyHpBar.setValue(enemyInitialHp);
		enemyHpBar.setForeground(Color.green);
		enemyHpBar.setVisible(true);
		botaoEnemy.setVisible(true);
		botaoEnemy.setIcon(enemy);
		specialBar2.setValue(player2SpecialCharge);
		botaoNextRound.setVisible(false);
		luckyItemLabel.setVisible(false);
	}
	
	public void player1WeaponCheck() {
		if(player1.equippedWeapon==1) {
			player = new ImageIcon("playerPistol.png");
			botaoPlayer.setIcon(player);
		}else if(player1.equippedWeapon==2) {
			player = new ImageIcon("playerAssaultRifle.png");
			botaoPlayer.setIcon(player);
		}else if(player1.equippedWeapon==3) {
			player = new ImageIcon("playerSniperRifle.png");
			botaoPlayer.setIcon(player);
		}
	}
	
	public void player2WeaponCheck() {
		if(player2.equippedWeapon==1) {
			enemy = new ImageIcon("enemy.png");
			botaoEnemy.setIcon(enemy);
		}else if(player2.equippedWeapon==2) {
			enemy = new ImageIcon("enemyAssaultRifle.png");
			botaoEnemy.setIcon(enemy);
		}else if(player2.equippedWeapon==3) {
			enemy = new ImageIcon("enemySniperRifle.png");
			botaoEnemy.setIcon(enemy);
		}
	}

	public void associateImageToWeapon(int n1, int n2) {

		if(n1==1) {
			if(n2==1) luckyItemLabel.setIcon(commonpistol);
			if(n2==2) luckyItemLabel.setIcon(elitepistol);
			if(n2==3) luckyItemLabel.setIcon(legendarypistol);
		}
		if(n1==2) {
			if(n2==1) luckyItemLabel.setIcon(commonassaultrifle);
			if(n2==2) luckyItemLabel.setIcon(eliteassaultrifle);
			if(n2==3) luckyItemLabel.setIcon(legendaryassaultrifle);
		}
		if(n1==3) {
			if(n2==1) luckyItemLabel.setIcon(commonsniperrifle);
			if(n2==2) luckyItemLabel.setIcon(elitesniperrifle);
			if(n2==3) luckyItemLabel.setIcon(legendarysniperrifle);
		}
	}
	
	public void tutorialSwitchOn() {
		
	}
	
	public void tutorialSwitchOff() {
		waveLabel.setVisible(true);
	}
	
	public void incrementWave() {
		wave+=1;
		waveLabel.setText("Wave " + wave);
	}

	public int calculateDamage(Player attacker, Player defender) {
		if(attacker.equippedWeapon==1)return attacker.gun1.getDamage(defender, usedSpecial);
		if(attacker.equippedWeapon==2)return attacker.gun2.getDamage(defender, usedSpecial);
		if(attacker.equippedWeapon==3)return attacker.gun3.getDamage(defender, usedSpecial);
		return 0;
	}

	public void showPlayer1DamageOn(int n1) {
		if(player1.getEquippedWeapon().rarity==3) {
			player1DamageLabel.setForeground(Color.black);
			shadowLabel.setIcon(shadowlegendary);
		}
		if(player1.getEquippedWeapon().rarity==2) {
			player1DamageLabel.setForeground(Color.white);
			shadowLabel.setIcon(shadowelite);
		}
		if(player1.getEquippedWeapon().rarity==1) {
			player1DamageLabel.setForeground(Color.white);
			shadowLabel.setIcon(shadow);
		}
		player1DamageLabel.setVisible(true);
		shadowLabel.setVisible(true);		
		player1DamageLabel.setText(String.valueOf(n1));
	}
	
	public void showPlayer1DamageOff() {
		player1DamageLabel.setVisible(false);
		shadowLabel.setVisible(false);
	}
	
	public void showPlayer2DamageOn(int n1) {
		if(player2.getEquippedWeapon().rarity==3) {
			player2DamageLabel.setForeground(Color.black);
			shadowLabel2.setIcon(shadowlegendary);
		}
		if(player2.getEquippedWeapon().rarity==2) {
			player2DamageLabel.setForeground(Color.white);
			shadowLabel2.setIcon(shadowelite);
		}
		if(player2.getEquippedWeapon().rarity==1) {
			player2DamageLabel.setForeground(Color.white);
			shadowLabel2.setIcon(shadow);
		}
		player2DamageLabel.setVisible(true);
		shadowLabel2.setVisible(true);
		player2DamageLabel.setText(String.valueOf(n1));
	}
	
	public void showPlayer2DamageOff() {
		player2DamageLabel.setVisible(false);
		shadowLabel2.setVisible(false);
	}
	
	public void dolarsDeductedBlink() {
		dolarsDeductedLabel.setVisible(true);
		Timer timer = new Timer(200, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {				
				dolarsDeductedLabel.setVisible(false);
			}
		});	
		timer.setRepeats(false);
		timer.start();
	}
	
	public void enemySpecialAttack() {
		
		
		usedSpecial = true;
		player1.setHp(player1.getHp() - calculateDamage(player2, player1));
		playerHpBar.setValue(player1.getHp());
		specialLabel2.setVisible(true);
		player2SpecialCharge=0;
		specialBar2.setValue(player2SpecialCharge);		
		player2ShootingAnimation();
		usedSpecial = false;
		if(player1.getHp()<=0) {
			player1Death();
		}	
	}
	
	public void victory() {
		luckyItemLabel.setIcon(new ImageIcon("win.gif"));
		victoryLabel.setIcon(new ImageIcon("victory.gif"));
		luckyItemLabel.setVisible(true);
		dimBackgroundLabel.setVisible(true);
		dimBackgroundLabel.setOpaque(true);
		victoryLabel.setVisible(true);
		Timer timer1 = new Timer(1000, new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				luckyItemLabel.setVisible(false);
				victoryLabel.setVisible(false);
				botaoShop.setVisible(true);
				botaoNextRound.setVisible(true);
				dimBackgroundLabel.setVisible(false);
				dimBackgroundLabel.setOpaque(false);
			}
		});
		timer1.setRepeats(false);
		timer1.start();
			
	}
}



