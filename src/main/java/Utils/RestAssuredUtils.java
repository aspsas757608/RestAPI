package Utils;

import io.restassured.path.json.JsonPath;

public class RestAssuredUtils {
	
	public static String getStringJsonValue(String res, String key) {
		
		JsonPath jsonPath = new JsonPath(res);
		String value = jsonPath.getString(key);
		return value;
		
	}
	
public static int getIntJsonValue(String res,String key) {
		
		JsonPath jsonPath = new JsonPath(res);
		int value = jsonPath.getInt(key);
		return value;
		
	}

}
