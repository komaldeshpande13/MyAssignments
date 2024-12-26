package week2.day3;

public class MethodOverriding {
	
	public void takeSnap(String takesnapmessage) {
		System.out.println(takesnapmessage);
		
	}
	
	public void reportStep(String message, String status) {
		System.out.println(message + status);
		
	}
	public static void main(String[] args) {
		MethodOverriding mo= new MethodOverriding();
		mo.takeSnap("snap done");
	}

}
