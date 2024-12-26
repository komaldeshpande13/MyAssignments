package week2.day3;

public class Edge extends Browser{

	public void takeSnap() {
		System.out.println("Edge snap shot taken");
	}
	public void clearCookies() {
		System.out.println("Edge cookies are cleared");
	}
	public static void main(String[] args) {
		Edge e = new Edge();
		String ed= e.openURL("Edge is the browser name ");
		System.out.println(ed);
		e.takeSnap();
		e.clearCookies();
	    e.closeBrowser();
	    e.navigateBack();
	}

}
