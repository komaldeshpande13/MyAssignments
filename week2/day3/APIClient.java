package week2.day3;

public class APIClient {

	public void sendRequest(String endpoint) {
	System.out.println(endpoint);	
	}
	
	public void sendRequest(String endpoint ,String requestBody,boolean requestStatus) {
	System.out.println(endpoint + "\n" + requestBody + "\n" + requestStatus);	
	}
	
	
	
	public static void main(String[] args) {
		APIClient a = new APIClient();
		a.sendRequest("endpoint one");
		a.sendRequest("endpoint two", "request body", true);

	}

}
