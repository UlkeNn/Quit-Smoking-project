import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

public class Test implements IQuiz {
	private String getA;
	private String getB;
	private String getC;
	private String getKelime;
	private String sozcuk;
	private String oncul1;
	private String oncul2;
	private String oncul3;
	private String satirs;
	private int satirCount;
	private int satir;
	private DefaultTableModel tblmodel;
	private JTextComponent jdeleteField;
	
	

	public Test(String getA, String getB, String getC, String getKelime, String sozcuk, String oncul1, String oncul2,
			String oncul3, String satirs, int satirCount, int satir, DefaultTableModel tblmodel,
			JTextComponent jdeleteField, JTextField setSoru, JTextField setA, JTextField setB, JTextField setC,
			JTextField setCevap) {
		super();
		this.getA = getA;
		this.getB = getB;
		this.getC = getC;
		this.getKelime = getKelime;
		this.sozcuk = sozcuk;
		this.oncul1 = oncul1;
		this.oncul2 = oncul2;
		this.oncul3 = oncul3;
		this.satirs = satirs;
		this.satirCount = satirCount;
		this.satir = satir;
		this.tblmodel = tblmodel;
		this.jdeleteField = jdeleteField;
		this.setSoru = setSoru;
		this.setA = setA;
		this.setB = setB;
		this.setC = setC;
		this.setCevap = setCevap;
	}
	
	

	public Test() {
		super();
	}



	public void add(String getKelime,String getA,String getB,String getC,String getCevap, DefaultTableModel tblModel, LinkedList<String> soru,LinkedList<String> aSeceneki,LinkedList<String> bSeceneki,LinkedList<String> cSeceneki,LinkedList<String> cevap,javax.swing.JTextField setSoru,javax.swing.JTextField setA,javax.swing.JTextField setB,javax.swing.JTextField setC,javax.swing.JTextField setCevap){
		if(getKelime.equals("")||getA.equals("")||getB.equals("")||getC.equals("")){
			JOptionPane.showMessageDialog(null,"Lutfen tum verileri giriniz!!!","Uyari",JOptionPane.WARNING_MESSAGE);
			}
			else{
		   String veri2[]={getKelime,getA,getB,getC};
		   tblModel.addRow(veri2);      JOptionPane.showMessageDialog(null,"Ekleme islemi basarili!!!");
		   //jTable1.insertRow(jTable1.getRowCount(),new Object[]{kelime.getText(),SecenekA.getText(),SecenekB.getText(),SecenekC.getText()});
		  
		   soru.add(getKelime);
		   aSeceneki.add(getA);
		   bSeceneki.add(getB);
		   cSeceneki.add(getC);
		   cevap.add(getCevap);
		   
		   setSoru.setText(""); setA.setText(""); setB.setText(""); setC.setText(""); setCevap.setText("");
		   //words1.kelimeYazdir(words1);
			}
	}

	public void update(DefaultTableModel tblModel,int satir, int satirCount, String sozcuk,String oncul1,String oncul2,String oncul3,
	LinkedList<String> soru,LinkedList<String> cevap,LinkedList<String> aSeceneki,LinkedList<String> bSeceneki,LinkedList<String> cSeceneki,String yanit){
		if(satirCount==1){
			tblModel.setValueAt(sozcuk, satir, 0);
			tblModel.setValueAt(oncul1, satir, 1);
			tblModel.setValueAt(oncul2, satir, 2);
			tblModel.setValueAt(oncul3, satir, 3);
			
			String guncellenecek=tblModel.getValueAt(satir,0).toString();
			
			soru.set(satir, sozcuk);
			cevap.set(satir, yanit);
			aSeceneki.set(satir, oncul1);
			bSeceneki.set(satir, oncul2);
			cSeceneki.set(satir, oncul3);
			
			System.out.println("Güncelleme işlemi başarılı");
			
			JOptionPane.showMessageDialog(null,"Güncelleme işlemi başarılı");
			}
			else{
			if(satirCount==0) JOptionPane.showMessageDialog(null, "Eleman Seçilmedi!!!","",JOptionPane.WARNING_MESSAGE);
			else JOptionPane.showMessageDialog(null, "Lütfen sadece 1 eleman seçin.","",JOptionPane.WARNING_MESSAGE);
		} 
	}

	public void delete(String satir,int row,DefaultTableModel tblmodel,LinkedList<String> soru,LinkedList<String> aSeceneki,
			LinkedList<String> bSeceneki,LinkedList<String> cSeceneki,LinkedList<String> cevap,javax.swing.JTextField jdeleteField){
				if(satir!="") {
					try {
					tblmodel.removeRow(row);
				   // if(sayac==0) sayac++;
					//else {
					//soru.remove(jTable1.getSelectedRow());
					soru.remove(row);
					aSeceneki.remove(row);
					bSeceneki.remove(row);
					cSeceneki.remove(row);
					cevap.remove(row);
					jdeleteField.setText("");
					} catch (Exception e) {
						JOptionPane.showMessageDialog(null, "Geçerli Değer Giriniz","uyari",JOptionPane.WARNING_MESSAGE);
					}
				}            
				else JOptionPane.showMessageDialog(null,"Değer girilmedi!!!");
			}

	public void printList(LinkedList<String> soru,LinkedList<String> cevap,LinkedList<String> aSeceneki,LinkedList<String> bSeceneki,LinkedList<String> cSeceneki){
				System.out.print("Sorular: "); for(Object i:soru) System.out.print(i+" ");
		         System.out.println();
		         System.out.print("Cevaplar: "); for(Object i:cevap) System.out.print(i+" ");
		         System.out.println();
		         System.out.print("A Şıkları: "); for(Object i:aSeceneki) System.out.print(i+" ");
		         System.out.println();
		         System.out.print("B Şıkları: "); for(Object i:bSeceneki) System.out.print(i+" ");
		         System.out.println();
		         System.out.print("C Şıkları: "); for(Object i:cSeceneki) System.out.print(i+" ");
		         System.out.println();
			}

	public void add(DefaultTableModel tblModel, LinkedList<String> list) {
		if(getKelime.equals("")||getA.equals("")||getB.equals("")||getC.equals("")){
			JOptionPane.showMessageDialog(null,"Lutfen tum verileri giriniz!!!","Uyari",JOptionPane.WARNING_MESSAGE);
			}
			else{
		   String veri2[]={getKelime,getA,getB,getC};
		   tblModel.addRow(veri2);      JOptionPane.showMessageDialog(null,"Ekleme islemi basarili!!!");
		   //jTable1.insertRow(jTable1.getRowCount(),new Object[]{kelime.getText(),SecenekA.getText(),SecenekB.getText(),SecenekC.getText()});
		   list.add(getKelime);
		   
		   setSoru.setText(""); setA.setText(""); setB.setText(""); setC.setText(""); setCevap.setText("");
		   //words1.kelimeYazdir(words1);
			}
		
	}

	public void update(DefaultTableModel tblModel, LinkedList<String> list) {
		if(satirCount==1){
			tblModel.setValueAt(sozcuk, satir, 0);
			tblModel.setValueAt(oncul1, satir, 1);
			tblModel.setValueAt(oncul2, satir, 2);
			tblModel.setValueAt(oncul3, satir, 3);
			
			String guncellenecek=tblModel.getValueAt(satir,0).toString();
			
			list.set(satir, sozcuk);
			
			System.out.println("Güncelleme işlemi başarılı");
			
			JOptionPane.showMessageDialog(null,"Güncelleme işlemi başarılı");
			}
			else{
			if(satirCount==0) JOptionPane.showMessageDialog(null, "Eleman Seçilmedi!!!","",JOptionPane.WARNING_MESSAGE);
			else JOptionPane.showMessageDialog(null, "Lütfen sadece 1 eleman seçin.","",JOptionPane.WARNING_MESSAGE);
		} 
		
	}

	public void delete(DefaultTableModel tblModel, LinkedList<String> list) {
		if(satirs!="") {
			try {
			int row = Integer.valueOf(satir) - 1;
			tblmodel.removeRow(row);
		   // if(sayac==0) sayac++;
			//else {
			//soru.remove(jTable1.getSelectedRow());
			list.remove(row);
			jdeleteField.setText("");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Geçerli Değer Giriniz","uyari",JOptionPane.WARNING_MESSAGE);
			}
		}            
		else JOptionPane.showMessageDialog(null,"Değer girilmedi!!!");
		
	}

	public void printList(DefaultTableModel tblModel, LinkedList<String> list) {
		System.out.print("Sorular: "); for(Object i:list) System.out.print(i+" ");
		System.out.println();
	}

	javax.swing.JTextField setSoru=new javax.swing.JTextField();
	javax.swing.JTextField setA=new javax.swing.JTextField();
	javax.swing.JTextField setB=new javax.swing.JTextField();
	javax.swing.JTextField setC=new javax.swing.JTextField();
	javax.swing.JTextField setCevap=new javax.swing.JTextField();																		
}
