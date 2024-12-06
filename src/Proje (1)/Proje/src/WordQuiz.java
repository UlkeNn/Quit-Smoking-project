import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class WordQuiz implements IQuiz {
	public String word;
	public String mean;
	public int satir;
	public int satirCount;
	public DefaultTableModel tblmodel;

	
	public WordQuiz(String word, String mean, int satir, int satirCount, DefaultTableModel tblmodel) {
		super();
		this.word = word;
		this.mean = mean;
		this.satir = satir;
		this.satirCount = satirCount;
		this.tblmodel = tblmodel;
	}
	
	

	public WordQuiz() {
		super();
	}



	public void add(String word,String mean,DefaultTableModel tblModel,LinkedList<String> list1,LinkedList<String> list2) {
		if(word.equals("")||mean.equals("")){
			   JOptionPane.showMessageDialog(null,"Lutfen tum verileri giriniz!!!","Uyari",JOptionPane.WARNING_MESSAGE);
		   }
		   else{
			   String veri2[]={word,mean};
			   tblModel.addRow(veri2);      JOptionPane.showMessageDialog(null,"Ekleme islemi basarili!!!");
			   //jTable1.insertRow(jTable1.getRowCount(),new Object[]{kelime.getText(),SecenekA.getText(),SecenekB.getText(),SecenekC.getText()});

			   list1.add(word);
			   list2.add(mean);
			   //words1.kelimeYazdir(words1);
		   }
   }
   
   public void update(String word,String mean, DefaultTableModel tblModel,int satir,int satirCount, LinkedList<String> list1, LinkedList<String> list2) {
	   if(satirCount==1){
		 tblModel.setValueAt(word, satir, 0);
		 tblModel.setValueAt(mean, satir, 1);

		 list1.set(satir, word);
		 list2.set(satir, mean);
		 System.out.println("Güncelleme işlemi başarılı");

		 JOptionPane.showMessageDialog(null,"Güncelleme işlemi başarılı");
	 }
	 else{
		 if(satirCount==0) JOptionPane.showMessageDialog(null, "Eleman Seçilmedi!!!","",JOptionPane.WARNING_MESSAGE);
		 else JOptionPane.showMessageDialog(null, "Lütfen sadece 1 eleman seçin.","",JOptionPane.WARNING_MESSAGE);
 }                                            
   }
	   
   public void delete(String satir, DefaultTableModel tblmodel, LinkedList<String> list1, LinkedList<String> list2, JTextField jdeleteKelime){
			   int row = Integer.valueOf(satir) - 1;
			   tblmodel.removeRow(row);
			   // soru.remove(jTable1.getSelectedRow());
			   list1.remove(row);
			   list2.remove(row);
   }
   
   public void printList(LinkedList<String> list1, LinkedList<String> list2){
	   System.out.print("Kelimeler: ");
	   for (Object i : list1)
	   System.out.print(i + " ");
	   System.out.println();
	   System.out.print("Anlamlari: ");
	   for (Object i : list2)
	   System.out.print(i + " ");
	   System.out.println();
   }

	public void add(DefaultTableModel tblModel,LinkedList<String> list1){
		if(this.word.equals("")||this.mean.equals("")){
			JOptionPane.showMessageDialog(null,"Lutfen tum verileri giriniz!!!","Uyari",JOptionPane.WARNING_MESSAGE);
		}
		else{
			String veri2[]={word,mean};
			tblModel.addRow(veri2);      JOptionPane.showMessageDialog(null,"Ekleme islemi basarili!!!");
			//jTable1.insertRow(jTable1.getRowCount(),new Object[]{kelime.getText(),SecenekA.getText(),SecenekB.getText(),SecenekC.getText()});

			list1.add(word);
		}
	}

	public void update(DefaultTableModel tblModel, LinkedList<String> list1) {
		if(satirCount==1){
			tblModel.setValueAt(word, satir, 0);
			tblModel.setValueAt(mean, satir, 1);
			list1.set(satir, word);
			System.out.println("Güncelleme işlemi başarılı");
			JOptionPane.showMessageDialog(null,"Güncelleme işlemi başarılı");
		}
		else{
			if(satirCount==0) JOptionPane.showMessageDialog(null, "Eleman Seçilmedi!!!","",JOptionPane.WARNING_MESSAGE);
			else JOptionPane.showMessageDialog(null, "Lütfen sadece 1 eleman seçin.","",JOptionPane.WARNING_MESSAGE);
		} 
	}

	public void delete(DefaultTableModel tblModel, LinkedList<String> list1) {
		int row = Integer.valueOf(satir) - 1;
			   tblmodel.removeRow(row);
			   // soru.remove(jTable1.getSelectedRow());
			   list1.remove(row);
	}

	public void printList(DefaultTableModel tblModel, LinkedList<String> list1) {
		System.out.print("Kelimeler: ");
	   for (Object i : list1)
	   System.out.print(i + " ");
	   System.out.println();
	}
}
