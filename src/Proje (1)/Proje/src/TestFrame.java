
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.security.PublicKey;
import java.util.HashMap;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import javax.swing.JSplitPane;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;

import javax.swing.SwingConstants;

public class TestFrame extends JFrame {
	private JTextField trText;
	private JTextField trText2;

	private JButton answerButton2;

	public JLayeredPane layeredPane;
	private JPanel resultPanel;
	private JPanel testPanel;
	private JPanel chosePanel;
	private JPanel wordPanel;
	private JPanel visualPanel;
	private JTextField userNameText;
	private JTextField adminUserNameText;
	private JPasswordField passwordText;
	private JPasswordField adminPasswordText;
	private JButton kayitButton;
	private JButton adminSignInButton;
	private JLabel userNameLabel;
	private JLabel adminUserNameLabel;
	private JLabel linkLabel;
	private JLabel adminLinkLabel;
	private HashMap<String, String> customerHashMap;
	private User user;
	private JButton adminLoginButton;
	// private JPanel adminLoginJPanel;
	private HashMap<String, String> adminHashMap;
	private String x;
	private int testIx = 0;
	int puan;
	int dogru;
	int yanlis;
	int bos;
	int topsoru;
	int wordIx = 0;
	int picIx = 0;
	private JLabel trueFalseLabel;
	private JLabel lblNewLabel_3_2;

	private JLabel trueCount;
	private JLabel emptyCount;
	private JLabel falseCount;
	private JLabel pictureLabel;

	Customer customer;
	JLabel questionLabel;
	JRadioButton aRadio;
	JRadioButton bRadio;
	JRadioButton cRadio;
	private JLabel lblNewLabel_1;
	static TestFrame frame;

	/**
	 * Launch the application.
	 */

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame = new TestFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TestFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 590);
		getContentPane().setLayout(null);

		layeredPane = new JLayeredPane();
		layeredPane.setBounds(0, 0, 728, 551);
		getContentPane().add(layeredPane);

		JPanel adminLoginPanel = new JPanel();

		JFrame adminChoseFrame = new AdminChoseScreen();

		customer = new Customer();
		Admin admin = new Admin();

		user = new User();
		customerHashMap = new HashMap<>();
		customerHashMap.put("akerim", "akerim");

		adminHashMap = new HashMap<>();
		adminHashMap.put("hasan", "hasan");

		AdminTestScreen adminTestScreen = new AdminTestScreen();
		LinkedList<String> a = adminTestScreen.aSeceneki;
		LinkedList<String> b = adminTestScreen.bSeceneki;
		LinkedList<String> c = adminTestScreen.cSeceneki;
		LinkedList<String> answer = adminTestScreen.cevap;
		LinkedList<String> question = adminTestScreen.soru;

		AdminWordScreen adminWordFrame = new AdminWordScreen();
		LinkedList<String> engWord = adminWordFrame.kelimeList;
		LinkedList<String> trkWord = adminWordFrame.anlamList;

		AdminVisualScreen adminVisualScreen = new AdminVisualScreen();
		LinkedList<String> pictureLinkedList = adminVisualScreen.adres;
		LinkedList<String> answerPicLinkedList = adminVisualScreen.cevap;

		// *************************************************************************************
		visualPanel = new JPanel();
		visualPanel.setBounds(0, 0, 728, 551);
		layeredPane.add(visualPanel);
		visualPanel.setLayout(null);

		JLabel visualLabel;
		visualLabel = new JLabel("Görsel Quiz");
		visualLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		visualLabel.setBounds(308, 31, 133, 20);

		visualPanel.add(visualLabel);

		trText2 = new JTextField();
		trText2.setBounds(223, 378, 271, 33);
		visualPanel.add(trText2);
		trText2.setColumns(10);
		answerButton2 = new JButton("Cevapla");
		answerButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (customer.isAnswerTrue(trText2.getText(), answerPicLinkedList, picIx)) {
					lblNewLabel_1.setForeground(Color.GREEN);
					lblNewLabel_1.setText("DOĞRU");
					lblNewLabel_1.setVisible(true);
					puan += 10;
					dogru++;

				} else {
					lblNewLabel_1.setText("YANLIŞ");
					lblNewLabel_1.setForeground(Color.RED);
					lblNewLabel_1.setVisible(true);
					yanlis++;
				}
			}
		});
		answerButton2.setBounds(308, 475, 104, 33);
		visualPanel.add(answerButton2);

		JButton leaveButton2;
		leaveButton2 = new JButton("Quizi Terket");
		leaveButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.switchPanel(layeredPane, chosePanel);
			}
		});
		leaveButton2.setBackground(new Color(255, 69, 0));
		leaveButton2.setBounds(27, 475, 104, 33);
		visualPanel.add(leaveButton2);

		pictureLabel = new JLabel("New label");
		pictureLabel.setBounds(227, 76, 250, 250);
		pictureLabel.setIcon(new ImageIcon(pictureLinkedList.get(picIx)));
		visualPanel.add(pictureLabel);

		JButton nextButton2;
		nextButton2 = new JButton("Sıradaki");
		nextButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trText2.setText("");
				lblNewLabel_1.setVisible(false);
				picIx++;
				try {

					pictureLabel.setIcon(new ImageIcon(pictureLinkedList.get(picIx)));
					if (picIx == (pictureLinkedList.size() - 1)) {
						nextButton2.setText("Quizi Bitir");
					}
				} catch (Exception e2) {
					lblNewLabel_3_2.setText(String.valueOf(puan));

					topsoru = engWord.size();
					trueCount.setText(String.valueOf(dogru));
					emptyCount.setText(String.valueOf(topsoru - (dogru + yanlis)));
					falseCount.setText(String.valueOf(yanlis));

					user.switchPanel(layeredPane, resultPanel);
				}
			}
		});
		nextButton2.setBackground(Color.WHITE);
		nextButton2.setBounds(560, 475, 104, 33);
		visualPanel.add(nextButton2);

		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setForeground(Color.GREEN);
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 21));
		lblNewLabel_1.setBounds(267, 422, 182, 42);
		lblNewLabel_1.setVisible(false);
		visualPanel.add(lblNewLabel_1);

		// *****************************************************************************************
		wordPanel = new JPanel();
		wordPanel.setBounds(0, 0, 728, 551);
		layeredPane.add(wordPanel);
		wordPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Kelime Quizi");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setBounds(298, 31, 133, 20);
		wordPanel.add(lblNewLabel);

		JLabel engLabel = new JLabel("Yabancı kelime");
		engLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		engLabel.setBounds(229, 139, 181, 33);
		engLabel.setText(engWord.get(wordIx));
		wordPanel.add(engLabel);

		trText = new JTextField();
		trText.setBounds(229, 183, 271, 33);
		wordPanel.add(trText);
		trText.setColumns(10);

		JButton answerButton = new JButton("Cevapla");
		answerButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (customer.isAnswerTrue(trText.getText(), trkWord, wordIx)) {
					trueFalseLabel.setForeground(Color.GREEN);
					trueFalseLabel.setText("DOĞRU");
					trueFalseLabel.setVisible(true);
					puan += 10;
					dogru++;

				} else {
					trueFalseLabel.setText("YANLIŞ");
					trueFalseLabel.setForeground(Color.RED);
					trueFalseLabel.setVisible(true);
					yanlis++;
				}

			}
		});
		answerButton.setBounds(314, 259, 104, 33);
		wordPanel.add(answerButton);

		JButton leaveButton = new JButton("Quizi Terket");
		leaveButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.switchPanel(layeredPane, chosePanel);
			}
		});
		leaveButton.setBackground(new Color(255, 69, 0));
		leaveButton.setBounds(27, 475, 104, 33);
		wordPanel.add(leaveButton);

		JButton nextButton = new JButton("Sıradaki");

		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// sıradaki soru
				trText.setText("");
				trueFalseLabel.setVisible(false);
				wordIx++;
				try {
					engLabel.setText(engWord.get(wordIx));
					if (wordIx == (engWord.size() - 1)) {
						nextButton.setText("Quizi Bitir");
					}
				} catch (Exception e2) {
					lblNewLabel_3_2.setText(String.valueOf(puan));

					topsoru = engWord.size();
					trueCount.setText(String.valueOf(dogru));
					emptyCount.setText(String.valueOf(topsoru - (dogru + yanlis)));
					falseCount.setText(String.valueOf(yanlis));

					user.switchPanel(layeredPane, resultPanel);
				}

			}
		});
		nextButton.setBackground(Color.WHITE);
		nextButton.setBounds(553, 312, 104, 33);
		wordPanel.add(nextButton);

		trueFalseLabel = new JLabel("Kelime Quizi");
		trueFalseLabel.setForeground(Color.GREEN);
		trueFalseLabel.setHorizontalAlignment(SwingConstants.CENTER);
		trueFalseLabel.setFont(new Font("Tahoma", Font.BOLD, 21));
		trueFalseLabel.setBounds(278, 303, 181, 42);
		trueFalseLabel.setVisible(false);
		wordPanel.add(trueFalseLabel);

		// wordPanel.setVisible(false);

		// *********************************************************************************************
		resultPanel = new JPanel();
		resultPanel.setBounds(0, 0, 728, 551);
		layeredPane.add(resultPanel);
		resultPanel.setLayout(null);

		JLabel finishLabel = new JLabel("Test Bitti");
		finishLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		finishLabel.setBounds(310, 80, 97, 39);
		resultPanel.add(finishLabel);

		JLabel trueLabel = new JLabel("Doğru:");
		trueLabel.setForeground(new Color(0, 0, 0));
		trueLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));

		trueLabel.setBounds(256, 217, 97, 28);
		resultPanel.add(trueLabel);

		JButton backTestButton = new JButton("Geri Dön");
		backTestButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.switchPanel(layeredPane, chosePanel);
			}
		});
		backTestButton.setBounds(282, 379, 132, 39);
		resultPanel.add(backTestButton);

		JLabel emptyLabel = new JLabel("Boş:");
		emptyLabel.setForeground(new Color(0, 0, 0));
		emptyLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emptyLabel.setBounds(256, 265, 97, 28);
		resultPanel.add(emptyLabel);

		JLabel falseLabel = new JLabel("Yanliş:");
		falseLabel.setForeground(new Color(0, 0, 0));
		falseLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		falseLabel.setBounds(256, 311, 97, 28);
		resultPanel.add(falseLabel);

		trueCount = new JLabel("D");
		trueCount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		trueCount.setHorizontalAlignment(SwingConstants.CENTER);
		trueCount.setBounds(400, 217, 28, 28);
		resultPanel.add(trueCount);

		emptyCount = new JLabel("D");
		emptyCount.setHorizontalAlignment(SwingConstants.CENTER);
		emptyCount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		emptyCount.setBounds(400, 265, 28, 28);
		resultPanel.add(emptyCount);

		falseCount = new JLabel("D");
		falseCount.setHorizontalAlignment(SwingConstants.CENTER);
		falseCount.setFont(new Font("Tahoma", Font.PLAIN, 16));
		falseCount.setBounds(400, 311, 28, 28);
		resultPanel.add(falseCount);

		JLabel pointLabel = new JLabel("Puan:");
		pointLabel.setForeground(Color.BLACK);
		pointLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		pointLabel.setBounds(256, 160, 97, 28);
		resultPanel.add(pointLabel);

		lblNewLabel_3_2 = new JLabel("D");
		lblNewLabel_3_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_3_2.setBounds(400, 160, 28, 28);

		resultPanel.add(lblNewLabel_3_2);

		// resultPanel.setVisible(false);

		// ***************************************************************************************
		testPanel = new JPanel();
		testPanel.setBounds(0, 0, 728, 551);
		layeredPane.add(testPanel);
		testPanel.setLayout(null);

		JLabel testLabel;
		testLabel = new JLabel("Test");
		testLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		testLabel.setBounds(343, 32, 133, 20);
		testPanel.add(testLabel);

		JButton leaveButton3;
		leaveButton3 = new JButton("Quizi Terket");
		leaveButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				user.switchPanel(layeredPane, chosePanel);
			}
		});
		leaveButton3.setBackground(new Color(255, 69, 0));
		leaveButton3.setBounds(27, 475, 104, 33);
		testPanel.add(leaveButton3);

		JButton nextButton3;
		nextButton3 = new JButton("Sonraki");
		nextButton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (customer.isAnswerTrue(x, answer, testIx)) {
					puan += 10;
					dogru++;
				} else {
					yanlis++;
				}

				testIx++;

				try {
					questionLabel.setText(question.get(testIx));
					aRadio.setText(a.get(testIx));
					bRadio.setText(b.get(testIx));
					cRadio.setText(c.get(testIx));
					if (testIx == (question.size() - 1)) {
						nextButton3.setText("Testi Bitir");

					}
				} catch (Exception e2) {
					lblNewLabel_3_2.setText(String.valueOf(puan));
					topsoru = question.size();
					trueCount.setText(String.valueOf(dogru));
					// emptyCount.setText(String.valueOf(topsoru-(dogru+yanlis)));
					emptyLabel.setVisible(false);
					emptyCount.setVisible(false);

					falseCount.setText(String.valueOf(yanlis));

					user.switchPanel(layeredPane, resultPanel);
				}

			}
		});
		nextButton3.setBackground(Color.WHITE);
		nextButton3.setBounds(291, 367, 104, 33);
		testPanel.add(nextButton3);

		questionLabel = new JLabel(question.get(testIx));
		questionLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		questionLabel.setBounds(231, 136, 262, 33);
		testPanel.add(questionLabel);

		ButtonGroup buttonGroup = new ButtonGroup();

		aRadio = new JRadioButton(a.get(testIx));
		aRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = "a";
			}
		});
		aRadio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		aRadio.setBounds(259, 220, 217, 33);
		testPanel.add(aRadio);

		bRadio = new JRadioButton(b.get(testIx));
		bRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = "b";
			}
		});
		bRadio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bRadio.setBounds(259, 257, 217, 33);
		testPanel.add(bRadio);

		cRadio = new JRadioButton(c.get(testIx));
		cRadio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				x = "c";
			}
		});
		cRadio.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cRadio.setBounds(259, 291, 217, 33);
		testPanel.add(cRadio);

		JLabel questionLabel_1 = new JLabel();
		questionLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		questionLabel_1.setBounds(276, 73, 167, 33);
		testPanel.add(questionLabel_1);

		buttonGroup.add(aRadio);
		buttonGroup.add(bRadio);
		buttonGroup.add(cRadio);

		// **************************************************************************

		JPanel customerLoginPanel = new JPanel();

		customerLoginPanel.setBounds(0, 0, 728, 551);
		layeredPane.add(customerLoginPanel);
		customerLoginPanel.setLayout(null);
		userNameText = new JTextField();
		userNameText.setBounds(300, 194, 142, 23);
		customerLoginPanel.add(userNameText);
		userNameText.setColumns(10);

		JLabel passwordLabel1 = new JLabel("Şifre");
		passwordLabel1.setBounds(225, 230, 65, 20);
		customerLoginPanel.add(passwordLabel1);

		passwordText = new JPasswordField();
		passwordText.setBounds(300, 229, 142, 23);
		customerLoginPanel.add(passwordText);

		JButton girisButton1 = new JButton("Giriş Yap");
		girisButton1.setBounds(259, 277, 87, 30);
		girisButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String userName = userNameText.getText();
				String password = passwordText.getText();
				Admin.Boss boss= admin.new Boss();
				
				if (userName.equals(boss.bossName)&&password.equals(boss.bossPassword)) {
					
					customer.switchPanel(layeredPane, chosePanel);

					}else {
						customer.login(customerHashMap, userName, password, layeredPane, chosePanel);

					}

			}
		});
		customerLoginPanel.add(girisButton1);

		kayitButton = new JButton("Kaydol");
		kayitButton.setBounds(400, 277, 87, 30);
		kayitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String userName = userNameText.getText();
				String password = passwordText.getText();
				customer.signIn(customerHashMap, userName, password, layeredPane, customerLoginPanel);
			}
		});
		customerLoginPanel.add(kayitButton);

		userNameLabel = new JLabel("Kullanıcı Adı");
		userNameLabel.setBounds(203, 195, 87, 20);
		customerLoginPanel.add(userNameLabel);

		linkLabel = new JLabel("Admin Girişi");
		linkLabel.setBounds(310, 329, 87, 14);
		linkLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		linkLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				user.switchPanel(layeredPane, adminLoginPanel);

			}
		});
		linkLabel.setForeground(Color.BLUE);
		customerLoginPanel.add(linkLabel);

		// ***********************************************************************************************

		adminLoginPanel.setBounds(0, 0, 728, 551);
		layeredPane.add(adminLoginPanel);
		adminLoginPanel.setLayout(null);

		adminUserNameText = new JTextField();
		adminUserNameText.setBounds(300, 194, 142, 23);
		adminLoginPanel.add(adminUserNameText);
		adminUserNameText.setColumns(10);

		JLabel adminPasswordLabel;
		adminPasswordLabel = new JLabel("Şifre");
		adminPasswordLabel.setBounds(225, 230, 65, 20);
		adminLoginPanel.add(adminPasswordLabel);

		adminPasswordText = new JPasswordField();
		adminPasswordText.setBounds(300, 229, 142, 23);
		adminLoginPanel.add(adminPasswordText);

		JButton girisButton;
		adminLoginButton = new JButton("Giriş Yap");
		adminLoginButton.setBounds(259, 277, 87, 30);
		adminLoginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adminName = adminUserNameText.getText();
				String adminPassword = adminPasswordText.getText();
				Admin.Boss boss= admin.new Boss();
				
if (adminName.equals(boss.bossName)&&adminPassword.equals(boss.bossPassword)) {
					
	dispose();

	adminChoseFrame.setPreferredSize(frame.getMinimumSize());
	adminChoseFrame.pack();
	adminChoseFrame.setVisible(true);

					}else {
						admin.login(adminHashMap, adminName, adminPassword, adminChoseFrame, frame);
					}
				
				

			}
		});
		adminLoginPanel.add(adminLoginButton);

		adminSignInButton = new JButton("Kaydol");
		adminSignInButton.setBounds(400, 277, 87, 30);
		adminSignInButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String adminName = adminUserNameText.getText();
				String adminPassword = adminPasswordText.getText();
				admin.signIn(adminHashMap, adminName, adminPassword, adminChoseFrame, frame);

			}
		});
		adminLoginPanel.add(adminSignInButton);

		adminUserNameLabel = new JLabel("Kullanıcı Adı");
		adminUserNameLabel.setBounds(203, 195, 87, 20);
		adminLoginPanel.add(adminUserNameLabel);

		adminLinkLabel = new JLabel("Kullanıcı Girişi");
		adminLinkLabel.setBounds(333, 329, 99, 14);
		adminLinkLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		adminLinkLabel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				user.switchPanel(layeredPane, customerLoginPanel);
			}
		});
		adminLinkLabel.setForeground(Color.BLUE);
		adminLoginPanel.add(adminLinkLabel);

		lblNewLabel = new JLabel("ADMİN GİRİŞ");
		lblNewLabel.setForeground(Color.RED);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(304, 119, 183, 30);
		adminLoginPanel.add(lblNewLabel);

		// *********************************************************************************************
		chosePanel = new JPanel();
		chosePanel.setBounds(0, 0, 728, 551);
		layeredPane.add(chosePanel);
		chosePanel.setLayout(null);

		JButton wordButton = new JButton("Word Quiz");
		wordButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				wordIx = 0;
				puan = 0;
				dogru = 0;
				yanlis = 0;
				topsoru = 0;
				nextButton.setText("Sıradaki");
				engLabel.setText(engWord.get(wordIx));
				user.switchPanel(layeredPane, wordPanel);

			}
		});
		wordButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		wordButton.setBounds(40, 161, 130, 130);
		chosePanel.add(wordButton);

		JButton visualButton = new JButton("Visual Quiz");
		visualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan = 0;
				dogru = 0;
				yanlis = 0;
				topsoru = 0;
				picIx = 0;
				nextButton2.setText("Sonraki");
				pictureLabel.setIcon(new ImageIcon(pictureLinkedList.get(picIx)));

				user.switchPanel(layeredPane, visualPanel);
			}
		});
		visualButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		visualButton.setBounds(291, 161, 130, 130);
		chosePanel.add(visualButton);

		JButton testButton = new JButton("Test");
		testButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan = 0;
				dogru = 0;
				yanlis = 0;
				topsoru = 0;

				testIx = 0;
				nextButton3.setText("Sonraki");
				questionLabel.setText(question.get(testIx));
				aRadio.setText(a.get(testIx));
				bRadio.setText(b.get(testIx));
				cRadio.setText(c.get(testIx));

				user.switchPanel(layeredPane, testPanel);
			}
		});
		testButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		testButton.setBounds(558, 161, 130, 130);
		chosePanel.add(testButton);

		JButton logOutButton = new JButton("Çıkış Yap");
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				puan = 0;
				wordIx = 0;
				testIx = 0;
				nextButton.setText("Sıradaki");
				engLabel.setText(engWord.get(wordIx));
				user.switchPanel(layeredPane, customerLoginPanel);

			}
		});
		logOutButton.setBackground(new Color(255, 0, 0));
		logOutButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		logOutButton.setBounds(312, 474, 109, 39);
		chosePanel.add(logOutButton);

		// ekranları temizlemek için
		user.switchPanel(layeredPane, customerLoginPanel);

	}
}
