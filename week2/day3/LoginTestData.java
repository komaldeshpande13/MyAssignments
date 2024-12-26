package week2.day3;

public class LoginTestData extends TestData{
       
	public void enterUsername() {
		System.out.println("username is :komal");
	}
	
	public void enterPassword() {
		System.out.println("password is password");
		
	}
	public static void main(String[] args) {
	LoginTestData l= new LoginTestData();
	l.enterUsername();
	l.enterPassword();
	l.enterCredentials();
	l.navigateToHomePage();

	}

}
