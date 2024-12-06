
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author mhasa
 */
public class AdminVisualScreen extends javax.swing.JFrame {
	DefaultTableModel tblModel;
	LinkedList<String> adres = new LinkedList();
	LinkedList<String> isim = new LinkedList();
	LinkedList<String> cevap = new LinkedList();
	
	VisualQuiz visualQuiz=new VisualQuiz();

	/**
	 * Creates new form visualManager
	 */
	public AdminVisualScreen() {
		initComponents();
		tblModel = (DefaultTableModel) jTable1.getModel();

		String veri1[] = { "araba", "C:\\Users\\Abdulkerim\\Desktop\\araba (1).jpg", "car" };
		String veri2[] = { "çilek", "C:\\Users\\Abdulkerim\\Desktop\\ilekjpg.jpg", "strawberry" };
		String veri3[] = { "muz", "C:\\Users\\Abdulkerim\\Desktop\\muz (1).jpg", "banana" };
		String veri4[] = { "gözlük", "C:\\Users\\Abdulkerim\\Desktop\\gözlük (1).jpg", "glasses" };
		String veri5[] = { "şişe", "C:\\Users\\Abdulkerim\\Desktop\\işe.jpg", "bottle" };


		tblModel.addRow(veri1);
		tblModel.addRow(veri2);
		tblModel.addRow(veri3);
		tblModel.addRow(veri4);
		tblModel.addRow(veri5);
		tblModel.removeRow(0);

		isim.add("araba");
		isim.add("çilek");
		isim.add("muz");
		isim.add("gözlük");
		isim.add("şişe");
		
		adres.add("C:\\Users\\Abdulkerim\\Desktop\\araba (1).jpg");
		adres.add("C:\\Users\\Abdulkerim\\Desktop\\ilekjpg.jpg");
		adres.add("C:\\Users\\Abdulkerim\\Desktop\\muz (1).jpg");
		adres.add("C:\\Users\\Abdulkerim\\Desktop\\gözlük (1).jpg");
		adres.add("C:\\Users\\Abdulkerim\\Desktop\\işe.jpg");

		cevap.add("car");
		cevap.add("strawberry");
		cevap.add("banana");
		cevap.add("glasses");
		cevap.add("bottle");
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		imgAd = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		imgAdres = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		imgCevap = new javax.swing.JTextField();
		addAdres = new javax.swing.JButton();
		updateAdres = new javax.swing.JButton();
		imgDeleteField = new javax.swing.JTextField();
		deleteAdres = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTable1 = new javax.swing.JTable();
		imgGeributton = new javax.swing.JButton();
		printAdres = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabel1.setBackground(new java.awt.Color(51, 51, 255));
		jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
		jLabel1.setForeground(new java.awt.Color(51, 51, 255));
		jLabel1.setText("Görsel Yönetimi");

		jLabel2.setText("İsim:");

		imgAd.setText("\n");
		imgAd.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				imgAdActionPerformed(evt);
			}
		});

		jLabel3.setText("Adres:");

		imgAdres.setText(" ");
		imgAdres.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				imgAdresActionPerformed(evt);
			}
		});

		jLabel4.setText("Cevap:");

		addAdres.setText("Ekle");
		addAdres.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				addAdresActionPerformed(evt);
			}
		});

		updateAdres.setText("Güncelle");
		updateAdres.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				updateAdresActionPerformed(evt);
			}
		});

		imgDeleteField.setForeground(new java.awt.Color(153, 153, 153));
		imgDeleteField.setText("Silinecek sorunun satırını girin");
		imgDeleteField.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				imgDeleteFieldMouseClicked(evt);
			}
		});
		imgDeleteField.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				imgDeleteFieldActionPerformed(evt);
			}
		});

		deleteAdres.setText("Sil");
		deleteAdres.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				deleteAdresActionPerformed(evt);
			}
		});

		jTable1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null } },
				new String[] { "İsim", "Adres", "Cevap" }) {
			Class[] types = new Class[] { java.lang.String.class, java.lang.String.class, java.lang.String.class };

			public Class getColumnClass(int columnIndex) {
				return types[columnIndex];
			}
		});
		jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				jTable1MouseClicked(evt);
			}
		});
		jScrollPane1.setViewportView(jTable1);

		imgGeributton.setBackground(new java.awt.Color(255, 0, 51));
		imgGeributton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
		imgGeributton.setForeground(new java.awt.Color(255, 255, 255));
		imgGeributton.setText("Geri ");
		imgGeributton.setActionCommand("Geri\n");
		imgGeributton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				JFrame adminChoseFrame = new AdminChoseScreen();
				dispose();

				adminChoseFrame.setMinimumSize(getMinimumSize());
				adminChoseFrame.pack();
				adminChoseFrame.setVisible(true);
				imgGeributtonActionPerformed(evt);
			}
		});

		printAdres.setText("Yazdır");
		printAdres.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				printAdresActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE).addComponent(jLabel1)
						.addGap(305, 305, 305))
				.addGroup(layout.createSequentialGroup().addGroup(layout.createParallelGroup(
						javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(layout.createSequentialGroup().addGap(19, 19, 19).addComponent(jLabel3)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(imgAdres, javax.swing.GroupLayout.PREFERRED_SIZE, 209,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(21, 21, 21).addComponent(jLabel2)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(imgAd, javax.swing.GroupLayout.PREFERRED_SIZE, 71,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGroup(layout.createSequentialGroup().addGap(17, 17, 17).addComponent(jLabel4)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(imgCevap, javax.swing.GroupLayout.PREFERRED_SIZE, 71,
												javax.swing.GroupLayout.PREFERRED_SIZE)))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42,
										Short.MAX_VALUE))
						.addGroup(layout.createSequentialGroup().addGap(0, 0, Short.MAX_VALUE).addComponent(printAdres)
								.addGap(10, 10, 10)))
						.addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap())
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
						.createSequentialGroup()
						.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										layout.createSequentialGroup().addGap(689, 689, 689)
												.addComponent(imgGeributton))
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
										.addGap(43, 43, 43)
										.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(deleteAdres)
												.addGroup(layout.createSequentialGroup().addComponent(addAdres)
														.addGap(18, 18, 18).addComponent(updateAdres))
												.addComponent(imgDeleteField, javax.swing.GroupLayout.PREFERRED_SIZE,
														194, javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap())));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(layout
				.createSequentialGroup().addContainerGap()
				.addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58,
						javax.swing.GroupLayout.PREFERRED_SIZE)
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup()
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
								.addContainerGap())
						.addGroup(layout.createSequentialGroup().addGap(3, 3, 3).addGroup(layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(imgAdres, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
										javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(imgAd, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(imgCevap, javax.swing.GroupLayout.PREFERRED_SIZE,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
												javax.swing.GroupLayout.PREFERRED_SIZE))
								.addGap(37, 37, 37).addComponent(printAdres)
								.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
				.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(layout.createSequentialGroup().addContainerGap().addComponent(imgGeributton)
								.addGap(173, 173, 173)
								.addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
										.addComponent(addAdres).addComponent(updateAdres))
								.addGap(18, 18, 18)
								.addComponent(imgDeleteField, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addGap(18, 18, 18).addComponent(deleteAdres).addContainerGap(54, Short.MAX_VALUE))));

		pack();
	}// </editor-fold>

	Admin admin = new Admin();

	private void imgAdActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void imgAdresActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void addAdresActionPerformed(java.awt.event.ActionEvent evt) {
		visualQuiz.add(imgAd, imgAdres, imgCevap, tblModel, isim, adres, cevap);

		// model.insertRow(model.getRowCount(),new
		// Object[]{kelime.getText(),SecenekA.getText(),SecenekB.getText(),SecenekC.getText()});
	}

	private void updateAdresActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
        	DefaultTableModel tblmodel=(DefaultTableModel) jTable1.getModel();
        	int satirCount=jTable1.getSelectedRowCount();
			int satir= jTable1.getSelectedRow();
			String ad=imgAd.getText();
            String adress=imgAdres.getText();
            String cevvap=imgCevap.getText();

			visualQuiz.update(satirCount, tblModel, ad, adress,cevvap,satir,isim, adres, cevap);
			                                          
    }

	private void imgDeleteFieldMouseClicked(java.awt.event.MouseEvent evt) {
		// TODO add your handling code here:
		imgDeleteField.setText("");
	}

	private void imgDeleteFieldActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:

	}

	private void deleteAdresActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		DefaultTableModel tblmodel = (DefaultTableModel) jTable1.getModel();

		String satir = imgDeleteField.getText();

		visualQuiz.delete(satir, tblmodel, isim, adres, cevap, imgDeleteField);
	}

	private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {
		DefaultTableModel tblModel = (DefaultTableModel) jTable1.getModel();

		String tblAd = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
		String tblAdres = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
		String tblCevap = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();

		imgAd.setText(tblAd);
		imgAdres.setText(tblAdres);
		imgCevap.setText(tblCevap);
	}

	private void imgGeributtonActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void printAdresActionPerformed(java.awt.event.ActionEvent evt) {
		visualQuiz.printList(isim, adres, cevap);
		
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(AdminVisualScreen.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(AdminVisualScreen.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(AdminVisualScreen.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(AdminVisualScreen.class.getName()).log(java.util.logging.Level.SEVERE,
					null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new AdminVisualScreen().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JButton addAdres;
	private javax.swing.JButton deleteAdres;
	private javax.swing.JTextField imgAd;
	private javax.swing.JTextField imgAdres;
	private javax.swing.JTextField imgCevap;
	private javax.swing.JTextField imgDeleteField;
	private javax.swing.JButton imgGeributton;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTable jTable1;
	private javax.swing.JButton printAdres;
	private javax.swing.JButton updateAdres;
	// End of variables declaration
}