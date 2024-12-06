

import java.util.LinkedList;

import javax.swing.table.DefaultTableModel;


public interface IQuiz {
	public void add(DefaultTableModel tblModel,LinkedList<String> list);
	public void update(DefaultTableModel tblModel,LinkedList<String> list);
	public void delete(DefaultTableModel tblModel,LinkedList<String> list);
	public void printList(DefaultTableModel tblModel,LinkedList<String> list);
}
