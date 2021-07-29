package API;

import io.restassured.response.Response;

public interface RestAssuredInterface {
	
	public Response doPost(String url, String payload, String token);
	public Response doGet(String url);
	public Response doPut(String url, String payload, String token);
	public Response doDelete(String url);
	

}
