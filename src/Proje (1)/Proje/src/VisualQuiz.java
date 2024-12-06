import java.awt.Container;
import java.util.LinkedList;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.JTextComponent;

public class VisualQuiz implements IQuiz {
	private JTextComponent imgAd;
	private JTextComponent imgAdres;
	private JTextComponent imgCevap;
	private int satirCount;
	private int satir;
	private String satirControl;
	private Object ad;
	private String adress;
	private Object cevvap;
	private DefaultTableModel tblmodel;

	public VisualQuiz(JTextComponent imgAd, JTextComponent imgAdres, JTextComponent imgCevap, int satirCount, int satir,
			String satirControl, Object ad, String adress, Object cevvap, DefaultTableModel tblmodel) {
		super();
		this.imgAd = imgAd;
		this.imgAdres = imgAdres;
		this.imgCevap = imgCevap;
		this.satirCount = satirCount;
		this.satir = satir;
		this.satirControl = satirControl;
		this.ad = ad;
		this.adress = adress;
		this.cevvap = cevvap;
		this.tblmodel = tblmodel;
	}

	public VisualQuiz() {
		super();
	}

	public void add(JTextComponent imgAd, JTextComponent imgAdres, JTextComponent imgCevap, DefaultTableModel tblModel,
			LinkedList<String> isim, LinkedList<String> adres, LinkedList<String> cevap) {
		if (imgAd.getText().equals("") || imgAdres.getText().equals("") || imgCevap.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Lutfen tum verileri giriniz!!!", "Uyari", JOptionPane.WARNING_MESSAGE);
		} else {
			String veri2[] = { imgAd.getText(), imgAdres.getText(), imgCevap.getText() };
			tblModel.addRow(veri2);
			JOptionPane.showMessageDialog(null, "Ekleme islemi basarili!!!");
			// jTable1.insertRow(jTable1.getRowCount(),new
			// Object[]{kelime.getText(),SecenekA.getText(),SecenekB.getText(),SecenekC.getText()});

			isim.add(imgAd.getText());
			adres.add(imgAdres.getText());
			cevap.add(imgCevap.getText());

			imgAd.setText("");
			imgAdres.setText("");
			imgCevap.setText("");
			// words1.kelimeYazdir(words1);

		}
	}

	public void update(int satirCount, DefaultTableModel tblModel, String ad, String adress, String cevvap, int satir,
			LinkedList<String> isim, LinkedList<String> adres, LinkedList<String> cevap) {
		if (satirCount == 1) {

			tblModel.setValueAt(ad, satir, 0);
			tblModel.setValueAt(adress, satir, 1);
			tblModel.setValueAt(cevvap, satir, 2);

			String guncellenecek = tblModel.getValueAt(satir, 0).toString();

			isim.set(satir, ad);
			adres.set(satir, adress);
			cevap.set(satir, cevvap);

			System.out.println("Güncelleme işlemi başarılı");

			JOptionPane.showMessageDialog(null, "Güncelleme işlemi başarılı");
		} else {
			if (satirCount == 0)
				JOptionPane.showMessageDialog(null, "Eleman Seçilmedi!!!", "", JOptionPane.WARNING_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Lütfen sadece 1 eleman seçin.", "", JOptionPane.WARNING_MESSAGE);
		}
	}

	public void delete(String satir, DefaultTableModel tblmodel, LinkedList<String> isim, LinkedList<String> adres,
			LinkedList<String> cevap, JTextComponent imgDeleteField) {
		if (satir != "") {

			try {
				int row = Integer.valueOf(satir) - 1;
				tblmodel.removeRow(row);
				// if(sayac==0) sayac++;
				// else {
				// soru.remove(jTable1.getSelectedRow());
				isim.remove(row);
				adres.remove(row);
				cevap.remove(row);
				imgDeleteField.setText("");
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Geçerli Değer Giriniz", "uyari", JOptionPane.WARNING_MESSAGE);
			}
		} else
			JOptionPane.showMessageDialog(null, "Değer girilmedi!!!");

	}

	public void printList(LinkedList<String> isim, LinkedList<String> adres, LinkedList<String> cevap) {
		System.out.print("İsimler: ");
		for (Object i : isim)
			System.out.print(i + " ");
		System.out.println();
		System.out.print("Adresler: ");
		for (Object i : adres)
			System.out.print(i + " ");
		System.out.println();
		System.out.print("Cevaplar: ");
		for (Object i : cevap)
			System.out.print(i + " ");
		System.out.println();
	}

	public void add(DefaultTableModel tblModel, LinkedList<String> list) {
		if (imgAd.getText().equals("") || imgAdres.getText().equals("") || imgCevap.getText().equals("")) {
			JOptionPane.showMessageDialog(null, "Lutfen tum verileri giriniz!!!", "Uyari", JOptionPane.WARNING_MESSAGE);
		} else {
			String veri2[] = { imgAd.getText(), imgAdres.getText(), imgCevap.getText() };
			tblModel.addRow(veri2);
			JOptionPane.showMessageDialog(null, "Ekleme islemi basarili!!!");
			// jTable1.insertRow(jTable1.getRowCount(),new
			// Object[]{kelime.getText(),SecenekA.getText(),SecenekB.getText(),SecenekC.getText()});

			list.add(imgAdres.getText());

			imgAd.setText("");
			imgAdres.setText("");
			imgCevap.setText("");
		}
	}

	public void update(DefaultTableModel tblModel, LinkedList<String> list) {
		if (satirCount == 1) {

			tblModel.setValueAt(ad, satir, 0);
			tblModel.setValueAt(adress, satir, 1);
			tblModel.setValueAt(cevvap, satir, 2);

			String guncellenecek = tblModel.getValueAt(satir, 0).toString();

			list.set(satir, adress);

			System.out.println("Güncelleme işlemi başarılı");

			JOptionPane.showMessageDialog(null, "Güncelleme işlemi başarılı");
		} else {
			if (satirCount == 0)
				JOptionPane.showMessageDialog(null, "Eleman Seçilmedi!!!", "", JOptionPane.WARNING_MESSAGE);
			else
				JOptionPane.showMessageDialog(null, "Lütfen sadece 1 eleman seçin.", "", JOptionPane.WARNING_MESSAGE);
		}
	}

	public void delete(DefaultTableModel tblModel, LinkedList<String> list) {
		if (satirControl != "") {
			try {
				int row = Integer.valueOf(satir) - 1;
				tblmodel.removeRow(row);
				list.remove(row);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Geçerli Değer Giriniz", "uyari", JOptionPane.WARNING_MESSAGE);
			}
		} else
			JOptionPane.showMessageDialog(null, "Değer girilmedi!!!");
	}

	public void printList(DefaultTableModel tblModel, LinkedList<String> list) {
		System.out.print("Adresler: ");
		for (Object i : list)
			System.out.print(i + " ");
		System.out.println();
	}

}
