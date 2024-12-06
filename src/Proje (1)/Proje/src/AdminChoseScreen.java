import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;

public class AdminChoseScreen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AdminChoseScreen frame = new AdminChoseScreen();
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
	LinkedList<String> denemeLinkedList;
	LinkedList<String> cevapLinkedList;
	public AdminChoseScreen() {
		JFrame adminWordFrame= new AdminWordScreen();
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 744, 590);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnKelimeQuiz = new JButton("Kelime Quiz");
		btnKelimeQuiz.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();

				adminWordFrame.setMinimumSize(getMinimumSize());
				adminWordFrame.pack();
				adminWordFrame.setVisible(true);
			}
		});
		btnKelimeQuiz.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnKelimeQuiz.setBounds(53, 175, 130, 130);
		contentPane.add(btnKelimeQuiz);
		
		JButton visualButton = new JButton("Görsel Quiz");
		visualButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame adminVisual= new AdminVisualScreen();
				
				dispose();

				adminVisual.setMinimumSize(getMinimumSize());
				adminVisual.pack();
				adminVisual.setVisible(true);
			}
		});
		visualButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		visualButton.setBounds(286, 175, 130, 130);
		contentPane.add(visualButton);
		
		JButton testButton = new JButton("Test Quiz");
		testButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame adminTesFrame= new AdminTestScreen();
				dispose();

				adminTesFrame.setMinimumSize(getMinimumSize());
				adminTesFrame.pack();
				adminTesFrame.setVisible(true);
			}
		});
		testButton.setFont(new Font("Tahoma", Font.PLAIN, 17));
		testButton.setBounds(542, 175, 130, 130);
		contentPane.add(testButton);
		
		JButton logOutButton = new JButton("Çıkış Yap");
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFrame testFrame= new TestFrame();
				
				dispose();

				testFrame.setMinimumSize(getMinimumSize());
				testFrame.pack();
				testFrame.setVisible(true);
			}
		});
		logOutButton.setFont(new Font("Tahoma", Font.PLAIN, 13));
		logOutButton.setBackground(Color.RED);
		logOutButton.setBounds(307, 436, 109, 39);
		contentPane.add(logOutButton);
	}

}

