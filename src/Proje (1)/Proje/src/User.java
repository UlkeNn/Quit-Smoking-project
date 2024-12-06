import java.util.HashMap;

import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class User {

	// BİTTİ
	public HashMap<String, String> userHashMap;
	public String userName;
	public String password;

	public User(HashMap<String, String> userHashMap, String userName, String password) {
		super();
		this.userHashMap = userHashMap;
		this.userName = userName;
		this.password = password;
	}

	public User() {
		super();
	}

	public boolean isLoginTrue(HashMap<String, String> userHashMap, String userName, String password) {
		// giriş başarılı mı
		if (userName.isEmpty() || password.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Kullanıcı adı ve parola boş olamaz", "Uyarı",
					JOptionPane.WARNING_MESSAGE);
			return false;
		} else if (userHashMap.get(userName) != null && userHashMap.get(userName).equals(password)) {

			return true;

		} else {

			JOptionPane.showMessageDialog(null, "Böyle bir hesap bulunamadı", "Uyarı", JOptionPane.WARNING_MESSAGE);
			return false;

		}
	}

	public boolean isSignInTrue(HashMap<String, String> userHashMap, String userName, String password) {
		if (userName.isEmpty() || password.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Kullanıcı adı ve patrola boş olamaz", "Uyarı",
					JOptionPane.WARNING_MESSAGE);
			return false;
		} else if (userHashMap.containsKey(userName)) {
			JOptionPane.showMessageDialog(null, "Zaten böyle bir hesap var", "Uyarı", JOptionPane.WARNING_MESSAGE);
			return false;
		} else {

			userHashMap.put(userName, password);
			return true;

		}

	}

	public void switchPanel(JLayeredPane layeredPane, JPanel p) {

		layeredPane.removeAll();
		layeredPane.add(p);
		layeredPane.repaint();
		layeredPane.revalidate();
	}

}
