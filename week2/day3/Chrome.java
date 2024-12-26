package week2.day3;


public class Chrome extends Browser{

	public void openIncognito() {
		System.out.println("Chrome open in incognito mode");
	}
	
	public void clearCache() {
		System.out.println("Chrome cache is cleared");
	}
	public static void main(String[] args) {
		
		Chrome c = new Chrome();
		String ch= c.openURL("Chrome is the browser name ");
		System.out.println(ch);
		c.openIncognito();
		c.clearCache();
	    c.closeBrowser();
	    c.navigateBack();

	}

}
