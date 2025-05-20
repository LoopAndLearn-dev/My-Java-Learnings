package multieg;

public class MsWord extends Thread {
	void typing() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Typing in progress...");
				Thread.sleep(4000);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void spellCheck() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Spell Check in progress...");
				Thread.sleep(4000);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	void autoSave() {
		try {
			for (int i = 1; i <= 5; i++) {
				System.out.println("Autosave in progress....");
				Thread.sleep(4000);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
public class MsWordApp {
	public static void main(String[] args) {
		MsWord m1 = new MsWord();
		MsWord m2 = new MsWord();
		MsWord m3 = new MsWord();
		m1.setName("Typing");
		m2.setName("spellCheck");
		m3.setName("autoSave");
		m1.start();
		m2.start();
		m3.start();
	}
}
