package week2.day3;

public class MethodOverridingOne extends MethodOverriding{

	public void takeSnap(String takesnapmessage) {
		System.out.println(takesnapmessage);
		
	}
	
	public static void main(String[] args) {
		MethodOverridingOne m= new MethodOverridingOne();
		m.takeSnap("snap from sub class");
	}

}
