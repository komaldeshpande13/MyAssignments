package week2.day3;

public class Polymorphism {

	public void reportStep(String message, String status) {
		System.out.println(message + status);
		
	}
    public void	reportStep(String message, String status,String snap) {
    	System.out.println(message +"\n"+ status +"\n"+ snap);
    }
	
	public static void main(String[] args) {
		Polymorphism p= new Polymorphism();
	     p.reportStep("Hello", " Fine");
         p.reportStep("Good Morning"," I am good", " Snap Taken");
	}

}
