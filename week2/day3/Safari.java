package week2.day3;

public class Safari extends Browser{

	public void readerMode() {
		System.out.println("Safari is in Read mode.");
	}
	
	public void fullScreenMode() {
		System.out.println("Safari is in Full Screen Mode");
	}
	public static void main(String[] args) {
		Safari s = new Safari();
		String saf= s.openURL("Safari");
		System.out.println(saf);
		s.readerMode();
		s.fullScreenMode();
		s.closeBrowser();
		s.navigateBack();
	}

}
