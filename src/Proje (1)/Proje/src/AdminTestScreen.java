/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */


 import java.util.LinkedList;
 import javax.swing.JFrame;
 import javax.swing.JOptionPane;
 import javax.swing.table.DefaultTableModel;
 /**
  *
  * @author mhasa
  */
 public class AdminTestScreen extends javax.swing.JFrame {
     DefaultTableModel tblModel;
     LinkedList<String> soru = new LinkedList();
     LinkedList<String> aSeceneki = new LinkedList();
     LinkedList<String> bSeceneki = new LinkedList();
     LinkedList<String> cSeceneki = new LinkedList();
     LinkedList<String> cevap = new LinkedList();
    Test test=new Test();
    //DefaultTableModel model;
     int sayac=0;
     
     public AdminTestScreen() {
        initComponents(); 
        tblModel=(DefaultTableModel) jTable1.getModel();
        
        String veri1[]={"1.She works ---- Saturday.","at","on","in"};
        String veri2[]={"2.I stay at home ---- the morning.","in","on","at"};
        String veri3[]={"3.He ---- born in 1963 in America","is","were","was"};
        String veri4[]={"4.How do you get to work? ----.","By car","In car","By the car"};
        String veri5[]={"5.Do you like classical music? ----.","Yes, I does","Yes, I do","Yes, I like"};

        
        tblModel.addRow(veri1);
        tblModel.addRow(veri2);
        tblModel.addRow(veri3);
        tblModel.addRow(veri4);
        tblModel.addRow(veri5);
        tblModel.removeRow(0);
        
        soru.add("1.She works ---- Saturday."); 
        soru.add("2.I stay at home ---- the morning.");
        soru.add("3.He ---- born in 1963 in America");
        soru.add("4.How do you get to work? ----.");
        soru.add("5.Do you like classical music? ----.");
        
        aSeceneki.add("at"); aSeceneki.add("in"); aSeceneki.add("is");aSeceneki.add("By car");aSeceneki.add("Yes, I does");
        bSeceneki.add("on"); bSeceneki.add("on"); bSeceneki.add("were");bSeceneki.add("In car");bSeceneki.add("Yes, I do");
        cSeceneki.add("in"); cSeceneki.add("at"); cSeceneki.add("was");cSeceneki.add("By the car");cSeceneki.add("Yes, I like");
        cevap.add("b"); cevap.add("a"); cevap.add("c");cevap.add("c");cevap.add("c");
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
         jScrollPane1 = new javax.swing.JScrollPane();
         jTable1 = new javax.swing.JTable();
         jLabel2 = new javax.swing.JLabel();
         jLabel3 = new javax.swing.JLabel();
         jLabel4 = new javax.swing.JLabel();
         jLabel5 = new javax.swing.JLabel();
         kelime = new javax.swing.JTextField();
         SecenekA = new javax.swing.JTextField();
         SecenekB = new javax.swing.JTextField();
         SecenekC = new javax.swing.JTextField();
         addWord = new javax.swing.JButton();
         deleteWord = new javax.swing.JButton();
         updateWord = new javax.swing.JButton();
         kelimeYazdır = new javax.swing.JButton();
         jdeleteField = new javax.swing.JTextField();
         cevapField = new javax.swing.JTextField();
         jLabel6 = new javax.swing.JLabel();
         testGeributton = new javax.swing.JButton();
 
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
 
         jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
         jLabel1.setForeground(new java.awt.Color(0, 0, 255));
         jLabel1.setText("Test Yönetimi");
 
         jTable1.setModel(new javax.swing.table.DefaultTableModel(
             new Object [][] {
                 {null, null, null, null}
             },
             new String [] {
                 "Soru", "Secenek A", "Secenek B", "Secenek C"
             }
         ) {
             Class[] types = new Class [] {
                 java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
             };
 
             public Class getColumnClass(int columnIndex) {
                 return types [columnIndex];
             }
         });
         jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 jTable1MouseClicked(evt);
             }
         });
         jScrollPane1.setViewportView(jTable1);
 
         jLabel2.setText("Soru:");
 
         jLabel3.setText("Secenek A:");
 
         jLabel4.setText("Secenek B");
 
         jLabel5.setText("Secenek C:");
 
         kelime.setText("\n");
         kelime.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 kelimeActionPerformed(evt);
             }
         });
 
         SecenekA.setText(" ");
         SecenekA.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 SecenekAActionPerformed(evt);
             }
         });
 
         SecenekC.setText("\n");
 
         addWord.setText("Ekle");
         addWord.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 addWordActionPerformed(evt);
             }
         });
 
         deleteWord.setText("Sil");
         deleteWord.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 deleteWordActionPerformed(evt);
             }
         });
 
         updateWord.setText("Güncelle");
         updateWord.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 updateWordActionPerformed(evt);
             }
         });
 
         kelimeYazdır.setText("Yazdır");
         kelimeYazdır.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 kelimeYazdırActionPerformed(evt);
             }
         });
 
         jdeleteField.setForeground(new java.awt.Color(153, 153, 153));
         jdeleteField.setText("Silinecek sorunun satırını girin");
         jdeleteField.addMouseListener(new java.awt.event.MouseAdapter() {
             public void mouseClicked(java.awt.event.MouseEvent evt) {
                 jdeleteFieldMouseClicked(evt);
             }
         });
         jdeleteField.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                 jdeleteFieldActionPerformed(evt);
             }
         });
 
         cevapField.setText("\n");
 
         jLabel6.setText("Cevap:");
 
         testGeributton.setBackground(new java.awt.Color(255, 0, 51));
         testGeributton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
         testGeributton.setForeground(new java.awt.Color(255, 255, 255));
         testGeributton.setText("Geri ");
         testGeributton.setActionCommand("Geri\n");
         testGeributton.addActionListener(new java.awt.event.ActionListener() {
             public void actionPerformed(java.awt.event.ActionEvent evt) {
                JFrame adminChoseFrame= new AdminChoseScreen();
                dispose();

					adminChoseFrame.setMinimumSize(getMinimumSize());
					adminChoseFrame.pack();
					adminChoseFrame.setVisible(true);
                 testGeributtonActionPerformed(evt);

                 
             }
         });
 
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
         getContentPane().setLayout(layout);
         layout.setHorizontalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                             .addGroup(layout.createSequentialGroup()
                                 .addContainerGap()
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                         .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                         .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                     .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                         .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                         .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addComponent(SecenekB, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                     .addComponent(SecenekA, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                     .addComponent(kelime, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                     .addComponent(SecenekC, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                             .addGroup(layout.createSequentialGroup()
                                 .addGap(43, 43, 43)
                                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                     .addComponent(deleteWord)
                                     .addGroup(layout.createSequentialGroup()
                                         .addComponent(addWord)
                                         .addGap(18, 18, 18)
                                         .addComponent(updateWord)
                                         .addGap(18, 18, 18)
                                         .addComponent(kelimeYazdır))
                                     .addComponent(jdeleteField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                             .addGroup(layout.createSequentialGroup()
                                 .addContainerGap()
                                 .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                 .addComponent(cevapField, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                     .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                         .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGap(148, 148, 148)
                         .addComponent(testGeributton)))
                 .addContainerGap())
         );
         layout.setVerticalGroup(
             layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
             .addGroup(layout.createSequentialGroup()
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                     .addGroup(layout.createSequentialGroup()
                         .addContainerGap()
                         .addComponent(testGeributton)))
                 .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                 .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                     .addGroup(layout.createSequentialGroup()
                         .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                         .addContainerGap())
                     .addGroup(layout.createSequentialGroup()
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(kelime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(SecenekA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(SecenekB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(SecenekC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                             .addComponent(cevapField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                         .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                             .addComponent(addWord)
                             .addComponent(updateWord)
                             .addComponent(kelimeYazdır))
                         .addGap(18, 18, 18)
                         .addComponent(jdeleteField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                         .addGap(18, 18, 18)
                         .addComponent(deleteWord)
                         .addGap(32, 32, 32))))
         );
 
         pack();
     }// </editor-fold>                        
 
     private void kelimeActionPerformed(java.awt.event.ActionEvent evt) {                                       
         // TODO add your handling code here:
     }                                      
 
     private void SecenekAActionPerformed(java.awt.event.ActionEvent evt) {                                         
         // TODO add your handling code here:
     }                                        
 
     private void addWordActionPerformed(java.awt.event.ActionEvent evt) {    
        String getKelime=kelime.getText();
        String getA=SecenekA.getText();
        String getB=SecenekB.getText();
        String getC=SecenekC.getText();
        String getCevap=cevapField.getText();
        javax.swing.JTextField setSoru=new javax.swing.JTextField();
        javax.swing.JTextField setA=new javax.swing.JTextField();
        javax.swing.JTextField setB=new javax.swing.JTextField();
        javax.swing.JTextField setC=new javax.swing.JTextField();
        javax.swing.JTextField setCevap=new javax.swing.JTextField();
        
        test.add(getKelime,getA,getB,getC,getCevap,tblModel,soru,aSeceneki,bSeceneki,cSeceneki,cevap,setSoru,setA,setB,setC,setCevap);
     }                                       
 
     private void deleteWordActionPerformed(java.awt.event.ActionEvent evt) {                                           
         // TODO add your handling code here:
         DefaultTableModel tblmodel=(DefaultTableModel) jTable1.getModel();
        String satir=jdeleteField.getText();
        int row=Integer.valueOf(satir)-1;
        javax.swing.JTextField jDeletField=new javax.swing.JTextField();;

        test.delete(satir,row,tblmodel,soru,aSeceneki,bSeceneki,cSeceneki,cevap,jdeleteField);
     }                                          
     
     private void updateWordActionPerformed(java.awt.event.ActionEvent evt) {                                           
         // TODO add your handling code here:
         DefaultTableModel tblmodel=(DefaultTableModel) jTable1.getModel();
         String sozcuk=kelime.getText();
         String oncul1=SecenekA.getText();
         String oncul2=SecenekB.getText();
         String oncul3=SecenekC.getText();
         String yanit=cevapField.getText();
         int satir=jTable1.getSelectedRow();
         int satirCount=jTable1.getSelectedRowCount();

         test.update(tblModel,satir,satirCount,sozcuk,oncul1,oncul2,oncul3,soru,cevap,aSeceneki,bSeceneki,cSeceneki,yanit);
                                                  
 }
     private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
     DefaultTableModel tblModel=(DefaultTableModel) jTable1.getModel();
     
     String tblKelime=tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
     String tblSecenekA=tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
     String tblSecenekB=tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
     String tblSecenekC=tblModel.getValueAt(jTable1.getSelectedRow(),3).toString();
     String tblCevap=cevap.get(jTable1.getSelectedRow()-1);
     
     kelime.setText(tblKelime);
     SecenekA.setText(tblSecenekA);
     SecenekB.setText(tblSecenekB);
     SecenekC.setText(tblSecenekC);
     cevapField.setText(tblCevap);
     }                                    
 
     private void kelimeYazdırActionPerformed(java.awt.event.ActionEvent evt) {                                             
        test.printList(soru,cevap,aSeceneki,bSeceneki,cSeceneki);
     }                                            
 
     private void jdeleteFieldActionPerformed(java.awt.event.ActionEvent evt) {                                             
         // TODO add your handling code here:
        
     }                                            
 
     private void jdeleteFieldMouseClicked(java.awt.event.MouseEvent evt) {                                          
         // TODO add your handling code here:
         jdeleteField.setText("");
     }                                         
 
     private void testGeributtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
         // TODO add your handling code here:
     }                                              
      
     public static void main(String args[]) {
         /* Set the Nimbus look and feel */
         //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
         /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
          * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
          */
         try {
             for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                 if ("Nimbus".equals(info.getName())) {
                     javax.swing.UIManager.setLookAndFeel(info.getClassName());
                     break;
                 }
             }
         } catch (ClassNotFoundException ex) {
             java.util.logging.Logger.getLogger(AdminTestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (InstantiationException ex) {
             java.util.logging.Logger.getLogger(AdminTestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (IllegalAccessException ex) {
             java.util.logging.Logger.getLogger(AdminTestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         } catch (javax.swing.UnsupportedLookAndFeelException ex) {
             java.util.logging.Logger.getLogger(AdminTestScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
         }
         //</editor-fold>
         
         /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
             public void run() {
                 new AdminTestScreen().setVisible(true);
             }
         });
     }
 
     // Variables declaration - do not modify                     
     private javax.swing.JTextField SecenekA;
     private javax.swing.JTextField SecenekB;
     private javax.swing.JTextField SecenekC;
     private javax.swing.JButton addWord;
     private javax.swing.JTextField cevapField;
     private javax.swing.JButton deleteWord;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JLabel jLabel4;
     private javax.swing.JLabel jLabel5;
     private javax.swing.JLabel jLabel6;
     private javax.swing.JScrollPane jScrollPane1;
     private javax.swing.JTable jTable1;
     private javax.swing.JTextField jdeleteField;
     private javax.swing.JTextField kelime;
     private javax.swing.JButton kelimeYazdır;
     private javax.swing.JButton testGeributton;
     private javax.swing.JButton updateWord;
     // End of variables declaration                   
 }
 
