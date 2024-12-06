import java.util.HashMap;

import javax.swing.JFrame;

public class Admin extends User {
	// bitti

	HashMap<String, String> adminHashMap;
	String adminName;
	String adminPassword;
	JFrame targetFrame;
	TestFrame frame;

	public Admin(HashMap<String, String> adminHashMap, String adminName, String adminPassword, JFrame targetFrame,
			TestFrame frame) {
		super();
		this.adminHashMap = adminHashMap;
		this.adminName = adminName;
		this.adminPassword = adminPassword;
		this.targetFrame = targetFrame;
		this.frame = frame;
	}

	public Admin() {
		super();
	}

	public void login(HashMap<String, String> adminHashMap, String adminName, String adminPassword, JFrame targetFrame,
			TestFrame frame) {
		if (isLoginTrue(adminHashMap, adminName, adminPassword)) {
			frame.dispose();

			targetFrame.setPreferredSize(frame.getMinimumSize());
			targetFrame.pack();
			targetFrame.setVisible(true);
		}
	}

	public void signIn(HashMap<String, String> adminHashMap, String adminName, String adminPassword, JFrame targetFrame,
			TestFrame frame) {
		if (isSignInTrue(adminHashMap, adminName, adminPassword)) {

			frame.dispose();

			targetFrame.setPreferredSize(frame.getMinimumSize());
			targetFrame.pack();
			targetFrame.setVisible(true);

		}

	}

	public class Boss {
		final String bossName;
		final String bossPassword;

		public Boss() {
			bossName = "şeyhmus";
			bossPassword = "şeyhmus";

		}
	}
}
