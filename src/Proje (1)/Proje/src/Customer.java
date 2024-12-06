import java.util.HashMap;
import java.util.LinkedList;

import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Customer extends User {
	HashMap<String, String> customerHashMap;
	String userName;
	String password;
	JLayeredPane layeredPane;
	JPanel chosePanel;

	public Customer(HashMap<String, String> userHashMap, String userName, String password,
			HashMap<String, String> customerHashMap, String userName2, String password2, JLayeredPane layeredPane,
			JPanel chosePanel) {
		super(userHashMap, userName, password);
		this.customerHashMap = customerHashMap;
		userName = userName2;
		password = password2;
		this.layeredPane = layeredPane;
		this.chosePanel = chosePanel;

	}

	public Customer() {
		super();
	}

	public void login(HashMap<String, String> customerHashMap, String userName, String password,
			JLayeredPane layeredPane, JPanel chosePanel) {
		if (isLoginTrue(customerHashMap, userName, password)) {
			switchPanel(layeredPane, chosePanel);
		}
	}

	public void signIn(HashMap<String, String> customerHashMap, String userName, String password,
			JLayeredPane layeredPane, JPanel chosePanel) {
		if (isSignInTrue(customerHashMap, userName, password)) {
			switchPanel(layeredPane, chosePanel);
		}

	}

	public boolean isAnswerTrue(String answer, LinkedList<String> correctAns, int ix) {

		if (correctAns.get(ix).equalsIgnoreCase(answer)) {

			return true;

		} else {
			return false;
		}
	}
}
