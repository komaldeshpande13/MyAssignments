package week2.day3;

public class LoginPage extends BasePage{

	public void performCommonTasks() {
		System.out.println("performance common task for sub class");
	}
	
	public static void main(String[] args) {
		LoginPage p= new LoginPage();
		p.performCommonTasks();
	}

}
